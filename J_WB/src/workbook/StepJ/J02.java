package workbook.StepJ;

import java.util.Scanner;

public class J02 {
	private double[] num = new double[10];
	private double max;
	private double min;

	/** 생성자 **/
	public J02() {
		input();
	}

	/** 결과 출력 **/
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
		System.out.printf("가장 큰 점수와 가장 작은 점수를 제외한 8개의 점수에 대한 평균은 %.1f 입니다.\n",average);
	}

	/** 갑 입력 **/
	void input() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < num.length; i++) {
			System.out.print((i + 1) + "번 심사점수를 입력하세요. ");
			num[i] = sc.nextDouble();
		}

		max = Max(num);
		min = Min(num);
	}

	/** 가장 큰 수 구하기 **/
	double Max(double num[]) {
		double temp = num[0];
		for (int i = 1; i < num.length; i++) {
			if (temp < num[i]) {
				temp = num[i];
			}
		}
		return temp;
	}

	/** 가장 작은 수 구하기 **/
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
