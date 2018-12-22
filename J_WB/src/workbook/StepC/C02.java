package workbook.StepC;

import java.util.Scanner;

public class C02 {
	private double input_degree;

	/** 생성자 **/
	public C02() {
		input();
	}

	/** 값 출력 **/
	public void printDegree() {
		if (input_degree < 0) {
			System.out.println("잘못입력하셨습니다.");
		} else if (input_degree >= 0 && input_degree < 25) {
			System.out.println("냉수입니다.");
		} else if (input_degree >= 25 && input_degree < 40) {
			System.out.println("미온수입니다.");
		} else if (input_degree >= 40 && input_degree < 80) {
			System.out.println("온수입니다.");
		} else if (input_degree >= 80) {
			System.out.println("끓는 물입니다.");
		}
	}

	/** 갑 입력 **/
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("물의 온도를 입력하세요: ");
		input_degree = sc.nextDouble();
	}

}
