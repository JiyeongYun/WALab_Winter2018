package workbook.StepA;

import java.util.Scanner;

public class A6_TotalAndAvg {
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double average;

	/** ������ **/
	public A6_TotalAndAvg() {
		input();
	}

	/** �� ��� **/
	public void printResult() {
		System.out.println("�Է��Ͻ� ������ ������ " + getTotal() + " �̰�,");
		System.out.printf("����� %.1f �Դϴ�.", getAvg());
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
		average = total / 3.0;
		return average;
	}
}
