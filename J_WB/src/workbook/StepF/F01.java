package workbook.StepF;

import java.util.Scanner;

public class F01 {
	private int[] num = new int[10];
	private int first;
	private int second;
	private int second_max_index;

	/** ������ **/
	public F01() {
		input();
	}

	/** �� ��� **/
	public void printSecond() {
		first = num[0];
		second = num[0];
		second_max_index = 0;
		for (int i = 0; i < num.length; i++) {
			if (second < num[i]) {
				second = num[i];
				second_max_index = i + 1;
				if (first < num[i]) {
					first = num[i];

				}
			}
		}
		System.out.println("�� ��°�� ū ���� " + second_max_index + "��° �� " + second + "�Դϴ�.");
	}

	/** �� �Է� **/
	void input() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < num.length; i++) {
			System.out.print((i + 1) + "��° ���� �Է��ϼ���: ");
			num[i] = sc.nextInt();
		}
	}

	/** �� ��� **/

}
