package workbook.StepF;

import java.util.Scanner;

public class F09 {
	private int monthdays[] = {31,28,31,30,31,30,31,31,30,31,30,31};
	private int month;
	private int day;
	
	/** ������ **/
	public F09() {
		input();
	}

	/** �� ��� **/
	public void printDay() {
		System.out.println("�� ��¥�� 1�� �� "+getDay()+"��° ���� �ش�˴ϴ�.");
	}

	/** �� �Է� **/
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է��ϼ���: ");
		month = sc.nextInt();
		System.out.print("���� �Է��ϼ���: ");
		day = sc.nextInt();
	}

	/** �ϼ� ��� **/
	int getDay() {
		int day_count = day;
		for (int i = 0; i < month-1; i++) {
			day_count+=monthdays[i];
		}
		return day_count;
	}
	
}
