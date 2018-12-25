package workbook.StepG;

import java.util.Scanner;

public class G02 {
	private double degrees[] = new double[10];
	private String degree_count[] = new String[10];
	private String degree_name[] = { "�ü�", "�̿¼�", "�¼�", "���¹�" };
	private int count[] = { 0, 0, 0, 0 };

	/** ������ **/
	public G02() {
		input();
	}

	/** �� ��� **/
	public void printDegree() {
		for (int i = 0; i < degrees.length; i++) {
			System.out.printf("%d�� ���� �µ��� %.1f�� �Դϴ�. %s\n", (i + 1), degrees[i], degree_count[i]);
		}
		for (int i = 0; i < degree_name.length; i++) {
			System.out.printf("%s �Է� Ƚ�� : %d\n", degree_name[i], count[i]);
		}
	}

	/** �� �Է� **/
	void input() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < degrees.length; i++) {
			System.out.print((i + 1) + "�� ���� �µ��� �Է��ϼ���: ");
			degrees[i] = sc.nextDouble();
			int temp = getSel(degrees[i]);
			if (temp == -1) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				i--;
			} else {
				setCount(i, temp);
			}
		}
	}

	/** �µ� ���� **/
	int getSel(double d) {
		if (0 <= d && d < 25) {
			return 0; // �ü�
		} else if (25 <= d && d < 40) {
			return 1; // �̿¼�
		} else if (40 <= d && d < 80) {
			return 2; // �¼�
		} else if (80 <= d) {
			return 3; // ���� ��
		}
		return -1;
	}

	/** count ���� **/
	void setCount(int i, int flag) {
		degree_count[i] = degree_name[flag];
		count[flag]++;
	}
}
