package workbook.StepE;

import java.util.Scanner;

public class E04 {
	private int mode;

	/** 생성자 **/
	public E04() {
		input();
	}

	/** 값 출력 **/
	public void printGugu() {
		if (mode == 1) {
			mode = 3;
		}

		for (int i = mode; i <= 9; i += 2) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d X %d = %d\t", i, j, i * j);
				if (j % 3 == 0) {
					System.out.println();
				}
			}
			System.out.println();
		}

	}

	/** 갑 입력 **/
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("구구단의 출력모드(1:홀수단, 2:짝수단)를 입력하세요: ");
		mode = sc.nextInt();
	}
}
