package workbook.StepI;

import java.util.Scanner;

public class I07 {
	private int count = 0; // 구매한 횟수
	private int total = 0; // 구매한 전체 가격
	private int price[] = { 700, 300, 1000, 500, 600 }; // 메뉴별 가격
	Scanner sc;

	/** 생성자 **/
	public I07() {
		sc = new Scanner(System.in);
		input();
	}

	/** 갑 입력 **/
	void input() {
		String more;

		while (true) {
			total += SelectCan();
			count++;

			System.out.print("더 필요하십니까?(Y/N) ");
			more = sc.next();

			if (more.equalsIgnoreCase("N")) {
				break;
			}
		}
		System.out.println(count + "개의 음료를 선택하여 총 " + total + "원입니다.");
	}

	int SelectCan() {
		System.out.println("1.콜라(700원) 2.원두커피(300원) 3.레몬주스(1000원)");
		System.out.println("4.홍차(500원) 5.코코아(600원)");
		System.out.print("메뉴를 선택해주세요 : ");
		int input = sc.nextInt();
		return price[input - 1];
	}

}
