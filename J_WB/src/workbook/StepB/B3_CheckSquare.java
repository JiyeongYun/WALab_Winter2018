package workbook.StepB;

import java.util.Scanner;

public class B3_CheckSquare {
	private int width;
	private int height;
	private int area;

	/** ������ **/
	public B3_CheckSquare() {
		input();
	}

	/** �� ��� **/
	public void printArea() {
		System.out.println("���簢���� ���̴� " + getArea() + "�̰�");
		if (width == height) {
			System.out.println("���簢���Դϴ�.");
		} else {
			System.out.println("���簢���� �ƴմϴ�.");
		}
	}

	/** �� �Է� **/
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���簢���� ���� ũ�⸦ �Է��ϼ���. ");
		width = sc.nextInt();
		System.out.print("���簢���� ���� ũ�⸦ �Է��ϼ���. ");
		height = sc.nextInt();
	}

	/** �� ��� **/
	int getArea() {
		area = width * height;
		return area;
	}
}
