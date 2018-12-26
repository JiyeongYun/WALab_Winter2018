package workbook.StepI;

import java.util.Scanner;

public class I02 {
	private char ch;
	private int size;
	private int blank;

	/** 생성자 **/
	public I02() {
		input();
	}

	/** 값 출력 **/
	public void printResult() {
		PrintCharWithBlank(size, blank, ch);
	}

	/** 갑 입력 **/
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("직각 삼각형을 그리는데 사용할 문자를 입력하시오: ");
		ch = sc.nextLine().charAt(0);
		System.out.print("직각 삼각형의 높이와 왼쪽 여백의 크기를 입력하시오: ");
		size = sc.nextInt();
		blank = sc.nextInt();
	}

	/** 삼각형 출력 **/
	void PrintCharWithBlank(int size, int blank, char ch) {
		for (int i = 1; i <= size; i++) {

			for (int j = 0; j < blank; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= size; j++) {
				if (j <= size - i) {
					System.out.print(" ");
				} else {
					System.out.print(ch);
				}
			}

			System.out.println();
		}
	}
}
