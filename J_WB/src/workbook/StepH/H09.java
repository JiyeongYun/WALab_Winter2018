package workbook.StepH;

import java.util.Scanner;

public class H09 {
	private String input;

	/** 생성자 **/
	public H09() {
		input();
	}

	/** 값 출력 **/
	public void printResult() {
		String userList[] = input.split("###");

		System.out.print("\n=> 총 " + userList.length + "명이 등록되었습니다.");
		for (int i = 0; i < userList.length; i++) {
			String userInfo[] = userList[i].split("[|]");
			System.out.print("\n" + (i + 1));
			for (int j = 0; j < userInfo.length; j++) {
				System.out.print(" " + userInfo[j]);
			}
		}
	}

	/** 갑 입력 **/
	void input() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("\n============================");
			System.out.print("=> 문자열을 입력하세요 (x: 종료) : ");
			input = sc.nextLine();

			if (input.equalsIgnoreCase("x"))
				break;

			printResult();
		}
	}

}
