package workbook.StepB;

import java.util.Scanner;

public class B4_ApartSize {
	private double m2_area;
	private double pyung_area;

	/** ������ **/
	public B4_ApartSize() {
		input();
	}

	/** �� ��� **/
	public void printArea() {
		System.out.printf("����Ʈ�� ������ %.1f �̰�,\n", getPArea());
		if (getPArea() < 30) {
			System.out.println("30�� �̸��̹Ƿ� ���� ����Ʈ�Դϴ�.");
		} else {
			System.out.println("30�� �̻��̹Ƿ� ū ����Ʈ�Դϴ�.");
		}
	}

	/** �� �Է� **/
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("����Ʈ�� �о� ������ �Է��Ͻÿ�. ");
		m2_area = sc.nextDouble();
	}

	/** �� ��� **/
	double getPArea() {
		pyung_area = m2_area / 3.305;
		return pyung_area;
	}

}
