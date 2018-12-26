package workbook.StepH;

import java.util.Scanner;
import java.util.Random;
import java.math.*;

public class H06 {
	private int number[] = new int[5];
	private int pow_value[][] = new int[5][5];
	private int max, min, max_a, max_b, min_a, min_b;

	/** ������ **/
	public H06() {
		input();
	}

	/** �� ��� **/
	public void printResult() {
		System.out.println("�Է��Ͻ� 5���� ���� �������� �����...");
		System.out.printf("���� ū ���� %d�� %d���� %d�Դϴ�.\n", max_a, max_b, max);
		System.out.printf("���� ���� ���� %d�� %d���� %d�Դϴ�.\n", min_a, min_b, min);
	}

	/** �� �Է� **/
	void input() {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		System.out.print("2���� 9������ ���� 5���� �Է��ϼ���: ");
		for (int i = 0; i < number.length; i++) {
			number[i] = sc.nextInt();
		}

		calPow();

	}

	/** ���� ��� **/
	void calPow() {
		for (int i = 0; i < number.length; i++) {
			for (int j = 0; j < number.length; j++) {
				if (i == j) {
					continue;
				}
				pow_value[i][j] = (int) Math.pow(number[i], number[j]);
			}
		}

		setMaxMin();
	}

	/** max ���ϱ� **/
	void setMaxMin() {
		// 0,0�� ���� ���� ������
		max_a = number[0];
		max_b = number[1];
		min_a = number[0];
		min_b = number[1];
		max = pow_value[0][1];
		min = pow_value[0][1];

		for (int i = 0; i < pow_value.length; i++) {
			for (int j = 0; j < pow_value[0].length; j++) {

				if (i == j) {
					continue;
				}

				int temp_x = max;
				int temp_n = min;

				max = Math.max(max, pow_value[i][j]);
				min = Math.min(min, pow_value[i][j]);

				// ������ max,min ���� �ٲ� ��� idx ���� �ٲ� �־��ֱ�
				if (temp_x != max) {
					max_a = number[i];
					max_b = number[j];
				} else if (temp_n != min) {
					min_a = number[i];
					min_b = number[j];
				}
			}
		}

	}

}
