package workbook.StepJ;

import java.util.Scanner;

public class J07 {

	/** ������ **/
	public J07() {
		input();
	}

	/** �� �Է� **/
	void input() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("���ڸ� �Է��Ͻÿ�. (0.����) : ");
			int num = sc.nextInt();

			if (num <= 0) {
				break;
			}

			System.out.printf("2�� %d���� : %d\n", num, poweroftwo(num));
		}
	}

	/** �� ��� **/
	int poweroftwo(int n) {
		if (n == 0) return 1;
		else return 2*poweroftwo(n - 1);
	}
}
