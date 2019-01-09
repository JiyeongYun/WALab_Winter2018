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
				System.out.print("�߸��Է��ϼ̽��ϴ�.");
			}
		}
		System.out.println("����Ǿ����ϴ�.");
	}

	int showMenu() {
		System.out.println("\n\n-------------------------------------------------");
		System.out.print("1)�ֹ�  2)����  3)����Ʈ  4)���� ==> ");
		int in = sc.nextInt();
		System.out.println("-------------------------------------------------");
		return in;
	}

	void inputInfo() {
		System.out.print("�մ� ���� �Է��ϼ��� : ");
		int num = sc.nextInt();

		System.out.print("������ũ, ���İ�Ƽ, �Ľ�Ÿ�� ������ �Է��ϼ��� : ");
		int st = sc.nextInt();
		int sp = sc.nextInt();
		int pa = sc.nextInt();

		System.out.print("����� ī�尡 �ֽ��ϱ�?(Y:����) ");
		String member = sc.next();

		SimpleDateFormat f = new SimpleDateFormat("YYYY�� MM�� dd�� hh:mm", Locale.KOREA);
		String date = f.format(new Date());

		System.out.println("������ �ð��� " + date + "�Դϴ�.");

		idx++;
		cusArr.add(new Customer(num, st, sp, pa, member, date));
		cusArr.get(idx).pay = getPay(idx);

		System.out.println("�� �ݾ��� " + cusArr.get(idx).pay + "���Դϴ�.");

	}

	int getPay(int i) {
		Customer temp = cusArr.get(i);
		int pay = (temp.steak_num * STEAK) + (temp.spaghetti_num * SPAGHETTI) + (temp.pasta_num * PASTA);

		// ����� ����
		if (temp.member.equalsIgnoreCase("Y")) {
			pay = (int) (pay * 0.9);
		}
		// �����
		if (pay < 100000) {
			pay = (int) (pay * 1.07);
		} else {
			pay = (int) (pay * 1.1);
		}

		pay = (int) (pay * 1.1);

		return pay;
	}

	void printList() {
		System.out.println("��ȣ\t �մԼ�\t ������ũ\t ���İ�Ű\t �Ľ�Ÿ\t �����\t �����ݾ�\t ����ð�");
		for (int i = 0; i < cusArr.size(); i++) {
			Customer temp = cusArr.get(i);
			System.out.printf("[%d]\t %d\t %d\t %d\t %d\t %s\t %d\t %s\n", (i + 1), temp.num, temp.steak_num,
					temp.spaghetti_num, temp.pasta_num, temp.member, temp.pay, temp.date);
		}
	}

	void removeList() {
		System.out.println("==> �����Ͻ� ��ȣ�� �Է��ϼ��� : ");
		int n = sc.nextInt();
		cusArr.remove(n - 1);
		System.out.print("�����Ϸ�Ǿ����ϴ�.");
	}
}
