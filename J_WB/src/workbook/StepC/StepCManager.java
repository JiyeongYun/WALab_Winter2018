package workbook.StepC;

import java.util.Scanner;

public class StepCManager {
	public StepCManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while (true) {
			printf("---------------------\n");
			printf("1. ���� ��� �� ���ɴ� ����\n");
			printf("2. ���� �µ� ���� ����\n");
			printf("3. ���簢�� ���� ����\n");
			printf("4. ����Ʈ ���� ��� �� ���� ����\n");
			printf("5. ���� ��¥ ���\n");
			printf("6. ���� ���\n");
			printf("7. ���� ���� �ð� ���\n");
			printf("8. 3���� �� �� �ִ񰪰� �ּڰ� ���ϱ�\n");
			printf("9. �ҵ漼 ���\n");
			printf("10. ������ ��Ģ���� ����\n");
			printf("11. ���� �����ϱ�\n");
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
			case 11:

				break;
			}
		}

	}

	void printf(String s) {
		System.out.print(s);
	}
}
