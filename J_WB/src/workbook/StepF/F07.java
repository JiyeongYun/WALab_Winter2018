package workbook.StepF;

import java.util.Scanner;

public class F07 {
	private int number[][] = new int[5][3];
	private int floor_total[] = { 0, 0, 0, 0, 0 };
	private int line_total[] = { 0, 0, 0 };
	private int total;

	/** 생성자 **/
	public F07() {
		input();
	}

	/** 값 출력 **/
	public void printNum() {
		for (int i = 0; i < floor_total.length; i++) {
			System.out.println((i + 1) + "층에 사는 거주자는 모두 " + floor_total[i] + "명 입니다.");
		}
		System.out.println();
		for (int j = 0; j < line_total.length; j++) {
			System.out.println((j + 1) + "호 라인에 사는 거주자는 모두 " + line_total[j] + "명 입니다.");
		}
		System.out.println("\n이 아파트에 사는 거주자는 모두 " + total + "명 입니다.");
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
				floor_total[i] += number[i][j];
				line_total[j] += number[i][j];
			}
		}
	}
}
