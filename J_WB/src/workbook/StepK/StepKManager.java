package workbook.StepK;

import java.util.Scanner;

public class StepKManager {
	public StepKManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while (true) {
			printf("---------------------\n");
			printf("1. �޴��� �����ϱ�\n");
			printf("2. �޴��� �����ϱ�\n");
			printf("3. ��ǥ �����ϱ�\n");
			printf("4. ��ǥ �����ϱ�\n");
			printf("5. ����� ��� �����ϱ�\n");
			printf("6. ����� ��� �����ϱ�\n");
			printf("7. �л� ���� ��� �����ϱ�\n");
			printf("=>���ϴ� �޴���?(0:exit) :");
			menu = s.nextInt();
			if (menu == 0)
				break;
			switch (menu) {
			case 1:
				K01 k1 = new K01();
				break;
			case 2:
				K02 k2 = new K02();
				break;
			case 3:
				K03 k3 = new K03();
				k3.printResult();
				break;
			case 4:
				K04 k4 = new K04();
				k4.printResult();
				break;
			case 5:
				K05 k5 = new K05();
				break;
			case 6:
				K06 k6 = new K06();
				break;
			case 7:
				K07 k7 = new K07();
				break;
			}
		}

	}

	void printf(String s) {
		System.out.print(s);
	}
}
