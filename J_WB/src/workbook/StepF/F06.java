package workbook.StepF;

import java.util.Scanner;

public class F06 {
	private int number[][] = new int[5][3];
	private int total;

	/** ������ **/
	public F06() {
		input();
	}

	/** �� ��� **/
	public void printNum() {
		System.out.println("�� ����Ʈ�� ��� �����ڴ� ��� " + total + "�� �Դϴ�.");
	}

	/** �� �Է� **/
	void input() {
		total = 0;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < number.length; i++) {
			for (int j = 0; j < number[i].length; j++) {
				System.out.print((i + 1) + "0" + (j + 1) + "ȣ�� ��� �ִ� ����� ���ڸ� �Է��ϼ���: ");
				number[i][j] = sc.nextInt();
				total += number[i][j];
			}
		}
	}
}
