package workbook.StepB;

import java.util.Scanner;

public class B9_CheckObesity {
	private int height;
	private int weight;
	private int bmi;

	/** ������ **/
	public B9_CheckObesity() {
		input();
	}

	/** �� ��� **/
	public void printObesity() {
		if (getBMI() >= 25) {
			System.out.println("����� ���̽ʴϴ�.");
		} else {
			System.out.println("����� ���� �ƴϱ���.");
		}
	}

	/** �� �Է� **/
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("����(cm����)�� �Է��ϼ��� ");
		height = sc.nextInt();
		System.out.print("ü��(kg����)�� �Է��ϼ��� ");
		weight = sc.nextInt();
	}

	/** �� ��� **/
	int getBMI() {
		bmi = weight / (int) ((height * 0.01) * (height * 0.01));
		return bmi;
	}

}
