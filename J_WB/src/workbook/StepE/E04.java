package workbook.StepE;

import java.util.Scanner;

public class E04 {
	private int mode;

	/** ������ **/
	public E04() {
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
				if (j % 3 == 0) {
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
	}
}
