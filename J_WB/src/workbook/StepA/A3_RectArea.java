package workbook.StepA;

import java.util.Scanner;

public class A3_RectArea {
	private int width;
	private int height;
	private int area;

	/** 생성자 **/
	public A3_RectArea() {
		input();
	}

	/** 값 출력 **/
	public void printArea() {
		System.out.println("직사각형의 넓이는 " + getArea() + "입니다.");
	}

	/** 갑 입력 **/
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("직사각형의 가로 크기를 입력하세요. ");
		this.width = sc.nextInt();
		System.out.print("직사각형의 세로 크기를 입력하세요. ");
		this.height = sc.nextInt();
	}

	/** 값 계산 **/
	int getArea() {
		area = width * height;
		return this.area;
	}
}
