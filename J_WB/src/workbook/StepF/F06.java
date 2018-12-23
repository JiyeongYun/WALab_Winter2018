package workbook.StepF;

import java.util.Scanner;

public class F06 {
	private int number[][] = new int[5][3];
	private int total;

	/** 생성자 **/
	public F06() {
		input();
	}

	/** 값 출력 **/
	public void printNum() {
		System.out.println("이 아파트에 사는 거주자는 모두 " + total + "명 입니다.");
	}

	/** 갑 입력 **/
	void input() {
		total = 0;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < number.length; i++) {
			for (int j = 0; j < number[i].length; j++) {
				System.out.print((i + 1) + "0" + (j + 1) + "호에 살고 있는 사람의 숫자를 입력하세요: ");
				number[i][j] = sc.nextInt();
				total += number[i][j];
			}
		}
	}
}
