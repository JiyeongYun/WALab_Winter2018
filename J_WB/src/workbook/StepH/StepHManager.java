package workbook.StepH;

import java.util.Scanner;

public class StepHManager {
	public StepHManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while (true) {
			printf("---------------------\n");
			printf("1. ���� �˾� ���߱�\n");
			printf("2. �ζ� ��ȣ �����\n");
			printf("3. �ζ� ��ȣ ��÷ Ȯ���ϱ�\n");
			printf("4. ���������� �����ϱ�\n");
			printf("5. ���Ըӽ� �����\n");
			printf("6. 5�� ������ ������ ���� �����\n");
			printf("7. ������ ������ ������ ����ϱ�\n");
			printf("8. ���ڿ� �ٲٱ�\n");
			printf("9. ����� ���� ����ϱ�\n");
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
