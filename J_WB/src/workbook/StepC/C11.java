package workbook.StepC;

import java.util.Scanner;

public class C11 {
	private int year;

	/** ������ **/
	public C11() {
		input();
	}

	/** �� ��� **/
	public void printLeap() {
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println("�Է��Ͻ� �⵵�� �����Դϴ�.");
					return;
				}
				System.out.println("�Է��Ͻ� �⵵�� ������ �ƴմϴ�.");
				return;
			}
			System.out.println("�Է��Ͻ� �⵵�� �����Դϴ�.");
			return;
		}
		System.out.println("�Է��Ͻ� �⵵�� ������ �ƴմϴ�.");
	}

	/** �� �Է� **/
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�⵵�� �Է��ϼ���. ");
		year = sc.nextInt();
	}
}
