package workbook.StepA;

import java.util.Scanner;

public class A4_PyungArea {
	private double m2_area;
	private double pyung_area;

	/** ������ **/
	public A4_PyungArea() {
		input();
	}

	/** �� ��� **/
	public void printArea() {
		System.out.printf("����Ʈ�� ������ %.1f �Դϴ�.", getArea());
	}

	/** �� �Է� **/
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("����Ʈ�� �о� ������ �Է��Ͻÿ�. ");
		this.m2_area = sc.nextDouble();
	}

	/** �� ��� **/
	double getArea() {
		pyung_area = m2_area / 3.305;
		return this.pyung_area;
	}
}
