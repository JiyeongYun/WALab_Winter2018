package workbook.StepH;

import java.util.Scanner;

public class H07 {

	/** ������ **/
	public H07() {
		input();
	}

	/** �� �Է� **/
	void input() {
		Scanner sc = new Scanner(System.in);
		String input;
		while (true) {
			System.out.println("\n============================");
			System.out.print("=> ���ڿ��� �Է��ϼ��� (x: ����) : ");
			input = sc.nextLine();

			if (input.equalsIgnoreCase("x"))
				break;

			printSplit(input);

		}
		System.out.println("* ����Ǿ����ϴ�.");
	}

	/** string ��� **/
	void printSplit(String str) {
		System.out.println("�� ������ ������ " + str.length() + "���Դϴ�.");
		for (int i = 0; i < str.length(); i++) {
			System.out.println("=> " + str.substring(i, i + 1));
		}
	}

}
