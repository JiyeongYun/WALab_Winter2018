package workbook.StepG;

import java.util.Scanner;

public class G04 {
	int total_charge = 0;

	/** 생성자 **/
	public G04() {
		input();
	}

	/** 갑 입력 **/
	void input() {
		Scanner sc = new Scanner(System.in);
		int kind;
		int money;

		while (true) {
			System.out.print("부동산 거래종류(1:매매, 2:임대, 0:계산종료)를 입력하세요: ");
			kind = sc.nextInt();
			if (kind == 0) {
				break;
			}
			System.out.print("부동산 거래금액(원)을 입력하세요: ");
			money = sc.nextInt();
			System.out.println("이에 대한 중개 수수료는 " + getCharge(kind, money) + "원입니다.");
		}
		System.out.println("지금까지의 수수료 총액은 " + total_charge + "원입니다.");
	}

	/** 수수료 계산 **/
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
