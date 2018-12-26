package workbook.StepH;

import java.util.Scanner;

public class H08 {
	private String input;

	/** 생성자 **/
	public H08() {
		input();
	}

	/** 값 출력 **/
	public void printResult() {

	}

	/** 갑 입력 **/
	void input() {
		Scanner sc = new Scanner(System.in);
		String findStr, replaceStr;
		while (true) {
			System.out.println("\n============================");
			System.out.print("=> 문자열을 입력하세요 (x: 종료) : ");
			input = sc.nextLine();

			if (input.equalsIgnoreCase("x"))
				break;

			System.out.print("=> 찾을 문자열을 입력하세요 : ");
			findStr = sc.nextLine();
			System.out.print("=> 바꿀 문자열을 입력하세요 : ");
			replaceStr = sc.nextLine();

			setCount(findStr, replaceStr);

		}
		System.out.println("* 종료되었습니다.");
	}

	/** string 바꾸기 **/
	void setCount(String find, String replace) {
		int count = 0;

		for (int i = 0; i < input.length(); i++) {
			if (input.indexOf(find) != -1) {
				count++;
				input = input.replaceFirst(find, replace);
			}
		}

		System.out.println("\n=> 총 " + count + "번 바뀌었습니다.");
		System.out.println("=> " + input);
	}

}
