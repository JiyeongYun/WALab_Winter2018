package workbook.StepD;

import java.util.Scanner;

public class StepDManager {
	public StepDManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while (true) {
			printf("---------------------\n");
			printf("1. 1���� ���� ���ϱ�\n");
			printf("2. �Է� ���� ���ڵ� �߿��� ���� ū ���� ���� ���� �� ���ϱ�\n");
			printf("3. �Է� ���� ���ڵ��� ���հ�� ��� �� ���ϱ�\n");
			printf("4. �̼����� ���� ����\n");
			printf("5. ���簢�� ���� ���� ����\n");
			printf("6. ����Ʈ ���� ��� �� ���� ����\n");
			printf("7. 1�� �޼ҵ��� ��ǥ ���ϱ�\n");
			printf("8. 2�� �޼ҵ��� ��ǥ ���ϱ�\n");
			printf("9. ���ϴ� �������� �� ����ϱ�\n");
			printf("10. �� ���� ��Ÿ�� ��� ����ϱ�\n");
			printf("=>���ϴ� �޴���?(0:exit) :");
			menu = s.nextInt();
			if (menu == 0)
				break;
			switch (menu) {
			case 1:

				break;
			case 2:

				break;
			case 3:

				break;
			case 4:

				break;
			case 5:

				break;
			case 6:

				break;
			case 7:

				break;
			case 8:

				break;
			case 9:

				break;
			case 10:

				break;
			}
		}

	}

	void printf(String s) {
		System.out.print(s);
	}
}
