package workbook.StepC;

import java.util.Scanner;

public class C04 {
	private double m2_area;
	private double pyung_area;

	/** ������ **/
	public C04() {
		input();
	}

	/** �� ��� **/
	public void printArea() {
		System.out.printf("����Ʈ�� ������ %.1f �Դϴ�.\n", getArea());
		if (getArea() < 15) {
			System.out.println("���� ����Ʈ�Դϴ�.");
		} else if (getArea() >= 15 && getArea() < 30) {
			System.out.println("�߼��� ����Ʈ�Դϴ�.");
		} else if (getArea() >= 30 && getArea() < 50) {
			System.out.println("���� ����Ʈ�Դϴ�.");
		} else if (getArea() >= 50) {
			System.out.println("���� ����Ʈ�Դϴ�.");
		}
	}

	/** �� �Է� **/
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("����Ʈ�� �о� ����(��������)�� �Է��ϼ���: ");
		m2_area = sc.nextDouble();
	}

	/** �� ��� **/
	double getArea() {
		pyung_area = m2_area / 3.305;
		return pyung_area;
	}
}
