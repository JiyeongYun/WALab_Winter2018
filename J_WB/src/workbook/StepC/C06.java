package workbook.StepC;

import java.util.Scanner;

public class C06 {
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double average;

	/** 생성자 **/
	public C06() {
		input();
	}

	/** 값 출력 **/
	public void printScore() {
		System.out.println("입력하신 점수의 총점은 " + getTotal() + "이고,");
		System.out.printf("평균은 %.1f 입니다.\n", getAvg());
		if (getAvg() >= 90) {
			System.out.println("수 입니다.");
		} else if (getAvg() >= 80 && getAvg() < 90) {
			System.out.println("우 입니다.");
		} else if (getAvg() >= 70 && getAvg() < 80) {
			System.out.println("미 입니다.");
		} else if (getAvg() >= 60 && getAvg() < 70) {
			System.out.println("양 입니다.");
		} else if (getAvg() < 60) {
			System.out.println("가 입니다.");
		}
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
		average = getTotal() / 3.0;
		return average;
	}
}
