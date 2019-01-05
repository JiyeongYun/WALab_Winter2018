package workbook.StepJ;

import java.util.Scanner;

public class J05 {

	/** 생성자 **/
	public J05() {
		input();
	}

	/** 갑 입력 **/
	void input() {

		Scanner sc = new Scanner(System.in);
		int count = 1;
		int total = 0;

		while (true) {
			System.out.print(count + "번 차량 주차 시작 시각 (시 분) : ");
			int s_h = sc.nextInt();
			int s_m = sc.nextInt();

			System.out.print(count + "번 차량 주차 종료 시각 (시 분) : ");
			int e_h = sc.nextInt();
			int e_m = sc.nextInt();

			int rate = CalcParking(s_h, s_m, e_h, e_m);
			total += rate;

			System.out.println("주차요금 : " + rate + "원");
			System.out.print("더 입력하시겠습니까?(Y/N) ");
			String answer = sc.next();

			if (answer.equalsIgnoreCase("N")) {
				break;
			}

			count++;
		}

		System.out.printf("주차차량 %d대의 총 주차 요금은 %d원입니다.\n", count, total);

	}

	/** 값 계산 **/
	int CalcParking(int start_h, int start_m, int end_h, int end_m) {
		int min = 0;
		if (start_h == end_h) {
			min = end_m - start_m;
		} else if (end_m >= start_m) {
			min = (end_h - start_h) * 60 + (end_m - start_m);
		} else if (end_m < start_m) {
			min = (end_h-1 - start_h) * 60 + (end_m+60 - start_m);
		}

		if (min % 10 == 0) {
			return (min / 10) * 500;
		} else {
			return (min / 10 + 1) * 500;
		}

	}
}
