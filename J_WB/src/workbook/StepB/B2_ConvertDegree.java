package workbook.StepB;

import java.util.Scanner;

public class B2_ConvertDegree {
	private double input_degree;
	private double output_degree;
	private String kind;

	/** ������ **/
	public B2_ConvertDegree() {
		input();
	}

	/** �� ��� **/
	public void printDegree() {
		System.out.printf("��ȯ�� �µ� " + getOutDegree() + " �Դϴ�.");
	}

	/** �� �Է� **/
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�µ��� �Է��ϼ��� ");
		input_degree = sc.nextDouble();

		System.out.print("�Է��Ͻ� �µ��� �����µ��̸� C��, ȭ���µ��̸� F�� �Է��ϼ��� ");
		kind = sc.next();
	}

	/** �� ��� **/
	double getOutDegree() {
		if (kind.equalsIgnoreCase("C")) {
			output_degree = input_degree * 1.8 + 32;
		} else if (kind.equalsIgnoreCase("F")) {
			output_degree = (input_degree - 32) / 1.8;
		}
		return output_degree;
	}
}
