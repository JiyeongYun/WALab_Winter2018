package workbook.StepA;

import java.util.Scanner;

public class A1_YearToAge {
	private int year;
	private int age;

	/** ������ **/
	public A1_YearToAge() {
		input();
	}

	/** �� ��� **/
	public void printAge() {
		System.out.printf("����� ���̴� %d�Դϴ�.\n", getAge());
	}

	/** �� �Է� **/
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.printf("�¾ �⵵��?");
		this.year = sc.nextInt();
	}

	/** �� ��� **/
	int getAge() {
		age = 2018 - year + 1;
		return this.age;
	}

}
