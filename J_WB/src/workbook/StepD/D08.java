package workbook.StepD;

import java.util.Scanner;

public class D08 {
	private int a;
	private int b;
	private int c;
	private int x_begin;
	private int x_end;
	private int x;
	private int y;

	/** ������ **/
	public D08() {
		input();
	}

	/** �� ��� **/
	public void printResult() {
		for (int i = x_begin; i <= x_end; i++) {
			x = i;
			y = getY(x);
			System.out.println("��ǥ (" + x + ", " + y + ")");
		}
	}

	/** �� �Է� **/
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1�� �Լ� y=ax^2+bx+c�� ��� a�� b, c�� �Է��ϼ���: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		System.out.print("x��ǥ�� ���� ���� �� ���� �Է��Ͻÿ�: ");
		x_begin = sc.nextInt();
		x_end = sc.nextInt();
	}

	/** �� ��� **/
	int getY(int x) {
		y = (a * x * x) + (b * x) + c;
		return y;
	}
}
