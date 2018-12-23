package workbook.StepF;

import java.util.Scanner;

public class F05 {
	private int height;
	private int weight;
	private double bmi;
	private int[][] bmilist = new int[10][3];
	private int count;
	
	/** ������ **/
	public F05() {
		input();
	}

	/** �� ��� **/
	public void printOverBMI() {
		count = 0;
		for (int i = 0; i < bmilist.length; i++) {
			if(bmilist[i][2]>=25) {
				System.out.println((i+1)+"��° ����� ���Դϴ�.");
				count++;
			}
		}
		System.out.println("�� "+count+"���� ����� ���Դϴ�.");
	}

	/** �� �Է� **/
	void input() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < bmilist.length; i++) {
			System.out.print((i+1) + "��° ����� ����(cm)�� ü��(kg)�� �Է��ϼ���: ");
			bmilist[i][0] = sc.nextInt();
			bmilist[i][1] = sc.nextInt();
			bmilist[i][2] = getBMI(bmilist[i][0], bmilist[i][1]);
		}
	}

	/** �� ��� **/
	int getBMI(int h, int w) {
		bmi = w /((h * 0.01) * (h * 0.01));; 
		return (int)bmi;
	}
	
}
