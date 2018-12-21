package workbook.StepA;

import java.util.Scanner;

public class A6_TotalAndAvg {
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double average;

	/** 생성자 **/
	public A6_TotalAndAvg() {
		input();
	}

	/** 값 출력 **/
	public void printResult() {
		System.out.println("입력하신 점수의 총점은 " + getTotal() + " 이고,");
		System.out.printf("평균은 %.1f 입니다.", getAvg());
	}

	/** 갑 입력 **/
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수를 입력하세오. ");
		kor = sc.nextInt();
		System.out.print("영어 점수를 입력하세오. ");
		eng = sc.nextInt();
		System.out.print("수학 점수를 입력하세오. ");
		math = sc.nextInt();
	}

	/** 값 계산 **/
	int getTotal() {
		total = kor + eng + math;
		return total;
	}

	double getAvg() {
		average = total / 3.0;
		return average;
	}
}
