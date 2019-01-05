package workbook.StepJ;

import java.util.Scanner;

public class J07 {

	/** 생성자 **/
	public J07() {
		input();
	}

	/** 갑 입력 **/
	void input() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("숫자를 입력하시오. (0.종료) : ");
			int num = sc.nextInt();

			if (num <= 0) {
				break;
			}

			System.out.printf("2의 %d승은 : %d\n", num, poweroftwo(num));
		}
	}

	/** 값 계산 **/
	int poweroftwo(int n) {
		if (n == 0) return 1;
		else return 2*poweroftwo(n - 1);
	}
}
