package workbook.StepI;

import java.util.Scanner;

public class I04 {
	private int menu;

	/** ������ **/
	public I04() {
		input();
	}

	/** �� �Է� **/
	void input() {

		int total = 0;

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1.����(15,000��) 2.���İ�Ƽ(10,000��) 3.������(7,000��) 4.�����(2,000��)");
			System.out.print("�޴��� �������ּ���.(����:5) ");
			menu = sc.nextInt();
			while (menu < 1 || 5 < menu) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				System.out.print("�޴��� �������ּ���.(����:5) ");
				menu = sc.nextInt();
			}

			if (SelectMenu() == -1) {
				break;
			}

			total += SelectMenu();
			System.out.println("��������� �ֹ� �ݾ��� " + total + "���Դϴ�.\n");

		}
		System.out.println("\n�� �ֹ� �ݾ��� " + total + "���Դϴ�.");

	}

	/** �� ��� **/
	int SelectMenu() {
		int price[] = { 15000, 10000, 7000, 2000, -1 };
		return price[menu - 1];
	}
}
