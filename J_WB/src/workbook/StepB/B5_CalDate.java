package workbook.StepB;

import java.util.Scanner;

public class B5_CalDate {
	private int days;
	private int seconds;
	private int count;

	/** ������ **/
	public B5_CalDate() {
		input();
	}

	/** �� ��� **/
	public void printDate() {
		System.out.println("�� ���� �ش�Ǵ� �ð��� ��� " + getSecond() + " ���Դϴ�.");
		if (count > 0) {
			System.out.println("100�� �ʰ� ��� " + getCount() + " ���̳� ���Ե˴ϴ�.");
		}
	}

	/** �� �Է� **/
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ���� �Է��ϼ���. ");
		days = sc.nextInt();
	}

	/** �� ��� **/
	int getSecond() {
		seconds = days * 24 * 60 * 60;
		return seconds;
	}

	int getCount() {
		count = seconds / 1000000;
		return count;
	}

}
