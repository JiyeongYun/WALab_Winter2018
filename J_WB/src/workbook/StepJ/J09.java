package workbook.StepJ;

import java.util.Scanner;

public class J09 {

	/** ������ **/
	public J09() {
		input();
	}

	/** �� �Է� **/
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� 2���� �Է��Ͻÿ�. ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		System.out.printf("\n%d�� %d���� %d �Դϴ�.\n", n1, n2, power(n1, n2));
	}

	/** �� ��� **/
	int power(int n1, int n2) {
		if (n2 == 0)
			return 1;
		else if (n2 == 1)
			return n1;
		else if (n2 % 2 == 0)
			return power(n1, n2 / 2) * power(n1, n2 / 2);
		else
			return power(n1, n2 / 2) * power(n1, n2 / 2) * n1;
	}
}
