package workbook.StepC;

import java.util.Scanner;

public class C08 {
	private int num1;
	private int num2;
	private int num3;
	private int max_num;
	private int min_num;

	/** 생성자 **/
	public C08() {
		input();
	}

	/** 값 출력 **/
	public void printNum() {
		System.out.println("가장 큰 수는 " + getMaxNum() + " 이고, 가장 작은 수는 " + getMinNum() + " 입니다.");
	}

	/** 갑 입력 **/
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하세요 ");
		num1 = sc.nextInt();
		System.out.print("두번째 숫자를 입력하세요 ");
		num2 = sc.nextInt();
		System.out.print("세번째 숫자를 입력하세요 ");
		num3 = sc.nextInt();
	}

	/** 값 계산 **/
	int getMaxNum() {
		max_num = num1;
		if (max_num < num2) {
			max_num = num2;
		}
		if (max_num < num3) {
			max_num = num3;
		}
		return max_num;
	}

	int getMinNum() {
		min_num = num1;
		if (min_num > num2) {
			min_num = num2;
		}
		if (min_num > num3) {
			min_num = num3;
		}
		return min_num;
	}
}
