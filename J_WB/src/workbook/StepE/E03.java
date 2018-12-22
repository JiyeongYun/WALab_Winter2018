package workbook.StepE;

import java.util.Scanner;

public class E03 {
	private int height;

	/** 생성자 **/
	public E03() {
		input();
	}

	/** 값 출력 **/
	public void printTriangle() {
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < height - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i * 2 + 1; j++) {
				System.out.print("*");
			}
			for (int j = 0; j < height - i; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}

	/** 갑 입력 **/
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이등변 삼각형의 높이를 입력하세요: ");
		height = sc.nextInt();
	}
}
