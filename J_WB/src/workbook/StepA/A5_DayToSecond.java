package workbook.StepA;

import java.util.Scanner;

public class A5_DayToSecond {
	private int days;
	private int seconds;

	/** ������ **/
	public A5_DayToSecond() {
		input();
	}

	/** �� ��� **/
	public void printSeconds() {
		System.out.println("�� ���� �ش�Ǵ� �ð��� ��� " + getSeconds() + " ���Դϴ�.");
	}

	/** �� �Է� **/
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ���� �Է��ϼ���. ");
		this.days = sc.nextInt();
	}

	/** �� ��� **/
	int getSeconds() {
		seconds = days * 24 * 60 * 60;
		return this.seconds;
	}
}
