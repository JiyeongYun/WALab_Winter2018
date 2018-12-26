package workbook.StepH;

import java.util.Scanner;
import java.util.Random;
import java.math.*;

public class H06 {
	private int number[] = new int[5];
	private int pow_value[][] = new int[5][5];
	private int max, min, max_a, max_b, min_a, min_b;

	/** 생성자 **/
	public H06() {
		input();
	}

	/** 값 출력 **/
	public void printResult() {
		System.out.println("입력하신 5개의 수로 제곱수를 만들면...");
		System.out.printf("가장 큰 수는 %d의 %d승인 %d입니다.\n", max_a, max_b, max);
		System.out.printf("가장 작은 수는 %d의 %d승인 %d입니다.\n", min_a, min_b, min);
	}

	/** 갑 입력 **/
	void input() {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		System.out.print("2에서 9사이의 숫자 5개를 입력하세요: ");
		for (int i = 0; i < number.length; i++) {
			number[i] = sc.nextInt();
		}

		calPow();

	}

	/** 제곱 계산 **/
	void calPow() {
		for (int i = 0; i < number.length; i++) {
			for (int j = 0; j < number.length; j++) {
				if (i == j) {
					continue;
				}
				pow_value[i][j] = (int) Math.pow(number[i], number[j]);
			}
		}

		setMaxMin();
	}

	/** max 구하기 **/
	void setMaxMin() {
		// 0,0은 값이 없기 때문에
		max_a = number[0];
		max_b = number[1];
		min_a = number[0];
		min_b = number[1];
		max = pow_value[0][1];
		min = pow_value[0][1];

		for (int i = 0; i < pow_value.length; i++) {
			for (int j = 0; j < pow_value[0].length; j++) {

				if (i == j) {
					continue;
				}

				int temp_x = max;
				int temp_n = min;

				max = Math.max(max, pow_value[i][j]);
				min = Math.min(min, pow_value[i][j]);

				// 이전의 max,min 값이 바뀐 경우 idx 값도 바꿔 넣어주기
				if (temp_x != max) {
					max_a = number[i];
					max_b = number[j];
				} else if (temp_n != min) {
					min_a = number[i];
					min_b = number[j];
				}
			}
		}

	}

}
