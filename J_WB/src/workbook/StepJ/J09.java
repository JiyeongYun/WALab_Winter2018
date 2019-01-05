package workbook.StepJ;

import java.util.Scanner;

public class J09 {

	/** 생성자 **/
	public J09() {
		input();
	}

	/** 갑 입력 **/
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 2개를 입력하시오. ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		System.out.printf("\n%d의 %d승은 %d 입니다.\n", n1, n2, power(n1, n2));
	}

	/** 값 계산 **/
	int power(int n1, int n2) {
		if (n2 == 0)
			return 1;
		else if (n2 == 1)
			return n1;
		else if (n2 % 2 == 0)
			return power(n1, n2 / 2) * power(n1, n2 / 2);
		else
			return power(n1, n2 / 2) * power(n1, n2 / 2) * n1;
	}
}
