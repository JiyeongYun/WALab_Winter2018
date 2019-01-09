package workbook.StepL;

import java.util.*;
import java.text.SimpleDateFormat;

class Customer {
	int num;
	int steak_num, spaghetti_num, pasta_num;
	String member;
	String date;
	int pay;

	Customer(int num, int steak_num, int spaghetti_num, int pasta_num, String member, String date) {
		this.num = num;
		this.steak_num = steak_num;
		this.spaghetti_num = spaghetti_num;
		this.pasta_num = pasta_num;
		this.member = member;
		this.date = date;
	}

}

public class L03 {
	final int STEAK = 25000;
	final int SPAGHETTI = 15000;
	final int PASTA = 17000;
	ArrayList<Customer> cusArr = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	int idx = -1;

	public void main() {
		while (true) {
			int input = showMenu();
			if (input == 1) {
				inputInfo();
			} else if (input == 2) {
				printList();
				removeList();
			} else if (input == 3) {
				printList();
				
			} else if (input == 4) {
				break;
			} else {
				System.out.print("잘못입력하셨습니다.");
			}
		}
		System.out.println("종료되었습니다.");
	}

	int showMenu() {
		System.out.println("\n\n-------------------------------------------------");
		System.out.print("1)주문  2)결제  3)리스트  4)종료 ==> ");
		int in = sc.nextInt();
		System.out.println("-------------------------------------------------");
		return in;
	}

	void inputInfo() {
		System.out.print("손님 수를 입력하세요 : ");
		int num = sc.nextInt();

		System.out.print("스테이크, 스파게티, 파스타의 개수를 입력하세요 : ");
		int st = sc.nextInt();
		int sp = sc.nextInt();
		int pa = sc.nextInt();

		System.out.print("멤버쉽 카드가 있습니까?(Y:있음) ");
		String member = sc.next();

		SimpleDateFormat f = new SimpleDateFormat("YYYY년 MM월 dd일 hh:mm", Locale.KOREA);
		String date = f.format(new Date());

		System.out.println("들어오신 시간은 " + date + "입니다.");

		idx++;
		cusArr.add(new Customer(num, st, sp, pa, member, date));
		cusArr.get(idx).pay = getPay(idx);

		System.out.println("총 금액은 " + cusArr.get(idx).pay + "원입니다.");

	}

	int getPay(int i) {
		Customer temp = cusArr.get(i);
		int pay = (temp.steak_num * STEAK) + (temp.spaghetti_num * SPAGHETTI) + (temp.pasta_num * PASTA);

		// 멤버십 유무
		if (temp.member.equalsIgnoreCase("Y")) {
			pay = (int) (pay * 0.9);
		}
		// 봉사료
		if (pay < 100000) {
			pay = (int) (pay * 1.07);
		} else {
			pay = (int) (pay * 1.1);
		}

		pay = (int) (pay * 1.1);

		return pay;
	}

	void printList() {
		System.out.println("번호\t 손님수\t 스테이크\t 스파게키\t 파스타\t 멤버쉽\t 결제금액\t 입장시간");
		for (int i = 0; i < cusArr.size(); i++) {
			Customer temp = cusArr.get(i);
			System.out.printf("[%d]\t %d\t %d\t %d\t %d\t %s\t %d\t %s\n", (i + 1), temp.num, temp.steak_num,
					temp.spaghetti_num, temp.pasta_num, temp.member, temp.pay, temp.date);
		}
	}

	void removeList() {
		System.out.println("==> 결제하실 번호를 입력하세요 : ");
		int n = sc.nextInt();
		cusArr.remove(n - 1);
		System.out.print("결제완료되었습니다.");
	}
}
