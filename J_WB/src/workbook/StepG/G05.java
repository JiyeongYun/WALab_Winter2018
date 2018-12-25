package workbook.StepG;

import java.util.Scanner;

public class G05 {
	private int total_charge = 0;

	/** 생성자 **/
	public G05() {
		input();
	}

	/** 갑 입력 **/
	void input() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("사용한 시간을 시간과 분으로 입력하세요: ");
			int hour = sc.nextInt();
			int minute = sc.nextInt();

			if (hour == 0 && minute == 0) {
				break;
			}
			
			System.out.println("고객님의 이용료는 " + getPay(hour, minute) + "원입니다.");

		}
		System.out.println("지금까지의 이용료 총금액은 " + total_charge + "원 입니다.");
	}

	/** 이용료 계산 **/
	int getPay(int h, int m) {
		int charge = 0;
		m = (h * 60) + m; // 분 단위로 변경
		
		charge = (m / 30) * 1000; // 요금 계산
		if(m%30 != 0) {
			charge += 1000;
		}
		
		// 할인 적용
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
