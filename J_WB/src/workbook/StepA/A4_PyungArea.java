package workbook.StepA;

import java.util.Scanner;

public class A4_PyungArea {
	private double m2_area;
	private double pyung_area;

	/** 생성자 **/
	public A4_PyungArea() {
		input();
	}

	/** 값 출력 **/
	public void printArea() {
		System.out.printf("아파트의 평형은 %.1f 입니다.", getArea());
	}

	/** 갑 입력 **/
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("아파트의 분양 면적을 입력하시오. ");
		this.m2_area = sc.nextDouble();
	}

	/** 값 계산 **/
	double getArea() {
		pyung_area = m2_area / 3.305;
		return this.pyung_area;
	}
}
