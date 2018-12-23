package workbook.StepG;

import java.util.Scanner;

public class G01 {
	private int age[] = new int[100];
	private int birth_year;
	private int count_person;
	private int count_baby = 0;
	private int count_child = 0;
	private int count_youth = 0;
	private int count_young = 0;
	private int count_adult = 0;
	private int count_old = 0;

	/** 생성자 **/
	public G01() {
		input();
	}

	/** 값 출력 **/
	public void printResult() {
		for (int i = 0; i < count_person; i++) {
			System.out.println((i + 1) + "번재 사람의 나이는 " + age[i] + " 입니다.");
		}
		System.out.println("유아는 " + count_baby + "명 입니다.");
		System.out.println("어린이는 " + count_child + "명 입니다.");
		System.out.println("청소년은 " + count_youth + "명 입니다.");
		System.out.println("청년은 " + count_young + "명 입니다.");
		System.out.println("중년은 " + count_adult + "명 입니다.");
		System.out.println("노년은 " + count_old + "명 입니다.");
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
			count_baby++;
		} else if (age >= 7 && age < 13) {
			count_child++;
		} else if (age >= 13 && age < 20) {
			count_youth++;
		} else if (age >= 20 && age < 30) {
			count_young++;
		} else if (age > 30 && age < 60) {
			count_adult++;
		} else if (age >= 60) {
			count_old++;
		}
	}

}
