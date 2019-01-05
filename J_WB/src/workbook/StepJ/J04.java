package workbook.StepJ;

import java.util.Scanner;

public class J04 {
	private int[] monthdays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private int date1;
	private int date2;

	/** 생성자 **/
	public J04() {
		input();
	}

	/** 결과 출력 **/
	void printResult() {
		if (date1 == -1 || date2 == -1) {
			System.out.println("잘못 입력하셨습니다.");
		} else if (date1 > date2) {
			System.out.println("두 날짜의 간격은 " + (date1 - date2) + "일입니다.");
		} else {
			System.out.println("두 날짜의 간격은 " + (date2 - date1) + "일입니다.");
		}
	}

	/** 갑 입력 **/
	void input() {
		Scanner sc = new Scanner(System.in);

		System.out.print("첫번째 날짜를 입력하세요. (월 일) ");
		int month = sc.nextInt();
		int day = sc.nextInt();
		date1 = CalDate(month, day);

		System.out.print("두번째 날짜를 입력하세요. (월 일) ");
		month = sc.nextInt();
		day = sc.nextInt();
		date2 = CalDate(month, day);
	}

	/** 값 계산 **/
	int CalDate(int month, int day) {
		if (month < 1 || 12 < month || day < 1 || monthdays[month - 1] < day) {
			return -1;
		}

		int date = day;
		for (int i = 0; i < month - 1; i++) {
			date += monthdays[i];
		}
		return date;
	}
}
