package workbook.StepF;

import java.util.Scanner;

public class F07 {
	private int number[][] = new int[5][3];
	private int floor_total[] = { 0, 0, 0, 0, 0 };
	private int line_total[] = { 0, 0, 0 };
	private int total;

	/** ������ **/
	public F07() {
		input();
	}

	/** �� ��� **/
	public void printNum() {
		for (int i = 0; i < floor_total.length; i++) {
			System.out.println((i + 1) + "���� ��� �����ڴ� ��� " + floor_total[i] + "�� �Դϴ�.");
		}
		System.out.println();
		for (int j = 0; j < line_total.length; j++) {
			System.out.println((j + 1) + "ȣ ���ο� ��� �����ڴ� ��� " + line_total[j] + "�� �Դϴ�.");
		}
		System.out.println("\n�� ����Ʈ�� ��� �����ڴ� ��� " + total + "�� �Դϴ�.");
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
				floor_total[i] += number[i][j];
				line_total[j] += number[i][j];
			}
		}
	}
}
