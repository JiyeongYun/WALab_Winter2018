package workbook.StepI;

import java.util.Scanner;

public class I03 {
	private int i;

	/** 생성자 **/
	public I03() {
		input();
	}

	/** 갑 입력 **/
	void input() {
		Scanner sc = new Scanner(System.in);
		for (i = 0; i < 10; i++) {
			System.out.print((i + 1) + "번째 사람의 신장(cm)과 체중(kg)을 입력하시오. ");
			int height = sc.nextInt();
			int weight = sc.nextInt();
			AskBiman(height, weight);
		}

	}

	/** 비만 계산 **/
	void AskBiman(int height, int weight) {
		double bmi = weight / ((height * 0.01) * (height * 0.01));
		if (bmi < 18.5) {
			System.out.println("저체중입니다.");
		} else if (18.5 <= bmi && bmi < 23) {
			System.out.println("정상입니다.");
		} else if (23 <= bmi && bmi < 25) {
			System.out.println("과체중입니다.");
		} else if (25 <= bmi && bmi < 30) {
			System.out.println("경도 비만입니다.");
		} else if (30 <= bmi) {
			System.out.println("고도 비만입니다.");
		}
	}
}
