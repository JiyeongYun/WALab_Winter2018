package workbook.StepJ;

import java.util.Scanner;

public class J03 {
	private double[] degree_list = new double[10];
	private int[] num = { 0, 0, 0, 0 };

	/** ������ **/
	public J03() {
		input();
	}

	/** ��� ��� **/
	void printResult() {
		String name[] = { "�ü�", "�̿¼�", "�¼�", "���� ��" };
		for (int i = 0; i < degree_list.length; i++) {
			System.out.println((i + 1) + "�� ���� �µ��� " + degree_list[i] + "�� �Դϴ�.");
		}
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i] + "�Է� Ƚ���� " + num[i] + " �Դϴ�.");
		}
	}

	/** �� �Է� **/
	void input() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < degree_list.length; i++) {
			System.out.print((i + 1) + "��° ���� �µ��� �Է��Ͻÿ�. ");
			degree_list[i] = sc.nextDouble();
			num[AskWater(degree_list[i])]++;
		}

	}

	/** �� ��� **/
	byte AskWater(double degree) {
		if (0 <= degree && degree < 25) {
			return 0;
		} else if (25 <= degree && degree < 40) {
			return 1;
		} else if (40 <= degree && degree < 80) {
			return 2;
		} else {
			return 3;
		}
	}
}
