package workbook.StepB;

import java.util.Scanner;

public class B8_VarCondition {
	private int num1;
	private int num2;
	private int num3;

	/** ������ **/
	public B8_VarCondition() {
		input();
	}

	/** �� ��� **/
	public void printConditional() {
		if (num1 == num2 || num2 == num3 || num3 == num1) {
			System.out.println("1�� ���� ���� : 3���� ���� �� ��� �� ���� ���� ����.");
		}
		if ((num1 > 50 && num2 > 50) || (num2 > 50 && num3 > 50) || (num3 > 50 && num1 > 50)) {
			System.out.println("2�� ���� ���� : 3���� ���� �� ��� �� ���� ũ�Ⱑ ��� 50���� ũ��.");
		}
		if ((num1 + num2 == num3) || (num2 + num3 == num1) || (num3 + num1 == num2)) {
			System.out.println("3�� ���� ���� : 3���� ���� �� � �� ���� ���� ������ �ϳ��� ���ڿ� ����.");
		}
		if ((num2 % num1 == 0 && num3 % num1 == 0) || (num1 % num2 == 0 && num3 % num2 == 0)
				|| (num1 % num3 == 0 && num2 % num3 == 0)) {
			System.out.println("4�� ���� ���� : 3���� ���� �� � �ϳ��� ���� �ٸ� �� ���� ������ ������ �������� ��찡 �ִ�.");
		}
	}

	/** �� �Է� **/
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ���ڸ� �Է��ϼ��� ");
		num1 = sc.nextInt();
		System.out.print("�ι�° ���ڸ� �Է��ϼ��� ");
		num2 = sc.nextInt();
		System.out.print("����° ���ڸ� �Է��ϼ��� ");
		num3 = sc.nextInt();
	}

}
