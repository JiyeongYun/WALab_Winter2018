package workbook.StepC;

import java.util.Scanner;

public class C09 {
	private int income;
	private int tax;

	/** 생성자 **/
	public C09() {
		input();
	}

	/** 값 출력 **/
	public void printTax() {
		System.out.println("연봉 금액에 대한 소득세는 " + getTax() + "원 입니다.");
	}

	/** 갑 입력 **/
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("연봉(원 단위)을 숫자로 입력하세요. ");
		income = sc.nextInt();
	}

	/** 값 계산 **/
	int getTax() {
		if (income < 10000000) {
			tax = (int) (income * 0.095);
		} else if (income >= 10000000 && income < 40000000) {
			tax = (int) (income * 0.19);
		} else if (income >= 40000000 && income < 80000000) {
			tax = (int) (income * 0.28);
		} else if (income >= 80000000) {
			tax = (int) (income * 0.37);
		}
		return tax;
	}
}
