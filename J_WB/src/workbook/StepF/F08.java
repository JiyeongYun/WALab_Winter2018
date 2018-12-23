package workbook.StepF;

import java.util.Scanner;

public class F08 {
	private int number[] = new int[10];

	/** ������ **/
	public F08() {
		input();
	}

	/** �� ��� **/
	public void printNum() {
		for (int i = 0; i < number.length; i++) {
			System.out.println((i + 1) + "��° ���ڴ� " + number[i] + "�Դϴ�.");
		}
	}

	/** �� �Է� **/
	void input() {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int newnum;
		while (count < 10) {
			System.out.print((count + 1) + "��° ���ڸ� �Է��ϼ���: ");
			newnum = sc.nextInt();
			if (!check(count, newnum)) {
				number[count] = newnum;
				count++;
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���.");
			}
		}
	}

	/** �ߺ� Ȯ�� **/
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
