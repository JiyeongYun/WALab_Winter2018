package workbook.StepC;

import java.util.Scanner;

public class C02 {
	private double input_degree;

	/** ������ **/
	public C02() {
		input();
	}

	/** �� ��� **/
	public void printDegree() {
		if (input_degree < 0) {
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
		} else if (input_degree >= 0 && input_degree < 25) {
			System.out.println("�ü��Դϴ�.");
		} else if (input_degree >= 25 && input_degree < 40) {
			System.out.println("�̿¼��Դϴ�.");
		} else if (input_degree >= 40 && input_degree < 80) {
			System.out.println("�¼��Դϴ�.");
		} else if (input_degree >= 80) {
			System.out.println("���� ���Դϴ�.");
		}
	}

	/** �� �Է� **/
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �µ��� �Է��ϼ���: ");
		input_degree = sc.nextDouble();
	}

}
