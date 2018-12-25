package workbook.StepG;

import java.util.Scanner;

public class G07 {
	private int charge[] = { 5000, 10000, 15000, 3000 };
	private int v_count[] = { 0, 0, 0, 0 };
	private int count[] = { 0, 0, 0, 0 };
	private int total_sum = 0;
	int total_count = 0;

	/** ������ **/
	public G07() {
		input();
	}

	/** �� ��� **/
	public void printResult() {
		System.out.println("\n���� �� �湮�� ���� " + total_count + "���Դϴ�.");
		System.out.println("�ʵ��л� ���� " + v_count[0] + "���Դϴ�.");
		System.out.println("û�ҳ� ���� " + v_count[1] + "���Դϴ�.");
		System.out.println("�Ϲ��� ���� " + v_count[2] + "���Դϴ�.");
		System.out.println("��δ�� ���� " + v_count[3] + "���Դϴ�.\n");
		System.out.println("�� ������ " + total_sum + "���Դϴ�.");
	}

	/** �� �Է� **/
	void input() {
		Scanner sc = new Scanner(System.in);

		System.out.print("���� �湮�� �� ���� �Է��ϼ���: ");
		int team_count = sc.nextInt();

		for (int i = 0; i < team_count; i++) {

			/** ��� ���� �ο��� �ޱ� **/
			System.out.print((i + 1) + "���� �ο���(�ʵ��л�, û�ҳ�, �Ϲ�, ��δ��)�� �Է��ϼ���: ");
			for (int j = 0; j < count.length; j++) {
				count[j] = sc.nextInt();
				total_count += count[j];
				v_count[j] += count[j];
			}

			/** ����ī�� ���� �ޱ� **/
			System.out.print((i + 1) + "���� ����ī�� ����(ī�����:0, �Ϲݵ��:1, VIP���:2)�� �Է��ϼ���: ");
			int membership = sc.nextInt();

			System.out.println((i + 1) + "���� ������ " + getPay(count, membership) + "���Դϴ�.");
		}

	}

	/** ����� ��� **/
	int getPay(int[] c, int m) {
		int sum = 0;
		for (int i = 0; i < charge.length; i++) {
			sum += c[i] * charge[i];
		}

		if (m == 1) {
			sum = (int) (sum * 0.9);
		} else if (m == 2) {
			sum = (int) (sum * 0.8);
		}

		total_sum += sum;
		return sum;
	}
}
