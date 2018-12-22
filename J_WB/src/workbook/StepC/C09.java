package workbook.StepC;

import java.util.Scanner;

public class C09 {
	private int income;
	private int tax;

	/** ������ **/
	public C09() {
		input();
	}

	/** �� ��� **/
	public void printTax() {
		System.out.println("���� �ݾ׿� ���� �ҵ漼�� " + getTax() + "�� �Դϴ�.");
	}

	/** �� �Է� **/
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("����(�� ����)�� ���ڷ� �Է��ϼ���. ");
		income = sc.nextInt();
	}

	/** �� ��� **/
	int getTax() {
		if (income < 10000000) {
			tax = (int) (income * 0.095);
		} else if (income >= 10000000 && income < 40000000) {
			tax = (int) (income * 0.19);
		} else if (income >= 40000000 && income < 80000000) {
			tax = (int) (income * 0.28);
		} else if (income >= 80000000) {
			tax = (int) (income * 0.37);
		}
		return tax;
	}
}
