package workbook.StepB;

import java.util.Scanner;

public class B4_ApartSize {
	private double m2_area;
	private double pyung_area;

	/** 생성자 **/
	public B4_ApartSize() {
		input();
	}

	/** 값 출력 **/
	public void printArea() {
		System.out.printf("아파트의 평형은 %.1f 이고,\n", getPArea());
		if (getPArea() < 30) {
			System.out.println("30평 미만이므로 작은 아파트입니다.");
		} else {
			System.out.println("30평 이상이므로 큰 아파트입니다.");
		}
	}

	/** 갑 입력 **/
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("아파트의 분양 면적을 입력하시오. ");
		m2_area = sc.nextDouble();
	}

	/** 값 계산 **/
	double getPArea() {
		pyung_area = m2_area / 3.305;
		return pyung_area;
	}

}
