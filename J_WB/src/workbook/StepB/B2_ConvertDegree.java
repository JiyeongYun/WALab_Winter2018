package workbook.StepB;

import java.util.Scanner;

public class B2_ConvertDegree {
	private double input_degree;
	private double output_degree;
	private String kind;

	/** 생성자 **/
	public B2_ConvertDegree() {
		input();
	}

	/** 값 출력 **/
	public void printDegree() {
		System.out.printf("변환된 온도 " + getOutDegree() + " 입니다.");
	}

	/** 갑 입력 **/
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("온도를 입력하세요 ");
		input_degree = sc.nextDouble();

		System.out.print("입력하신 온도가 섭씨온도이면 C를, 화씨온도이면 F를 입력하세요 ");
		kind = sc.next();
	}

	/** 값 계산 **/
	double getOutDegree() {
		if (kind.equalsIgnoreCase("C")) {
			output_degree = input_degree * 1.8 + 32;
		} else if (kind.equalsIgnoreCase("F")) {
			output_degree = (input_degree - 32) / 1.8;
		}
		return output_degree;
	}
}
