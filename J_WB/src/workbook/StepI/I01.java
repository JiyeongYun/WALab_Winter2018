package workbook.StepI;

import java.util.Scanner;

public class I01 {

	/** ������ **/
	public I01() {
		input();
	}

	/** �� �Է� **/
	void input() {
		int menu;
		int total = 0;
		int price[] = { 15000, 10000, 7000, 2000 };

		Scanner sc = new Scanner(System.in);
		while (true) {
			ShowMenu();
			System.out.print("�޴��� �������ּ���.(����:5) ");
			menu = sc.nextInt();
			while (menu < 1 || 5 < menu) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				System.out.print("�޴��� �������ּ���.(����:5) ");
				menu = sc.nextInt();
			}

			if (menu == 5) {
				System.out.println("��������� �ֹ� �ݾ��� " + total + "���Դϴ�.\n");
				break;
			}
			
			total += price[menu - 1];
			System.out.println("��������� �ֹ� �ݾ��� " + total + "���Դϴ�.\n");
			
		}
		System.out.println("\n�� �ֹ� �ݾ��� " + total + "���Դϴ�.");

	}

	/** �� ��� **/
	void ShowMenu() {
		System.out.println("1.����(15,000��) 2.���İ�Ƽ(10,000��) 3.������(7,000��) 4.�����(2,000��)");
	}
}
