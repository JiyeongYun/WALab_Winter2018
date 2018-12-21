package workbook.StepB;

import java.util.Scanner;

public class B6_CalScore {
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double average;

	/** ������ **/
	public B6_CalScore() {
		input();
	}

	/** �� ��� **/
	public void printScore() {
		System.out.println("�Է��Ͻ� ������ ������ " + getTotal() + " �̰�,");
		System.out.printf("����� %.1f �Դϴ�.\n", getAvg());

		if (kor >= 90) {
			System.out.println("���������� ����մϴ�.");
		}
		if (eng >= 90) {
			System.out.println("���������� ����մϴ�.");
		}
		if (math >= 90) {
			System.out.println("���������� ����մϴ�.");
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
