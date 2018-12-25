package workbook.StepG;

import java.util.Scanner;

public class StepGManager {
	public StepGManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while (true) {
			printf("---------------------\n");
			printf("1. ���� ��� �� ���ɴ� ����\n");
			printf("2. ���� �µ� ���� ����\n");
			printf("3. ���� ���\n");
			printf("4. �ε��� �߰� ������ ����\n");
			printf("5. PC�� �̿�� ����\n");
			printf("6. ���θ� ���� ����\n");
			printf("7. ���̰��� ��ǥ��\n");
			printf("=>���ϴ� �޴���?(0:exit) :");
			menu = s.nextInt();
			if (menu == 0)
				break;
			switch (menu) {
			case 1:
				G01 g1 = new G01();
				g1.printResult();
				break;
			case 2:
				G02 g2 = new G02();
				g2.printDegree();
				break;
			case 3:
				G03 g3 = new G03();
				g3.printGrade();
				break;
			case 4:
				G04 g4 = new G04();
				break;
			case 5:
				G05 g5 = new G05();
				break;
			case 6:
				G06 g6 = new G06();
				break;
			case 7:
				G07 g7 = new G07();
				g7.printResult();
				break;
			}
		}

	}

	void printf(String s) {
		System.out.print(s);
	}
}
