package workbook.StepH;

import java.util.Random;
import java.util.Scanner;

public class H03 {
	private int lotto_com[] = new int[6];
	private int lotto_user[] = new int[6];

	/** ������ **/
	public H03() {
		makeLottoNum();
	}

	/** �ζ� ��ȣ ��� **/
	void printLotto() {
		System.out.print("\n�̹� ���� �ζ� ��÷ ��ȣ�� ");
		for (int i = 0; i < lotto_com.length; i++) {
			System.out.print(lotto_com[i] + " ");
		}
		System.out.println(" �Դϴ�.\n");

		System.out.println("��ġ�ϴ� �ζ� ��ȣ�� " + getMatch() + "�� �Դϴ�.");
	}

	/** �� �Է� **/
	void makeLottoNum() {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		String onemore;

		// ��ǻ�� �ζ� ����
		for (int i = 0; i < lotto_com.length; i++) {
			lotto_com[i] = rd.nextInt(45) + 1;

			if (check(i, lotto_com[i], lotto_com)) {
				i--;
			}

		}

		// user �ζ� ����
		for (int i = 0; i < lotto_user.length; i++) {
			System.out.print("���ϴ� " + (i + 1) + "��° �ζ� ���ڸ� �Է��ϼ���: ");
			lotto_user[i] = sc.nextInt();

			if (check(i, lotto_user[i], lotto_user)) {
				System.out.println("=> �߸� �Է��ϼ̽��ϴ�.");
				i--;
			}
		}

	}

	/** �ߺ� Ȯ�� **/
	boolean check(int last, int num, int lotto[]) {
		for (int i = 0; i < last; i++) {
			if (num == lotto[i] || num < 1 || 45 < num) {
				return true;
			}
		}
		return false;
	}

	/** computer�� user�� �ζ� ��ȣ �ߺ� Ȯ�� **/
	int getMatch() {
		int match_count = 0;

		for (int i = 0; i < lotto_user.length; i++) {
			for (int j = 0; j < lotto_com.length; j++) {
				if (lotto_user[i] == lotto_com[j]) {
					match_count++;
					break; // �� �� �ߺ��� ��� �� �̻� �ߺ��� ���� ���� ������ ���� for�� Ż��
				}
			}
		}

		return match_count;
	}
}
