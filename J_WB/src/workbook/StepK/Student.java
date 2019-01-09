package workbook.StepK;

import java.util.Scanner;

public class Student {
	int index;
	int kor, eng, math, total;
	double average;
	String grade;

	void input() {
		Scanner sc = new Scanner(System.in);
		this.kor = sc.nextInt();
		this.eng = sc.nextInt();
		this.math = sc.nextInt();

		this.total = kor + eng + math;
		this.average = (double) total / 3.0;

		if (average < 60) {
			this.grade = "F";
		} else if (average < 65) {
			this.grade = "D";
		} else if (average < 70) {
			this.grade = "D+";
		} else if (average < 75) {
			this.grade = "C";
		} else if (average < 80) {
			this.grade = "C+";
		} else if (average < 85) {
			this.grade = "B";
		} else if (average < 90) {
			this.grade = "B+";
		} else if (average < 95) {
			this.grade = "A";
		} else if (average >= 90) {
			this.grade = "A+";
		}
	}

	void print(int index) {
		System.out.printf("%d\t %d\t %d\t %d\t %d\t %.1f\t %s\n", index, kor, eng, math, total, average, grade);
	}

}
