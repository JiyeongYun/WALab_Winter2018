package workbook.StepF;

import java.util.Scanner;

public class F09 {
	private int monthdays[] = {31,28,31,30,31,30,31,31,30,31,30,31};
	private int month;
	private int day;
	
	/** 생성자 **/
	public F09() {
		input();
	}

	/** 값 출력 **/
	public void printDay() {
		System.out.println("이 날짜는 1년 중 "+getDay()+"번째 날에 해당됩니다.");
	}

	/** 갑 입력 **/
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("월을 입력하세요: ");
		month = sc.nextInt();
		System.out.print("일을 입력하세요: ");
		day = sc.nextInt();
	}

	/** 일수 계산 **/
	int getDay() {
		int day_count = day;
		for (int i = 0; i < month-1; i++) {
			day_count+=monthdays[i];
		}
		return day_count;
	}
	
}
