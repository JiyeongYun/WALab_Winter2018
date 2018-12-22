package workbook.StepD;

import java.util.Scanner;

public class D01 {
	private int number;
	private int totalsum;
	private int i;

	/** 생성자 **/
	public D01() {
		input();
	}

	/** 값 출력 **/
	public void printTotal() {
		System.out.println("1부터 입력한 숫자까지의 모든 정수를 더한 값은 " + getTotal() + " 입니다.");
	}

	/** 갑 입력 **/
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요: ");
		number = sc.nextInt();
	}

	/** 값 계산 **/
	int getTotal() {
		totalsum = 0;
		for (i = 1; i <= number; i++) {
			totalsum += i;
		}
		return totalsum;
	}
}
