package workbook.StepF;

import java.util.Scanner;

public class F04 {
	private int[][] jumsum = new int [5][3];
	private int[] sum = {0,0,0,0,0};
	private double[] average = {0,0,0,0,0};
	private int kor;
	private int eng;
	private int math;
	
	/** 생성자 **/
	public F04() {
		input();
	}

	/** 값 출력 **/
	public void printScore() {
		setSum();
		setAvg();
		for(int i = 0; i<average.length; i++) {
			System.out.printf("%d번 학생의 총점은 %d이고, 평균은 %.1f 입니다.\n", i, sum[i], average[i]);	
		}
	}

	/** 갑 입력 **/
	void input() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < jumsum.length; i++) {
			System.out.print(i + 1 + "번 학생 국어, 영어, 수학 점수를 입력하세요: ");
			jumsum[i][0] = sc.nextInt();
			jumsum[i][1] = sc.nextInt();
			jumsum[i][2] = sc.nextInt();
		}
	}

	/** 값 계산 **/
	void setSum() {
		for (int i = 0; i < jumsum.length; i++) {
			sum[i] += jumsum[i][0]; // 국어
			sum[i] += jumsum[i][1]; // 영어
			sum[i] += jumsum[i][2]; // 수학
		}
	}

	void setAvg() {
		for (int i = 0; i < sum.length; i++) {
			average[i] = sum[i] / 3.0;
		}
	}

}
