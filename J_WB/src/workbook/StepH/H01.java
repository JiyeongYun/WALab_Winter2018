package workbook.StepH;

import java.util.Scanner;
import java.util.Random;

public class H01 {
	private int answer;
	private int count;

	/** ������ **/
	public H01() {
		Random rd = new Random();
		answer = rd.nextInt(100) + 1;
		input();
	}

	/** �� ��� **/
	public void printResult() {
		System.out.println(count + "�� ���� ���ڸ� ���߼̽��ϴ�.");
	}

	/** �� �Է� **/
	void input() {
		int number_try;

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("1���� 100������ ���� �ϳ��� ���纸����: ");
			number_try = sc.nextInt();
			count++;

			if (answer == number_try) {
				break;
			}

			checkAnsert(number_try);
		}
	}

	/** �� ��� **/
	void checkAnsert(int num) {

		// ���� ��� while������ �̹� break��
		if (num < answer) {
			System.out.println("�� �� ū ���Դϴ�.");
		} else {
			System.out.println("�� �� ���� ���Դϴ�.");
		}
	}
}
