package workbook.StepH;

import java.util.Scanner;
import java.util.Random;

public class H05 {
	private int coins;
	private int number[] = new int[3];

	/** 생성자 **/
	public H05() {
		input();
	}

	/** 갑 입력 **/
	void input() {
		int count = 1;
		int dummy;

		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.print("사용하실 코인의 개수를 입력하세요: ");
		coins = sc.nextInt();

		while (0 < coins) {
			coins--;

			System.out.print("게임 " + count + "회 Start!!! (아무 숫자나 입력하세요): ");
			dummy = sc.nextInt();

			System.out.print("게임 결과 : ");
			for (int i = 0; i < number.length; i++) {
				number[i] = rd.nextInt(9) + 1;
				System.out.print(" " + number[i]);
			}
			System.out.print("  ---> ");

			printResult(getCoin());

			count++;
		}

		System.out.println("\n게임 종료!!");
	}

	/** 값 계산 **/
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

	/** 값 출력 **/
	void printResult(int c) {
		System.out.println("c: " + c);
		if (c == 0) {
			System.out.println("꽝입니다... 아쉽군요..");
		} else if (c == 1) {
			System.out.println("숫자 2개 일치, 코인 2개 증정");
		} else if (c == 2) {
			System.out.println("숫자 3개 일치, 코인 4개 증정");
		}

		coins += c * 2;
		System.out.println("남아있는 코인은 " + coins + "개입니다.");
	}

}
