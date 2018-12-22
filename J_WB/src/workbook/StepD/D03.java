package workbook.StepD;

import java.util.Scanner;

public class D03 {
	private int number;
	private int count = 0;
	private int totalsum;
	private double average;

	/** ������ **/
	public D03() {
		input();
	}

	/** �� ��� **/
	public void printResult() {
		System.out.println("�Է���" + count + " ���� ���ڵ��� ���հ�� " + totalsum + " �̰�, ��� ���� " + getAvg() + " �Դϴ�.");
	}
 
	/** �� �Է� **/
	void input() {
		Scanner sc = new Scanner(System.in);
		totalsum = 0;
		while (true) {
			System.out.print("0���� 100 ������ ���ڸ� �Է��ϼ���: ");
			number = sc.nextInt();
			if (number < 0 || number > 100) {
				break;
			}
			totalsum += number;
			count++;
		}
	}

	/** �� ��� **/
	double getAvg() {
		average = (double) totalsum / (double) count;
		return average;
	}
}
