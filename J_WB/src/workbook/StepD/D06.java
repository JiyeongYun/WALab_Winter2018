package workbook.StepD;

import java.util.Scanner;

public class D06 {
	private double m2_area;
	private double pyung_area;
	private int count1 = 0;
	private int count2 = 0;
	private int count3 = 0;
	private int count4 = 0;
	private int i;

	/** ������ **/
	public D06() {
		input();
	}

	/** �� ��� **/
	public void printApart() {
		System.out.println("\"���� ����Ʈ\"�� ������ " + count1 + " �Դϴ�.");
		System.out.println("\"�߼��� ����Ʈ\"�� ������ " + count2 + " �Դϴ�.");
		System.out.println("\"���� ����Ʈ\"�� ������ " + count3 + " �Դϴ�.");
		System.out.println("\"���� ����Ʈ\"�� ������ " + count4 + " �Դϴ�.");
	}

	/** �� �Է� **/
	void input() {
		Scanner sc = new Scanner(System.in);
		for (i = 0; i < 10; i++) {
			System.out.print("����Ʈ�� �о� ����(��������)�� �Է��ϼ���: ");
			m2_area = sc.nextDouble();
			System.out.printf("--> ����Ʈ�� ������ %.1f �Դϴ�.\n", getArea());
			CheckApart();
		}
	}

	/** �� ��� **/
	double getArea() {
		pyung_area = m2_area / 3.305;
		return pyung_area;
	}

	void CheckApart() {
		if (getArea() < 15) {
			count1++;
		} else if (getArea() >= 15 && getArea() < 30) {
			count2++;
		} else if (getArea() >= 30 && getArea() < 50) {
			count3++;
		} else if (getArea() >= 50) {
			count4++;
		}
	}

}
