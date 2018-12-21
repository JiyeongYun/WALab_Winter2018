package workbook.StepB;

import java.util.Scanner;

public class B1_CheckTeen {
	private int birth_year;
	private int age;

	/** 생성자 **/
	public B1_CheckTeen() {
		input();
	}

	/** 값 출력 **/
	public void printAge() {
		if (getAge() < 20) {
			System.out.println("미성년자입니다.");
		} else {
			System.out.println("미성년자가 아닙니다.");
		}

	}

	/** 갑 입력 **/
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("태어난 년도를 입력하시오. ");
		birth_year = sc.nextInt();
	}

	/** 값 계산 **/
	int getAge() {
		age = 2018 - birth_year + 1;
		return age;
	}

}
