package workbook.StepD;

import java.util.Scanner;

public class D01 {
	private int number;
	private int totalsum;

	/** ������ **/
	public D01() {
		input();
	}

	/** �� ��� **/
	public void printTotal() {
		System.out.println("1���� �Է��� ���ڱ����� ��� ������ ���� ���� " + getTotal() + " �Դϴ�.");
	}

	/** �� �Է� **/
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���: ");
		number = sc.nextInt();
	}

	/** �� ��� **/
	int getTotal() {
		totalsum = 0;
		for (int i = 1; i <= number; i++) {
			totalsum += i;
		}
		return totalsum;
	}
}
