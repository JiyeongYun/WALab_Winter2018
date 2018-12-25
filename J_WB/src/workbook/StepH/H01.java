package workbook.StepH;

import java.util.Scanner;
import java.util.Random;

public class H01 {
	private int answer;
	private int count;

	/** 생성자 **/
	public H01() {
		Random rd = new Random();
		answer = rd.nextInt(100) + 1;
		input();
	}

	/** 값 출력 **/
	public void printResult() {
		System.out.println(count + "번 만에 숫자를 맞추셨습니다.");
	}

	/** 갑 입력 **/
	void input() {
		int number_try;

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("1부터 100까지의 숫자 하나를 맞춰보세요: ");
			number_try = sc.nextInt();
			count++;

			if (answer == number_try) {
				break;
			}

			checkAnsert(number_try);
		}
	}

	/** 값 계산 **/
	void checkAnsert(int num) {

		// 같은 경우 while문에서 이미 break됨
		if (num < answer) {
			System.out.println("좀 더 큰 수입니다.");
		} else {
			System.out.println("좀 더 작은 수입니다.");
		}
	}
}
