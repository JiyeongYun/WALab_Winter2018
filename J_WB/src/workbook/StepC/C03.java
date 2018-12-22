package workbook.StepC;

import java.util.Scanner;

public class C03 {
	private int width;
	private int height;

	/** 생성자 **/
	public C03() {
		input();
	}

	/** 값 출력 **/
	public void printRect() {
		if (width == height) {
			System.out.println("정사각형입니다.");
		} else if (width >= height * 2) {
			System.out.println("좌우로 길쭉한 직사각형입니다.");
		} else if (height >= width * 2) {
			System.out.println("위아래로 길쭉한 직사각형입니다.");
		} else if (width > height) {
			System.out.println("일반적인 가로형 직사각형입니다.");
		} else if (height > width) {
			System.out.println("일반적인 세로형 직사각형입니다.");
		}
	}

	/** 갑 입력 **/
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("직사각형의 가로 크기를 입력하세요: ");
		width = sc.nextInt();
		System.out.println("직사각형의 세로 크기를 입력하세요: ");
		height = sc.nextInt();
	}
}
