package workbook.StepJ;

import java.util.Scanner;

public class J04 {
	private int[] monthdays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private int date1;
	private int date2;

	/** ������ **/
	public J04() {
		input();
	}

	/** ��� ��� **/
	void printResult() {
		if (date1 == -1 || date2 == -1) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		} else if (date1 > date2) {
			System.out.println("�� ��¥�� ������ " + (date1 - date2) + "���Դϴ�.");
		} else {
			System.out.println("�� ��¥�� ������ " + (date2 - date1) + "���Դϴ�.");
		}
	}

	/** �� �Է� **/
	void input() {
		Scanner sc = new Scanner(System.in);

		System.out.print("ù��° ��¥�� �Է��ϼ���. (�� ��) ");
		int month = sc.nextInt();
		int day = sc.nextInt();
		date1 = CalDate(month, day);

		System.out.print("�ι�° ��¥�� �Է��ϼ���. (�� ��) ");
		month = sc.nextInt();
		day = sc.nextInt();
		date2 = CalDate(month, day);
	}

	/** �� ��� **/
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
