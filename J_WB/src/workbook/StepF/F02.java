package workbook.StepF;

import java.util.Scanner;

public class F02 {
	private double[] score = new double[10];
	private double maxscore;
	private double minscore;
	private double total;
	private double average;

	/** 생성자 **/
	public F02() {
		input();
	}

	/** 값 출력 **/
	public void printScore() {
		System.out.printf("가장 큰 점수와 가장 작은 점수를 제외한 8개의 점수에 대한 평균은 %.1f 입니다.", getAvg());
	}

	/** 갑 입력 **/
	void input() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < score.length; i++) {
			System.out.print((i + 1) + "번 심사점수를 입력하세요: ");
			score[i] = sc.nextDouble();
		}
	}

	/** 값 계산 **/
	double getAvg() {
		setMax();
		setMin();
		total = 0;
		for (int i = 0; i < score.length; i++) {
			if (score[i] == maxscore || score[i] == minscore) {
				continue;
			}
			total += score[i];
		}
		average = total / 8;
		return average;
	}

	void setMax() {
		maxscore = score[0];
		for (int i = 0; i < score.length; i++) {
			if (score[i] > maxscore) {
				maxscore = score[i];
			}
		}

	}

	void setMin() {
		minscore = score[0];
		for (int i = 0; i < score.length; i++) {
			if (score[i] < minscore) {
				minscore = score[i];
			}
		}
	}

}