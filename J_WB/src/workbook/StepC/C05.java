package workbook.StepC;

import java.util.Scanner;

public class C05 {
	private int month;
	private int day;
	private int day_count;

	/** 생성자 **/
	public C05() {
		input();
	}

	/** 값 출력 **/
	public void printDate() {
		// 날짜를 잘못 입력한 경우
		if (month < 0 || month > 12 || day < 0) {
			System.out.println("잘못입력하셨습니다.");
		}
		// 해당 월에 맞게 일수를 잘못 입력한 경우
		else if (month == 2 && day > 28) {
			System.out.println("잘못입력하셨습니다.");
		} else if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
				&& (day > 31)) {
			System.out.println("잘못입력하셨습니다.");
		} else if ((month == 4 || month == 6 || month == 9 || month == 11) && (day > 30)) {
			System.out.println("잘못입력하셨습니다.");
		} else {
			System.out.println("이 날짜는 1년 중 " + getDate() + "번째 날에 해당됩니다.");
		}
	}

	/** 갑 입력 **/
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("월을 입력하세요: ");
		month = sc.nextInt();
		System.out.println("일을 입력하세요: ");
		day = sc.nextInt();
	}

	/** 값 계산 **/
	int getDate() {
		switch (month) {
		case 1:
			day_count = day;
			break;
		case 2:
			day_count = 31 + day;
			break;
		case 3:
			day_count = 31 + 28 + day;
			break;
		case 4:
			day_count = 31 + 28 + 31 + day;
			break;
		case 5:
			day_count = 31 + 28 + 31 + 30 + day;
			break;
		case 6:
			day_count = 31 + 28 + 31 + 30 + 31 + day;
			break;
		case 7:
			day_count = 31 + 28 + 31 + 30 + 31 + 30 + day;
			break;
		case 8:
			day_count = 31 + 28 + 31 + 30 + 31 + 30 + 31 + day;
			break;
		case 9:
			day_count = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + day;
			break;
		case 10:
			day_count = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + day;
			break;
		case 11:
			day_count = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + day;
			break;
		case 12:
			day_count = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + day;
			break;
		}

		return day_count;
	}
}
