package workbook.StepG;

import java.util.Scanner;

public class G05 {
	private int total_charge = 0;

	/** ������ **/
	public G05() {
		input();
	}

	/** �� �Է� **/
	void input() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("����� �ð��� �ð��� ������ �Է��ϼ���: ");
			int hour = sc.nextInt();
			int minute = sc.nextInt();

			if (hour == 0 && minute == 0) {
				break;
			}
			
			System.out.println("������ �̿��� " + getPay(hour, minute) + "���Դϴ�.");

		}
		System.out.println("���ݱ����� �̿�� �ѱݾ��� " + total_charge + "�� �Դϴ�.");
	}

	/** �̿�� ��� **/
	int getPay(int h, int m) {
		int charge = 0;
		m = (h * 60) + m; // �� ������ ����
		
		charge = (m / 30) * 1000; // ��� ���
		if(m%30 != 0) {
			charge += 1000;
		}
		
		// ���� ����
		if (120 <= m && m < 180) {
			charge = (int) (charge * 0.95);
		} else if (180 <= m && m < 300) {
			charge = (int) (charge * 0.90);
		} else if (300 <= m) {
			charge = (int) (charge * 0.80);
		}
		
		total_charge += charge;
		return charge;
	}

}
