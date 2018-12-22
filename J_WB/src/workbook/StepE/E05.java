package workbook.StepE;

import java.util.Scanner;

public class E05 {
	private int mode;
	private int column;

	/** ������ **/
	public E05() {
		input();
	}

	/** �� ��� **/
	public void printGugu() {
		if (mode == 1) {
			mode = 3;
		}

		for (int i = mode; i <= 9; i += 2) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d X %d = %d\t", i, j, i * j);
				if (j % column == 0) {
					System.out.println();
				}
			}
			System.out.println();
		}

	}

	/** �� �Է� **/
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�������� ��¸��(1:Ȧ����, 2:¦����)�� �Է��ϼ���: ");
		mode = sc.nextInt();
		System.out.print("�� �ٿ� ����� ������ �Է��ϼ���: ");
		column = sc.nextInt();
	}
}
