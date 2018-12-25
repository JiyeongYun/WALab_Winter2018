package workbook.StepG;

import java.util.Scanner;

public class G04 {
	int total_charge = 0;

	/** ������ **/
	public G04() {
		input();
	}

	/** �� �Է� **/
	void input() {
		Scanner sc = new Scanner(System.in);
		int kind;
		int money;

		while (true) {
			System.out.print("�ε��� �ŷ�����(1:�Ÿ�, 2:�Ӵ�, 0:�������)�� �Է��ϼ���: ");
			kind = sc.nextInt();
			if (kind == 0) {
				break;
			}
			System.out.print("�ε��� �ŷ��ݾ�(��)�� �Է��ϼ���: ");
			money = sc.nextInt();
			System.out.println("�̿� ���� �߰� ������� " + getCharge(kind, money) + "���Դϴ�.");
		}
		System.out.println("���ݱ����� ������ �Ѿ��� " + total_charge + "���Դϴ�.");
	}

	/** ������ ��� **/
	int getCharge(int k, int m) {
		int charge = 0;
		if (k == 1) {
			if (m < 50000000) {
				charge = (int) (m * 0.006);
				if (250000 < charge) {
					charge = 250000;
				}
			} else if (50000000 < m && m < 200000000) {
				charge = (int) (m * 0.005);
				if (800000 < charge) {
					charge = 800000;
				}
			} else if (200000000 < m) {
				charge = (int) (m * 0.004);
			}
		} else if (k == 2) {
			if (m < 20000000) {
				charge = (int) (m * 0.005);
				if (70000 < charge) {
					charge = 70000;
				}
			} else if (20000000 < m && m < 50000000) {
				charge = (int) (m * 0.005);
				if (200000 < charge) {
					charge = 200000;
				}
			} else if (50000000 < m && m < 100000000) {
				charge = (int) (m * 0.004);
				if (300000 < charge) {
					charge = 300000;
				}
			} else if (100000000 < m) {
				charge = (int) (m * 0.003);
			}
		}
		total_charge += charge;
		return charge;
	}

}
