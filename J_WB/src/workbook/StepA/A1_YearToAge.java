package workbook.StepA;

import java.util.Scanner;

public class A1_YearToAge {
	private int year;
	private int age;

	/** 생성자 **/
	public A1_YearToAge() {
		input();
	}

	/** 값 출력 **/
	public void printAge() {
		System.out.printf("당신의 나이는 %d입니다.\n", getAge());
	}

	/** 갑 입력 **/
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.printf("태어난 년도는?");
		this.year = sc.nextInt();
	}

	/** 값 계산 **/
	int getAge() {
		age = 2018 - year + 1;
		return this.age;
	}

}
