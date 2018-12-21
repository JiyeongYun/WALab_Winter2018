package workbook.StepA;

import java.util.Scanner;

public class A5_DayToSecond {
	private int days;
	private int seconds;

	/** 생성자 **/
	public A5_DayToSecond() {
		input();
	}

	/** 값 출력 **/
	public void printSeconds() {
		System.out.println("날 수에 해당되는 시간은 모두 " + getSeconds() + " 초입니다.");
	}

	/** 갑 입력 **/
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("날 수를 입력하세요. ");
		this.days = sc.nextInt();
	}

	/** 값 계산 **/
	int getSeconds() {
		seconds = days * 24 * 60 * 60;
		return this.seconds;
	}
}
