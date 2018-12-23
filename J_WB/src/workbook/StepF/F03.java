package workbook.StepF;

import java.util.Scanner;

public class F03 {
	private int[][] jumsum = new int[5][3];
	private int[] sum = { 0, 0, 0 };
	private double[] average = { 0, 0, 0 };
	private int kor;
	private int eng;
	private int math;

	/** ������ **/
	public F03() {
		input();
	}

	/** �� ��� **/
	public void printScore() {
		setSum();
		setAvg();
		System.out.printf("������ ������ %d�̰�, ����� %.1f �Դϴ�.\n", sum[0], average[0]);
		System.out.printf("������ ������ %d�̰�, ����� %.1f �Դϴ�.\n", sum[1], average[1]);
		System.out.printf("������ ������ %d�̰�, ����� %.1f �Դϴ�.\n", sum[2], average[2]);
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
			sum[0] += jumsum[i][0]; // ����
			sum[1] += jumsum[i][1]; // ����
			sum[2] += jumsum[i][2]; // ����
		}
	}

	void setAvg() {
		for (int i = 0; i < sum.length; i++) {
			average[i] = sum[i] / 5.0;
		}
	}

}
