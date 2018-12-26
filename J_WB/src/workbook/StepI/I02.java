package workbook.StepI;

import java.util.Scanner;

public class I02 {
	private char ch;
	private int size;
	private int blank;

	/** ������ **/
	public I02() {
		input();
	}

	/** �� ��� **/
	public void printResult() {
		PrintCharWithBlank(size, blank, ch);
	}

	/** �� �Է� **/
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ﰢ���� �׸��µ� ����� ���ڸ� �Է��Ͻÿ�: ");
		ch = sc.nextLine().charAt(0);
		System.out.print("���� �ﰢ���� ���̿� ���� ������ ũ�⸦ �Է��Ͻÿ�: ");
		size = sc.nextInt();
		blank = sc.nextInt();
	}

	/** �ﰢ�� ��� **/
	void PrintCharWithBlank(int size, int blank, char ch) {
		for (int i = 1; i <= size; i++) {

			for (int j = 0; j < blank; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= size; j++) {
				if (j <= size - i) {
					System.out.print(" ");
				} else {
					System.out.print(ch);
				}
			}

			System.out.println();
		}
	}
}
