package workbook.StepC;

import java.util.Scanner;

public class C10 {
	private int num1;
	private int num2;
	private String operator;
	private int result;

	/** 생성자 **/
	public C10() {
		input();
	}

	/** 값 출력 **/
	public void printResult() {
		System.out.println("계산식의 결과 값은 " + getResult() + "입니다.");
	}

	/** 갑 입력 **/
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자1을 입력하세요. ");
		num1 = sc.nextInt();
		System.out.print("숫자2를 입력하세요. ");
		num2 = sc.nextInt();
		System.out.println("연산기호문자('+', '-', '*', '/' 중 1개)를 입력하세요: ");
		operator = sc.next();
	}

	/** 값 계산 **/
	int getResult() {
		if (operator.equals("+")) {
			result = num1 + num2;
		} else if (operator.equals("-")) {
			result = num1 - num2;
		} else if (operator.equals("*")) {
			result = num1 * num2;
		} else if (operator.equals("/")) {
			result = num1 / num2;
		}
		return result;
	}

}
