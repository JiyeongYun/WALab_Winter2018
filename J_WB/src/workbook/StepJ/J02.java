package workbook.StepJ;

import java.util.Scanner;

public class J02 {
	private double[] num = new double[10];
	private double max;
	private double min;

	/** ������ **/
	public J02() {
		input();
	}

	/** ��� ��� **/
	void printResult() {
		double average;
		double sum=0;
		for(int i = 0; i < num.length; i++ ) {
			if(num[i] == max || num[i] == min) {
				continue;
			}
			sum+=num[i];
		}
		average = sum/8;
		System.out.printf("���� ū ������ ���� ���� ������ ������ 8���� ������ ���� ����� %.1f �Դϴ�.\n",average);
	}

	/** �� �Է� **/
	void input() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < num.length; i++) {
			System.out.print((i + 1) + "�� �ɻ������� �Է��ϼ���. ");
			num[i] = sc.nextDouble();
		}

		max = Max(num);
		min = Min(num);
	}

	/** ���� ū �� ���ϱ� **/
	double Max(double num[]) {
		double temp = num[0];
		for (int i = 1; i < num.length; i++) {
			if (temp < num[i]) {
				temp = num[i];
			}
		}
		return temp;
	}

	/** ���� ���� �� ���ϱ� **/
	double Min(double num[]) {
		double temp = num[0];
		for (int i = 1; i < num.length; i++) {
			if (num[i] < temp) {
				temp = num[i];
			}
		}
		return temp;
	}

}
