package workbook.StepH;

import java.util.Scanner;
import java.util.Random;

public class H02 {
	private int lotto[] = new int[6];

	/** ������ **/
	public H02() {
		makeLottoNum();
	}

	/** �� �Է� **/
	void makeLottoNum() {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		String onemore;

		while (true) {
			for (int i = 0; i < lotto.length; i++) {
				lotto[i] = rd.nextInt(45) + 1;

				if (check(i, lotto[i])) {
					i--;
				}
			}

			printLotto();

			System.out.print("�� ����ðڽ��ϱ�? (Y/N) ");
			onemore = sc.next();
			if (onemore.equalsIgnoreCase("N")) {
				break;
			}
		}

	}

	/** �ζ� ��ȣ ��� **/
	void printLotto() {
		System.out.print("������ �ζ� ��ȣ�� ");
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
		System.out.println(" �Դϴ�.");
	}

	/** �ߺ� Ȯ�� **/
	boolean check(int last, int num) {
		for (int i = 0; i < last; i++) {
			if (lotto[i] == num) {
				return true;
			}
		}
		return false;
	}
}
