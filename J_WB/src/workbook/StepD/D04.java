package workbook.StepD;

import java.util.Scanner;

public class D04 {
	private int count_all;
	private int count_young;
	private int birth_year;
	private int age;
	private int i;

	/** 생성자 **/
	public D04() {
		input();
	}

	/** 값 출력 **/
	public void printYoung() {
		System.out.println("가족들 중에 미성년자는 모두 " + count_young + "명 입니다.");
	}

	/** 갑 입력 **/
	void input() {
		count_young = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("가족이 몇 명인지 입력하세요: ");
		count_all = sc.nextInt();

		for (i = 0; i < count_all; i++) {
			System.out.print("태어난 년도를 입력하세요: ");
			birth_year = sc.nextInt();
			setYoung();
		}
	}

	/** 값 계산 **/
	void setYoung() {
		if (getAge() < 20) {
			count_young++;
		}
	}

	int getAge() {
		age = 2018 - birth_year + 1;
		return age;
	}

}
