package workbook.StepH;

import java.util.Scanner;

public class H08 {
	private String input;

	/** ������ **/
	public H08() {
		input();
	}

	/** �� ��� **/
	public void printResult() {

	}

	/** �� �Է� **/
	void input() {
		Scanner sc = new Scanner(System.in);
		String findStr, replaceStr;
		while (true) {
			System.out.println("\n============================");
			System.out.print("=> ���ڿ��� �Է��ϼ��� (x: ����) : ");
			input = sc.nextLine();

			if (input.equalsIgnoreCase("x"))
				break;

			System.out.print("=> ã�� ���ڿ��� �Է��ϼ��� : ");
			findStr = sc.nextLine();
			System.out.print("=> �ٲ� ���ڿ��� �Է��ϼ��� : ");
			replaceStr = sc.nextLine();

			setCount(findStr, replaceStr);

		}
		System.out.println("* ����Ǿ����ϴ�.");
	}

	/** string �ٲٱ� **/
	void setCount(String find, String replace) {
		int count = 0;

		for (int i = 0; i < input.length(); i++) {
			if (input.indexOf(find) != -1) {
				count++;
				input = input.replaceFirst(find, replace);
			}
		}

		System.out.println("\n=> �� " + count + "�� �ٲ�����ϴ�.");
		System.out.println("=> " + input);
	}

}
