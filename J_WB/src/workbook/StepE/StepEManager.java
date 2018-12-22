package workbook.StepE;

import java.util.Scanner;

public class StepEManager {
	public StepEManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while (true) {
			printf("---------------------\n");
			printf("1. �Է��� ���� ũ���� ���簢�� ����ϱ�\n");
			printf("2. �Է��� ���� ũ���� ���̸� ���� ������ �ﰢ�� ����ϱ�\n");
			printf("3. �Է��� ���� ũ���� ���̸� ���� �̵ �ﰢ�� ����ϱ�\n");
			printf("4. Ȧ���� �Ǵ� ¦������ ������ ����ϱ�\n");
			printf("5. Ȧ���� �Ǵ� ¦������ �������� ���� ������ ���߾� ����ϱ�\n");
			printf("6. 2���� ���� ����ϱ�\n");
			printf("=>���ϴ� �޴���?(0:exit) :");
			menu = s.nextInt();
			if (menu == 0)
				break;
			switch (menu) {
			case 1:
				E01 e1 = new E01();
				e1.printSquare();
				break;
			case 2:
				E02 e2 = new E02();
				e2.printTriangle();
				break;
			case 3:
				E03 e3 = new E03();
				e3.printTriangle();
				break;
			case 4:
				E04 e4 = new E04();
				e4.printGugu();
				break;
			case 5:
				E05 e5 = new E05();
				e5.printGugu();
				break;
			case 6:
				E06 e6 = new E06();
				e6.printDimen();
				break;
			}
		}

	}

	void printf(String s) {
		System.out.print(s);
	}
}
