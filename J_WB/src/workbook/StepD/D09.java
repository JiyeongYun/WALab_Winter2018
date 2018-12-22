package workbook.StepD;

import java.util.Scanner;

public class D09 {
	private int dan;

	/** 생성자 **/
	public D09() {
		input();
	}

	/** 값 출력 **/
	public void printGugudan() {
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + " X " + i + " = " + getNum(dan, i));
		}
	}

	/** 갑 입력 **/
	void input() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("출력하고 싶은 구구단의 단 수를 입력하시오(2~9): ");
			dan = sc.nextInt();
			if (dan >= 2 && dan <= 9) {
				break;
			}
			System.out.println("잘못 입력하였습니다.");
		}
	}

	/** 값 계산 **/
	int getNum(int d, int i) {
		return d * i;
	}

}
