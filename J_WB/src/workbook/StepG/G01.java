package workbook.StepG;

import java.util.Scanner;

public class G01 {
	private int age[] = new int[100];
	private int birth_year;
	private int count_person;
	private String person[] = { "유아", "어린이", "청소년", "청년", "중년", "노년" };
	private int count[] = { 0, 0, 0, 0, 0, 0 };

	/** 생성자 **/
	public G01() {
		input();
	}

	/** 값 출력 **/
	public void printResult() {
		for (int i = 0; i < count_person; i++) {
			System.out.println((i + 1) + "번재 사람의 나이는 " + age[i] + " 입니다.");
		}
		for (int i = 0; i < count.length; i++) {
			if (i < 2) {
				System.out.println(person[i] + "는 " + count[i] + "명 입니다.");
			} else {
				System.out.println(person[i] + "은 " + count[i] + "명 입니다.");
			}

		}
	}

	/** 갑 입력 **/
	void input() {
		Scanner sc = new Scanner(System.in);
		count_person = 0;
		while (true) {
			System.out.print((count_person + 1) + "번째 사람의 태어난 년도를 입력하세요. ");
			birth_year = sc.nextInt();

			if (birth_year > 2012) {
				break;
			}
			age[count_person] = getAge(birth_year);
			count_person++;
		}
	}

	/** 값 계산 **/
	int getAge(int year) {
		int age = 2012 - year + 1;
		setAge(age);
		return age;
	}

	/** 연령대 체크 **/
	void setAge(int age) {
		if (age < 7) {
			count[0]++;
		} else if (age >= 7 && age < 13) {
			count[1]++;
		} else if (age >= 13 && age < 20) {
			count[2]++;
		} else if (age >= 20 && age < 30) {
			count[3]++;
		} else if (age > 30 && age < 60) {
			count[4]++;
		} else if (age >= 60) {
			count[5]++;
		}
	}

}
