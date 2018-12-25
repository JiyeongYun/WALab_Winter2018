package workbook.StepG;

import java.util.Scanner;

public class G06 {
	private int total_sale;
	private int price[] = { 10000, 6000, 3000 };

	/** ������ **/
	public G06() {
		input();
	}

	/** �� �Է� **/
	void input() {
		int total_order[] = { 0, 0, 0 };
		int order[] = { 0, 0, 0 };
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ������ ��ǰ�� �ֽ��ϴ�.");
		System.out.println("1.�����尩 1����, 2. ���尩 6õ��, 3. ����尩 3õ��)\n");

		while (true) {
			for (int i = 0; i < price.length; i++) {
				System.out.print((i + 1) + "�� ��ǰ�� ��� �����ϽǷ���? ");
				order[i] = sc.nextInt();
				total_order[i] += order[i];
			}
			if (order[0] == 0 && order[1] == 0 && order[2] == 0) {
				break;
			}

			System.out.println("�Ǹűݾ��� " + getSel(order[0], order[1], order[2]) + "���Դϴ�.\n");

		}

		for (int i = 0; i < total_order.length; i++) {
			System.out.println((i + 1) + "�� ��ǰ�� �� " + total_order[i] + "���� �����ϼ̽��ϴ�.");
		}
		System.out.println("���ݱ����� �� ����ݾ��� " + total_sale + "���Դϴ�.");
	}

	/** �� ��� **/
	int getSel(int n1, int n2, int n3) {
		int sel = 0;
		sel = (n1 * price[0]) + (n2 * price[1]) + (n3 * price[2]);
		total_sale += sel;
		return sel;
	}
}
