package workbook.StepF;

import java.util.Scanner;

public class F01 {
	private int[] num = new int[10];
	private int first;
	private int second;
	private int second_max_index;

	/** 생성자 **/
	public F01() {
		input();
	}

	/** 값 출력 **/
	public void printSecond() {
		first = num[0];
		second = num[0];
		second_max_index = 0;
		for (int i = 0; i < num.length; i++) {
			if (second < num[i]) {
				second = num[i];
				second_max_index = i + 1;
				if (first < num[i]) {
					first = num[i];

				}
			}
		}
		System.out.println("두 번째로 큰 수는 " + second_max_index + "번째 수 " + second + "입니다.");
	}

	/** 갑 입력 **/
	void input() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < num.length; i++) {
			System.out.print((i + 1) + "번째 수를 입력하세요: ");
			num[i] = sc.nextInt();
		}
	}

	/** 값 계산 **/

}
