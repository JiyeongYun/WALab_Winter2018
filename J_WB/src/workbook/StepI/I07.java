package workbook.StepI;

import java.util.Scanner;

public class I07 {
	private int count = 0; // ������ Ƚ��
	private int total = 0; // ������ ��ü ����
	private int price[] = { 700, 300, 1000, 500, 600 }; // �޴��� ����
	Scanner sc;

	/** ������ **/
	public I07() {
		sc = new Scanner(System.in);
		input();
	}

	/** �� �Է� **/
	void input() {
		String more;

		while (true) {
			total += SelectCan();
			count++;

			System.out.print("�� �ʿ��Ͻʴϱ�?(Y/N) ");
			more = sc.next();

			if (more.equalsIgnoreCase("N")) {
				break;
			}
		}
		System.out.println(count + "���� ���Ḧ �����Ͽ� �� " + total + "���Դϴ�.");
	}

	int SelectCan() {
		System.out.println("1.�ݶ�(700��) 2.����Ŀ��(300��) 3.�����ֽ�(1000��)");
		System.out.println("4.ȫ��(500��) 5.���ھ�(600��)");
		System.out.print("�޴��� �������ּ��� : ");
		int input = sc.nextInt();
		return price[input - 1];
	}

}
