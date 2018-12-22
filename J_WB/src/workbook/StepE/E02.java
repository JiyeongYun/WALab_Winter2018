package workbook.StepE;

import java.util.Scanner;

public class E02 {
	private int height;
	private int blank;

	/** 생성자 **/
	public E02() {
		input();
	}

	/** 값 출력 **/
	public void printTriangle() {
		for (int i = 1; i <= height; i++) {

			for (int j = 0; j < blank; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= height; j++) {
				if (j <= height - i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}

			System.out.println();
		}
	}

	/** 갑 입력 **/
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("직각 삼각형의 높이와 왼쪽 여백의 크기를 입력하세요: ");
		height = sc.nextInt();
		blank = sc.nextInt();
	}
}
