package workbook.StepI;

import java.util.Scanner;

public class I03 {
	private int i;

	/** ������ **/
	public I03() {
		input();
	}

	/** �� �Է� **/
	void input() {
		Scanner sc = new Scanner(System.in);
		for (i = 0; i < 10; i++) {
			System.out.print((i + 1) + "��° ����� ����(cm)�� ü��(kg)�� �Է��Ͻÿ�. ");
			int height = sc.nextInt();
			int weight = sc.nextInt();
			AskBiman(height, weight);
		}

	}

	/** �� ��� **/
	void AskBiman(int height, int weight) {
		double bmi = weight / ((height * 0.01) * (height * 0.01));
		if (bmi < 18.5) {
			System.out.println("��ü���Դϴ�.");
		} else if (18.5 <= bmi && bmi < 23) {
			System.out.println("�����Դϴ�.");
		} else if (23 <= bmi && bmi < 25) {
			System.out.println("��ü���Դϴ�.");
		} else if (25 <= bmi && bmi < 30) {
			System.out.println("�浵 ���Դϴ�.");
		} else if (30 <= bmi) {
			System.out.println("�� ���Դϴ�.");
		}
	}
}
