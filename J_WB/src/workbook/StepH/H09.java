package workbook.StepH;

import java.util.Scanner;

public class H09 {
	private String input;

	/** ������ **/
	public H09() {
		input();
	}

	/** �� ��� **/
	public void printResult() {
		String userList[] = input.split("###");

		System.out.print("\n=> �� " + userList.length + "���� ��ϵǾ����ϴ�.");
		for (int i = 0; i < userList.length; i++) {
			String userInfo[] = userList[i].split("[|]");
			System.out.print("\n" + (i + 1));
			for (int j = 0; j < userInfo.length; j++) {
				System.out.print(" " + userInfo[j]);
			}
		}
	}

	/** �� �Է� **/
	void input() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("\n============================");
			System.out.print("=> ���ڿ��� �Է��ϼ��� (x: ����) : ");
			input = sc.nextLine();

			if (input.equalsIgnoreCase("x"))
				break;

			printResult();
		}
	}

}
