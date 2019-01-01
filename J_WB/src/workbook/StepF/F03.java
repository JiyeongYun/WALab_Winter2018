package workbook.StepF;

import java.util.Scanner;

public class F03 {
	private String subject[] = { "����", "����", "����" };
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
		for (int i = 0; i < subject.length; i++) {
			System.out.printf("%s�� ������ %d�̰�, ����� %.1f �Դϴ�.\n", subject[i], sum[i], average[i]);
		}
	}

	/** �� �Է� **/
	void input() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < jumsum.length; i++) {
			System.out.print(i + 1 + "�� �л� ����, ����, ���� ������ �Է��ϼ���: ");
			for(int j = 0; j< jumsum[0].length;j++) {
				jumsum[i][j] = sc.nextInt();
			}
		}
	}

	/** �� ��� **/
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
