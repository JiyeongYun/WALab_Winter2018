package workbook.StepB;

import java.util.Scanner;

public class B3_CheckSquare {
	private int width;
	private int height;
	private int area;

	/** 생성자 **/
	public B3_CheckSquare() {
		input();
	}

	/** 값 출력 **/
	public void printArea() {
		System.out.println("직사각형의 넓이는 " + getArea() + "이고");
		if (width == height) {
			System.out.println("정사각형입니다.");
		} else {
			System.out.println("정사각형이 아닙니다.");
		}
	}

	/** 갑 입력 **/
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("직사각형의 가로 크기를 입력하세요. ");
		width = sc.nextInt();
		System.out.print("직사각형의 세로 크기를 입력하세요. ");
		height = sc.nextInt();
	}

	/** 값 계산 **/
	int getArea() {
		area = width * height;
		return area;
	}
}
