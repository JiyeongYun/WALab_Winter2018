package workbook.StepE;

import java.util.Scanner;

public class E06 {
	private int row;
	private int columns;
	private int number;
 
	/** ������ **/
	public E06() {
		input();
	}

	/** �� ��� **/
	public void printDimen() {
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= columns; j++) {
				System.out.print("\t" + j * i);
			}
			System.out.println();
		}
	}

	/** �� �Է� **/
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("����Ϸ��� ���� ũ��� ���� ũ�⸦ �Է��ϼ���: ");
		row = sc.nextInt();
		columns = sc.nextInt();
	}
}
