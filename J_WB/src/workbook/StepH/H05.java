package workbook.StepH;

import java.util.Scanner;
import java.util.Random;

public class H05 {
	private int coins;
	private int number[] = new int[3];

	/** ������ **/
	public H05() {
		input();
	}

	/** �� �Է� **/
	void input() {
		int count = 1;
		int dummy;

		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.print("����Ͻ� ������ ������ �Է��ϼ���: ");
		coins = sc.nextInt();

		while (0 < coins) {
			coins--;

			System.out.print("���� " + count + "ȸ Start!!! (�ƹ� ���ڳ� �Է��ϼ���): ");
			dummy = sc.nextInt();

			System.out.print("���� ��� : ");
			for (int i = 0; i < number.length; i++) {
				number[i] = rd.nextInt(9) + 1;
				System.out.print(" " + number[i]);
			}
			System.out.print("  ---> ");

			printResult(getCoin());

			count++;
		}

		System.out.println("\n���� ����!!");
	}

	/** �� ��� **/
	int getCoin() {
		int num = 0;

		for (int i = 0; i < number.length; i++) {
			int temp = number[i];
			for (int j = i + 1; j < number.length; j++) {
				if (temp == number[j]) {
					num++;
					break;
				}
			}
		}

		return num;
	}

	/** �� ��� **/
	void printResult(int c) {
		System.out.println("c: " + c);
		if (c == 0) {
			System.out.println("���Դϴ�... �ƽ�����..");
		} else if (c == 1) {
			System.out.println("���� 2�� ��ġ, ���� 2�� ����");
		} else if (c == 2) {
			System.out.println("���� 3�� ��ġ, ���� 4�� ����");
		}

		coins += c * 2;
		System.out.println("�����ִ� ������ " + coins + "���Դϴ�.");
	}

}
