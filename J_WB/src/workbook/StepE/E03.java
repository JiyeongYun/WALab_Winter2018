package workbook.StepE;

import java.util.Scanner;

public class E03 {
	private int height;

	/** ������ **/
	public E03() {
		input();
	}

	/** �� ��� **/
	public void printTriangle() {
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < height - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i * 2 + 1; j++) {
				System.out.print("*");
			}
			for (int j = 0; j < height - i; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}

	/** �� �Է� **/
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�̵ �ﰢ���� ���̸� �Է��ϼ���: ");
		height = sc.nextInt();
	}
}
