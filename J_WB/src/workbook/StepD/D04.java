package workbook.StepD;

import java.util.Scanner;

public class D04 {
	private int count_all;
	private int count_young;
	private int birth_year;
	private int age;
	private int i;

	/** ������ **/
	public D04() {
		input();
	}

	/** �� ��� **/
	public void printYoung() {
		System.out.println("������ �߿� �̼����ڴ� ��� " + count_young + "�� �Դϴ�.");
	}

	/** �� �Է� **/
	void input() {
		count_young = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("������ �� ������ �Է��ϼ���: ");
		count_all = sc.nextInt();

		for (i = 0; i < count_all; i++) {
			System.out.print("�¾ �⵵�� �Է��ϼ���: ");
			birth_year = sc.nextInt();
			setYoung();
		}
	}

	/** �� ��� **/
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
