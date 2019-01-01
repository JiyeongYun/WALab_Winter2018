package workbook.StepF;

import java.util.Scanner;

public class F03 {
	private String subject[] = { "국어", "영어", "수학" };
	private int[][] jumsum = new int[5][3];
	private int[] sum = { 0, 0, 0 };
	private double[] average = { 0, 0, 0 };
	private int kor;
	private int eng;
	private int math;

	/** 생성자 **/
	public F03() {
		input();
	}

	/** 값 출력 **/
	public void printScore() {
		setSum();
		setAvg();
		for (int i = 0; i < subject.length; i++) {
			System.out.printf("%s의 총점은 %d이고, 평균은 %.1f 입니다.\n", subject[i], sum[i], average[i]);
		}
	}

	/** 갑 입력 **/
	void input() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < jumsum.length; i++) {
			System.out.print(i + 1 + "번 학생 국어, 영어, 수학 점수를 입력하세요: ");
			for(int j = 0; j< jumsum[0].length;j++) {
				jumsum[i][j] = sc.nextInt();
			}
		}
	}

	/** 값 계산 **/
	void setSum() {
		for (int i = 0; i < jumsum.length; i++) {
			for(int j = 0; j< jumsum[0].length;j++) {
				sum[j] += jumsum[i][j];
			}
		}
	}

	void setAvg() {
		for (int i = 0; i < sum.length; i++) {
			average[i] = sum[i] / 5.0;
		}
	}

}
