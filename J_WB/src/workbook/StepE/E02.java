package workbook.StepE;

import java.util.Scanner;

public class E02 {
	private int height;
	private int blank;

	/** ������ **/
	public E02() {
		input();
	}

	/** �� ��� **/
	public void printTriangle() {
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= height; i++) {
				if (i <= height - i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

	/** �� �Է� **/
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ﰢ���� ���̿� ���� ������ ũ�⸦ �Է��ϼ���: ");
		height = sc.nextInt();
		blank = sc.nextInt();
	}
}
