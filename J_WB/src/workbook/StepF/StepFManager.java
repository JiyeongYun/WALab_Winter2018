package workbook.StepF;

import java.util.Scanner;

public class StepFManager {
	public StepFManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while (true) {
			printf("---------------------\n");
			printf("1. �� ��°�� ū ���� ���� ã��\n");
			printf("2. �ɻ����� ���\n");
			printf("3. 5���� ��, ��, �� 3���� ������ ���� ����, ��հ� ���ϱ�\n");
			printf("4. 5���� ��, ��, �� 3���� ������ �л��� ����, ��հ� ���ϱ�\n");
			printf("5. �� ����\n");
			printf("6. 5�� ����Ʈ�� ������ ���� ���ϱ�\n");
			printf("7. 5�� ����Ʈ�� ����, ȣ���� ������ ���� ���ϱ�\n");
			printf("8. ��ġ�� �ʴ� ���� 10�� �Է� �ޱ�\n");
			printf("9. �迭�� �̿��� ���� ��¥ ���\n");
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
			}
		}

	}

	void printf(String s) {
		System.out.print(s);
	}
	
}
