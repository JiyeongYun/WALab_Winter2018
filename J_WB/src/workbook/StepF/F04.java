package workbook.StepF;

import java.util.Scanner;

public class F04 {
	private int[][] jumsum = new int [5][3];
	private int[] sum = {0,0,0,0,0};
	private double[] average = {0,0,0,0,0};
	private int kor;
	private int eng;
	private int math;
	
	/** ������ **/
	public F04() {
		input();
	}

	/** �� ��� **/
	public void printScore() {
		setSum();
		setAvg();
		for(int i = 0; i<average.length; i++) {
			System.out.printf("%d�� �л��� ������ %d�̰�, ����� %.1f �Դϴ�.\n", i, sum[i], average[i]);	
		}
	}

	/** �� �Է� **/
	void input() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < jumsum.length; i++) {
			System.out.print(i + 1 + "�� �л� ����, ����, ���� ������ �Է��ϼ���: ");
			jumsum[i][0] = sc.nextInt();
			jumsum[i][1] = sc.nextInt();
			jumsum[i][2] = sc.nextInt();
		}
	}

	/** �� ��� **/
	void setSum() {
		for (int i = 0; i < jumsum.length; i++) {
			sum[i] += jumsum[i][0]; // ����
			sum[i] += jumsum[i][1]; // ����
			sum[i] += jumsum[i][2]; // ����
		}
	}

	void setAvg() {
		for (int i = 0; i < sum.length; i++) {
			average[i] = sum[i] / 3.0;
		}
	}

}
