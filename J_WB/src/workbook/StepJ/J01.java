package workbook.StepJ;

import java.util.Scanner;

public class J01 {
	private int age[] = new int[100];
	private int birthyear;
	private int person_num[] = { 0, 0, 0, 0, 0, 0 };

	/** 생성자 **/
	public J01() {
		input();
	}

	/** 결과 출력 **/
	void printResult() {
		String person[] = { "유아는", "어린이는", "청소년은", "청년은", "중년은", "노년은" };
		for (int i = 0; i < person.length; i++) {
			System.out.println(person[i] + " " + person_num[i] + "명 입니다.");
		}
	}

	/** 갑 입력 **/
	void input() {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		while (true) {
			System.out.print((count + 1) + "번째 사람의 태어난 년도를 입력하세요. ");
			birthyear = sc.nextInt();

			if (birthyear > 2012) {
				break;
			}
			person_num[askAge(birthyear)]++;
			count++;
		}

	}

	int askAge(int birthyear) {
		int age = 2012 - birthyear + 1;
		System.out.println("나이는 " + age + " 입니다.");
		if (age < 7)
			return 0;
		else if (age >= 7 && age < 13)
			return 1;
		else if (age >= 13 && age < 20)
			return 2;
		else if (age >= 20 && age < 30)
			return 3;
		else if (age > 30 && age < 60)
			return 4;
		else
			return 5;
	}
}
