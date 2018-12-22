package workbook.StepD;

import java.util.Scanner;

public class D03 {
	private int number;
	private int count = 0;
	private int totalsum;
	private double average;

	/** 생성자 **/
	public D03() {
		input();
	}

	/** 값 출력 **/
	public void printResult() {
		System.out.println("입력한" + count + " 개의 숫자들의 총합계는 " + totalsum + " 이고, 평균 값은 " + getAvg() + " 입니다.");
	}
 
	/** 갑 입력 **/
	void input() {
		Scanner sc = new Scanner(System.in);
		totalsum = 0;
		while (true) {
			System.out.print("0부터 100 사이의 숫자를 입력하세요: ");
			number = sc.nextInt();
			if (number < 0 || number > 100) {
				break;
			}
			totalsum += number;
			count++;
		}
	}

	/** 값 계산 **/
	double getAvg() {
		average = (double) totalsum / (double) count;
		return average;
	}
}
