package workbook.StepK;

import java.util.Scanner;

public class K07 {

	/** 생성자 **/
	public K07() {
		start();
	}

	private void start() {
		Scanner sc = new Scanner(System.in);
		System.out.print("등록할 학생의 명수는? ");
		int num = sc.nextInt();

		Student student[] = new Student[num];
		for (int i = 0; i < num; i++) {
			student[i] = new Student();
			System.out.print((i + 1) + "번 학생의 국어, 영어, 수학 점수를 입력하시오 --> ");
			student[i].input();
			student[i].index = (i + 1);
		}

		System.out.println("========================");
		System.out.printf("등록된 %d명의 학생 목록은 다음과 같습니다.", num);
		System.out.println("------------------------");
		System.out.println("번호\t 국어\t 영어\t 수학\t 총점\t 평균\t 학점\t");
		for (int i = 0; i < student.length; i++) {
			student[i].print(student[i].index);
		}

	}
}
