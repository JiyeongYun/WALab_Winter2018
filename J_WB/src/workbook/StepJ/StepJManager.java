package workbook.StepJ;

import java.util.Scanner;

public class StepJManager {
	public StepJManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while (true) {
			printf("---------------------\n");
			printf("1. ���� ��� �� ���ɴ� ����\n");
			printf("2. �ɻ����� ���\n");
			printf("3. ���� �µ� ���� ���� ����\n");
			printf("4. ���� ��¥ ��� �޼ҵ带 �̿��� ��¥ ���� ����\n");
			printf("5. ���� ���� �ý���\n");
			printf("6. �Ǻ���ġ �� ���ϱ� \n");
			printf("7. 2�� ������ ���ϱ�\n");
			printf("8. Ackermann �� ���ϱ�\n");
			printf("9. pow() �޼ҵ� �����\n");
			printf("10. �Ǻ���ġ ������ Ȳ�ݺ��� ���ϱ�\n");
			printf("=>���ϴ� �޴���?(0:exit) :");
			menu = s.nextInt();
			if (menu == 0)
				break;
			switch (menu) {
			case 1:
				J01 j1 = new J01();
				j1.printResult();
				break;
			case 2:
				J02 j2 = new J02();
				j2.printResult();
				break;
			case 3:
				J03 j3 = new J03();
				j3.printResult();
				break;
			case 4:
				J04 j4 = new J04();
				j4.printResult();
				break;
			case 5:
				J05 j5 = new J05();
				break;
			case 6:
				J06 j6 = new J06();
				break;
			case 7:
				J07 j7 = new J07();
				break;
			case 8:
				J08 j8 = new J08();
				break;
			case 9:
				J09 j9 = new J09();
				break;
			case 10:
				J10 j10 = new J10();
				break;
			}
		}

	}

	void printf(String s) {
		System.out.print(s);
	}
}
