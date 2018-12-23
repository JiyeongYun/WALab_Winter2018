package workbook.StepF;

import java.util.Scanner;

public class F08 {
	private int number[] = new int[10];

	/** 생성자 **/
	public F08() {
		input();
	}

	/** 값 출력 **/
	public void printNum() {
		for (int i = 0; i < number.length; i++) {
			System.out.println((i + 1) + "번째 숫자는 " + number[i] + "입니다.");
		}
	}

	/** 갑 입력 **/
	void input() {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int newnum;
		while (count < 10) {
			System.out.print((count + 1) + "번째 숫자를 입력하세요: ");
			newnum = sc.nextInt();
			if (!check(count, newnum)) {
				number[count] = newnum;
				count++;
			} else {
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
			}
		}
	}

	/** 중복 확인 **/
	boolean check(int idx, int num) {
		boolean dup = false;
		for (int i = 0; i < idx; i++) {
			if (number[i] == num) {
				dup = true;
				break;
			}
		}
		return dup;
	}
}
