package workbook.StepC;

import java.util.Scanner;

public class C06 {
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double average;

	/** ������ **/
	public C06() {
		input();
	}

	/** �� ��� **/
	public void printScore() {
		System.out.println("�Է��Ͻ� ������ ������ " + getTotal() + "�̰�,");
		System.out.printf("����� %.1f �Դϴ�.\n", getAvg());
		if (getAvg() >= 90) {
			System.out.println("�� �Դϴ�.");
		} else if (getAvg() >= 80 && getAvg() < 90) {
			System.out.println("�� �Դϴ�.");
		} else if (getAvg() >= 70 && getAvg() < 80) {
			System.out.println("�� �Դϴ�.");
		} else if (getAvg() >= 60 && getAvg() < 70) {
			System.out.println("�� �Դϴ�.");
		} else if (getAvg() < 60) {
			System.out.println("�� �Դϴ�.");
		}
	}

	/** �� �Է� **/
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ������ �Է��ϼ���. ");
		kor = sc.nextInt();
		System.out.print("���� ������ �Է��ϼ���. ");
		eng = sc.nextInt();
		System.out.print("���� ������ �Է��ϼ���. ");
		math = sc.nextInt();
	}

	/** �� ��� **/
	int getTotal() {
		total = kor + eng + math;
		return total;
	}

	double getAvg() {
		average = getTotal() / 3.0;
		return average;
	}
}
