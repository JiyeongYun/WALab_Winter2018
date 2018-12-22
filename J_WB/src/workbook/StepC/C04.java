package workbook.StepC;

import java.util.Scanner;

public class C04 {
	private double m2_area;
	private double pyung_area;

	/** 생성자 **/
	public C04() {
		input();
	}

	/** 값 출력 **/
	public void printArea() {
		System.out.printf("아파트의 평형은 %.1f 입니다.\n", getArea());
		if (getArea() < 15) {
			System.out.println("소형 아파트입니다.");
		} else if (getArea() >= 15 && getArea() < 30) {
			System.out.println("중소형 아파트입니다.");
		} else if (getArea() >= 30 && getArea() < 50) {
			System.out.println("중형 아파트입니다.");
		} else if (getArea() >= 50) {
			System.out.println("대형 아파트입니다.");
		}
	}

	/** 갑 입력 **/
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("아파트의 분양 면적(제곱미터)을 입력하세요: ");
		m2_area = sc.nextDouble();
	}

	/** 값 계산 **/
	double getArea() {
		pyung_area = m2_area / 3.305;
		return pyung_area;
	}
}
