package workbook.StepC;

import java.util.Scanner;

public class C05 {
	private int month;
	private int day;
	private int day_count;

	/** ������ **/
	public C05() {
		input();
	}

	/** �� ��� **/
	public void printDate() {
		// ��¥�� �߸� �Է��� ���
		if (month < 0 || month > 12 || day < 0) {
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
		}
		// �ش� ���� �°� �ϼ��� �߸� �Է��� ���
		else if (month == 2 && day > 28) {
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
		} else if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
				&& (day > 31)) {
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
		} else if ((month == 4 || month == 6 || month == 9 || month == 11) && (day > 30)) {
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
		} else {
			System.out.println("�� ��¥�� 1�� �� " + getDate() + "��° ���� �ش�˴ϴ�.");
		}
	}

	/** �� �Է� **/
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է��ϼ���: ");
		month = sc.nextInt();
		System.out.println("���� �Է��ϼ���: ");
		day = sc.nextInt();
	}

	/** �� ��� **/
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
