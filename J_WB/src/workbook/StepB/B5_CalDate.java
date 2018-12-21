package workbook.StepB;

import java.util.Scanner;

public class B5_CalDate {
	private int days;
	private int seconds;
	private int count;

	/** 생성자 **/
	public B5_CalDate() {
		input();
	}

	/** 값 출력 **/
	public void printDate() {
		System.out.println("날 수에 해당되는 시간은 모두 " + getSecond() + " 초입니다.");
		if (count > 0) {
			System.out.println("100만 초가 모두 " + getCount() + " 번이나 포함됩니다.");
		}
	}

	/** 갑 입력 **/
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("날 수를 입력하세요. ");
		days = sc.nextInt();
	}

	/** 값 계산 **/
	int getSecond() {
		seconds = days * 24 * 60 * 60;
		return seconds;
	}

	int getCount() {
		count = seconds / 1000000;
		return count;
	}

}
