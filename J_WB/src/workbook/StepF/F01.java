package workbook.StepF;

import java.util.Scanner;

public class F01 {
	private int[] num = new int[10];

	/** ������ **/
	public F01() {
		input();
	}

	/** �� ��� **/
	public void printSecond() {
		int first = num[0];
		int second = num[0];
		int second_max_index = 0;

		for (int i = 0; i < num.length; i++) {
			if (first < num[i]) {
				first = num[i];
			}
		}
		for (int i = 0; i < num.length; i++) {
			if (num[i] < first && second < num[i]) {
				second = num[i];
				second_max_index = i;
			}
		}

		System.out.println("�� ��°�� ū ���� " + (second_max_index + 1) + "��° �� " + second + "�Դϴ�.");
	}

	/** �� �Է� **/
	void input() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < num.length; i++) {
			System.out.print((i + 1) + "��° ���� �Է��ϼ���: ");
			num[i] = sc.nextInt();
		}
	}

}
