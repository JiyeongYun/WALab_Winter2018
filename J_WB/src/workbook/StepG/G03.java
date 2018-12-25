package workbook.StepG;

import java.util.Scanner;

public class G03 {
	private int jumsu[][] = new int[5][3];
	private int c_all[] = { 0, 0, 0 };
	private int s_all[] = { 0, 0, 0, 0, 0 };

	/** ������ **/
	public G03() {
		input();
	}

	/** �� ��� **/
	public void printGrade() {
		String class_name[] = { "����", "����", "����" };
		
		System.out.println("1) �� ���� ������ ��� ����");
		for (int i = 0; i < class_name.length; i++) {
			System.out.printf("%s ���� ������ %d ����� %.1f�Դϴ�.\n", class_name[i], c_all[i], (c_all[i] / (double)jumsu.length));
		}
		System.out.println("2) �� �л��� ������ ��� ����");
		for (int i = 0; i < jumsu.length; i++) {
			System.out.printf("%d�� �л� ���� : ���� %d, ��� %.1f, ��� %s\n", (i + 1), s_all[i], (s_all[i] / (double)jumsu[i].length),
					getGrade(s_all[i] / jumsu[i].length));
		}
	}

	/** �� �Է� **/
	void input() {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < jumsu.length; i++) {
			System.out.print((i + 1) + "�� �л��� ����, ����, ���� ������? ");
			for (int j = 0; j < jumsu[0].length; j++) {
				jumsu[i][j] = sc.nextInt();
				c_all[j] += jumsu[i][j];
				s_all[i] += jumsu[i][j];
			}
		}
	}

	/** �� �л��� ��� ��� **/
	String getGrade(int g) {
		if (90 <= g) {
			return "A";
		} else if (80 <= g && g <= 90) {
			return "B";
		} else if (70 <= g && g <= 80) {
			return "C";
		} else if (60 <= g && g <= 70) {
			return "D";
		}
		return "F";
	}
}
