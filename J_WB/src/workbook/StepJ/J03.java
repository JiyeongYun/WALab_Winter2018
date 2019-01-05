package workbook.StepJ;

import java.util.Scanner;

public class J03 {
	private double[] degree_list = new double[10];
	private int[] num = { 0, 0, 0, 0 };

	/** 생성자 **/
	public J03() {
		input();
	}

	/** 결과 출력 **/
	void printResult() {
		String name[] = { "냉수", "미온수", "온수", "끓는 물" };
		for (int i = 0; i < degree_list.length; i++) {
			System.out.println((i + 1) + "번 물의 온도는 " + degree_list[i] + "도 입니다.");
		}
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i] + "입력 횟수는 " + num[i] + " 입니다.");
		}
	}

	/** 갑 입력 **/
	void input() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < degree_list.length; i++) {
			System.out.print((i + 1) + "번째 물의 온도를 입력하시오. ");
			degree_list[i] = sc.nextDouble();
			num[AskWater(degree_list[i])]++;
		}

	}

	/** 값 계산 **/
	byte AskWater(double degree) {
		if (0 <= degree && degree < 25) {
			return 0;
		} else if (25 <= degree && degree < 40) {
			return 1;
		} else if (40 <= degree && degree < 80) {
			return 2;
		} else {
			return 3;
		}
	}
}
