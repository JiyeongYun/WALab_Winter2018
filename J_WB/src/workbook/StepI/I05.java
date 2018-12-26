package workbook.StepI;

import java.util.Scanner;

public class I05 {
	private int maxArr[] = new int[10];

	/** 생성자 **/
	public I05() {
		input();
	}

	/** 갑 입력 **/
	void input() {

		Scanner sc = new Scanner(System.in);
		System.out.println("10개의 숫자 중 최댓값을 구합니다.");
		for (int i = 0; i < 10; i++) {
			System.out.print((i + 1) + "번 수를 입력하시오: ");
			maxArr[i] = sc.nextInt();
		}

		System.out.println("최댓값은 " + MaxOfTen() + "입니다.");

	}

	/** 최댓값 출력 **/
	int MaxOfTen() {
		int max = maxArr[0];
		for (int i = 1; i < maxArr.length; i++) {
			if (max < maxArr[i]) {
				max = maxArr[i];
			}
		}

		return max;
	}
}
