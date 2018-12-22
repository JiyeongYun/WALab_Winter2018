package workbook.StepD;

import java.util.Scanner;

public class D09 {
	private int dan;

	/** ������ **/
	public D09() {
		input();
	}

	/** �� ��� **/
	public void printGugudan() {
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + " X " + i + " = " + getNum(dan, i));
		}
	}

	/** �� �Է� **/
	void input() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("����ϰ� ���� �������� �� ���� �Է��Ͻÿ�(2~9): ");
			dan = sc.nextInt();
			if (dan >= 2 && dan <= 9) {
				break;
			}
			System.out.println("�߸� �Է��Ͽ����ϴ�.");
		}
	}

	/** �� ��� **/
	int getNum(int d, int i) {
		return d * i;
	}

}
