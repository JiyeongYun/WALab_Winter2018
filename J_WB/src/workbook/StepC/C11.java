package workbook.StepC;

import java.util.Scanner;

public class C11 {
	private int year;

	/** 생성자 **/
	public C11() {
		input();
	}

	/** 값 출력 **/
	public void printLeap() {
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println("입력하신 년도는 윤년입니다.");
					return;
				}
				System.out.println("입력하신 년도는 윤년이 아닙니다.");
				return;
			}
			System.out.println("입력하신 년도는 윤년입니다.");
			return;
		}
		System.out.println("입력하신 년도는 윤년이 아닙니다.");
	}

	/** 갑 입력 **/
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("년도를 입력하세요. ");
		year = sc.nextInt();
	}
}
