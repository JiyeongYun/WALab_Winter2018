package workbook.StepC;

import java.util.Scanner;

public class C08 {
	private int num1;
	private int num2;
	private int num3;
	private int max_num;
	private int min_num;

	/** ������ **/
	public C08() {
		input();
	}

	/** �� ��� **/
	public void printNum() {
		System.out.println("���� ū ���� " + getMaxNum() + " �̰�, ���� ���� ���� " + getMinNum() + " �Դϴ�.");
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

	/** �� ��� **/
	int getMaxNum() {
		max_num = num1;
		if (max_num < num2) {
			max_num = num2;
		}
		if (max_num < num3) {
			max_num = num3;
		}
		return max_num;
	}

	int getMinNum() {
		min_num = num1;
		if (min_num > num2) {
			min_num = num2;
		}
		if (min_num > num3) {
			min_num = num3;
		}
		return min_num;
	}
}
