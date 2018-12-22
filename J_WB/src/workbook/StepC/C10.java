package workbook.StepC;

import java.util.Scanner;

public class C10 {
	private int num1;
	private int num2;
	private String operator;
	private int result;

	/** ������ **/
	public C10() {
		input();
	}

	/** �� ��� **/
	public void printResult() {
		System.out.println("������ ��� ���� " + getResult() + "�Դϴ�.");
	}

	/** �� �Է� **/
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("����1�� �Է��ϼ���. ");
		num1 = sc.nextInt();
		System.out.print("����2�� �Է��ϼ���. ");
		num2 = sc.nextInt();
		System.out.println("�����ȣ����('+', '-', '*', '/' �� 1��)�� �Է��ϼ���: ");
		operator = sc.next();
	}

	/** �� ��� **/
	int getResult() {
		if (operator.equals("+")) {
			result = num1 + num2;
		} else if (operator.equals("-")) {
			result = num1 - num2;
		} else if (operator.equals("*")) {
			result = num1 * num2;
		} else if (operator.equals("/")) {
			result = num1 / num2;
		}
		return result;
	}

}
