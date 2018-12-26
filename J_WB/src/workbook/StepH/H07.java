package workbook.StepH;

import java.util.Scanner;

public class H07 {

	/** 생성자 **/
	public H07() {
		input();
	}

	/** 갑 입력 **/
	void input() {
		Scanner sc = new Scanner(System.in);
		String input;
		while (true) {
			System.out.println("\n============================");
			System.out.print("=> 문자열을 입력하세요 (x: 종료) : ");
			input = sc.nextLine();

			if (input.equalsIgnoreCase("x"))
				break;

			printSplit(input);

		}
		System.out.println("* 종료되었습니다.");
	}

	/** string 출력 **/
	void printSplit(String str) {
		System.out.println("총 문자의 개수는 " + str.length() + "개입니다.");
		for (int i = 0; i < str.length(); i++) {
			System.out.println("=> " + str.substring(i, i + 1));
		}
	}

}
