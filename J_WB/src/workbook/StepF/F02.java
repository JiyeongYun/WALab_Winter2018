package workbook.StepF;

import java.util.Scanner;

public class F02 {
	private double[] score = new double[10];
	private double maxscore;
	private double minscore;
	private double total;
	private double average;

	/** ������ **/
	public F02() {
		input();
	}

	/** �� ��� **/
	public void printScore() {
		System.out.printf("���� ū ������ ���� ���� ������ ������ 8���� ������ ���� ����� %.1f �Դϴ�.", getAvg());
	}

	/** �� �Է� **/
	void input() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < score.length; i++) {
			System.out.print((i + 1) + "�� �ɻ������� �Է��ϼ���: ");
			score[i] = sc.nextDouble();
		}
	}

	/** �� ��� **/
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