package workbook.StepF;

import java.util.Scanner;

public class F01 {
	private int[] num = new int[10];

	/** 생성자 **/
	public F01() {
		input();
	}

	/** 값 출력 **/
	public void printSecond() {
		int first = num[0];
		int second = num[0];
		int second_max_index = 0;

		for (int i = 0; i < num.length; i++) {
			if (first < num[i]) {
				first = num[i];
			}
		}
		for (int i = 0; i < num.length; i++) {
			if (num[i] < first && second < num[i]) {
				second = num[i];
				second_max_index = i;
			}
		}

		System.out.println("두 번째로 큰 수는 " + (second_max_index + 1) + "번째 수 " + second + "입니다.");
	}

	/** 갑 입력 **/
	void input() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < num.length; i++) {
			System.out.print((i + 1) + "번째 수를 입력하세요: ");
			num[i] = sc.nextInt();
		}
	}

}
