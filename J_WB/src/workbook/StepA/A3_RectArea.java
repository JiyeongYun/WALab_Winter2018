package workbook.StepA;

import java.util.Scanner;

public class A3_RectArea {
	private int width;
	private int height;
	private int area;

	/** ������ **/
	public A3_RectArea() {
		input();
	}

	/** �� ��� **/
	public void printArea() {
		System.out.println("���簢���� ���̴� " + getArea() + "�Դϴ�.");
	}

	/** �� �Է� **/
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���簢���� ���� ũ�⸦ �Է��ϼ���. ");
		this.width = sc.nextInt();
		System.out.print("���簢���� ���� ũ�⸦ �Է��ϼ���. ");
		this.height = sc.nextInt();
	}

	/** �� ��� **/
	int getArea() {
		area = width * height;
		return this.area;
	}
}
