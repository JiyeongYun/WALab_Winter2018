package workbook.StepB;

import java.util.Scanner;

public class B1_CheckTeen {
	private int birth_year;
	private int age;

	/** ������ **/
	public B1_CheckTeen() {
		input();
	}

	/** �� ��� **/
	public void printAge() {
		if (getAge() < 20) {
			System.out.println("�̼������Դϴ�.");
		} else {
			System.out.println("�̼����ڰ� �ƴմϴ�.");
		}

	}

	/** �� �Է� **/
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�¾ �⵵�� �Է��Ͻÿ�. ");
		birth_year = sc.nextInt();
	}

	/** �� ��� **/
	int getAge() {
		age = 2018 - birth_year + 1;
		return age;
	}

}
