package workbook.StepI;

import java.util.Scanner;

public class I05 {
	private int maxArr[] = new int[10];

	/** ������ **/
	public I05() {
		input();
	}

	/** �� �Է� **/
	void input() {

		Scanner sc = new Scanner(System.in);
		System.out.println("10���� ���� �� �ִ��� ���մϴ�.");
		for (int i = 0; i < 10; i++) {
			System.out.print((i + 1) + "�� ���� �Է��Ͻÿ�: ");
			maxArr[i] = sc.nextInt();
		}

		System.out.println("�ִ��� " + MaxOfTen() + "�Դϴ�.");

	}

	/** �ִ� ��� **/
	int MaxOfTen() {
		int max = maxArr[0];
		for (int i = 1; i < maxArr.length; i++) {
			if (max < maxArr[i]) {
				max = maxArr[i];
			}
		}

		return max;
	}
}
