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
				D01 d1 = new D01();
				d1.printTotal();
				break;
			case 2:
				D02 d2 = new D02();
				d2.printNum();
				break;
			case 3:
				D03 d3 = new D03();
				d3.printResult();
				break;
			case 4:
				D04 d4 = new D04();
				d4.printYoung();
				break;
			case 5:
				D05 d5 = new D05();
				d5.printRect();
				break;
			case 6:
				D06 d6 = new D06();
				d6.printApart();
				break;
			case 7:
				D07 d7 = new D07();
				d7.printResult();
				break;
			case 8:
				D08 d8 = new D08();
				d8.printResult();
				break;
			case 9:
				D09 d9 = new D09();
				d9.printGugudan();
				break;
			case 10:
				D10 d10 = new D10();
				d10.printMulti();
				break;
			}
		}

	}

	void printf(String s) {
		System.out.print(s);
	}
}
