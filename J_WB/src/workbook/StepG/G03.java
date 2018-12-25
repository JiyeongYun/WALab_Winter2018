package workbook.StepG;

import java.util.Scanner;

public class G03 {
	private int jumsu[][] = new int[5][3];
	private int c_all[] = { 0, 0, 0 };
	private int s_all[] = { 0, 0, 0, 0, 0 };

	/** 생성자 **/
	public G03() {
		input();
	}

	/** 값 출력 **/
	public void printGrade() {
		String class_name[] = { "국어", "영어", "수학" };
		
		System.out.println("1) 각 과목별 총점과 평균 점수");
		for (int i = 0; i < class_name.length; i++) {
			System.out.printf("%s 과목 총점은 %d 평균은 %.1f입니다.\n", class_name[i], c_all[i], (c_all[i] / (double)jumsu.length));
		}
		System.out.println("2) 각 학생별 총점과 평균 점수");
		for (int i = 0; i < jumsu.length; i++) {
			System.out.printf("%d번 학생 점수 : 총점 %d, 평균 %.1f, 등급 %s\n", (i + 1), s_all[i], (s_all[i] / (double)jumsu[i].length),
					getGrade(s_all[i] / jumsu[i].length));
		}
	}

	/** 갑 입력 **/
	void input() {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < jumsu.length; i++) {
			System.out.print((i + 1) + "번 학생의 국어, 영어, 수학 점수는? ");
			for (int j = 0; j < jumsu[0].length; j++) {
				jumsu[i][j] = sc.nextInt();
				c_all[j] += jumsu[i][j];
				s_all[i] += jumsu[i][j];
			}
		}
	}

	/** 각 학생별 등급 계산 **/
	String getGrade(int g) {
		if (90 <= g) {
			return "A";
		} else if (80 <= g && g <= 90) {
			return "B";
		} else if (70 <= g && g <= 80) {
			return "C";
		} else if (60 <= g && g <= 70) {
			return "D";
		}
		return "F";
	}
}
