package workbook.StepI;

import java.util.Scanner;

public class StepIManager {
	public StepIManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while (true) {
			printf("---------------------\n");
			printf("1. �޴��� �����ִ� �޼ҵ� �����\n");
			printf("2. ��ĭ�� �Բ� Ư�� ���ڸ� ������ŭ ��� �޼ҵ� �����\n");
			printf("3. �� ����\n");
			printf("4. �޴� ��ȣ �޾ƿ��� �޼ҵ� �����\n");
			printf("5. �ִ� �����ϴ� �޼ҵ� �����\n");
			printf("6. ������ ���ڸ� ����� ������ �����ϴ� �޼ҵ� �����\n");
			printf("7. ���Ǳ⿡�� ������ ���� ������ �����ϴ� �޼ҵ� �����\n");
			printf("=>���ϴ� �޴���?(0:exit) :");
			menu = s.nextInt();
			if (menu == 0)
				break;
			switch (menu) {
			case 1:
				I01 i1 = new I01();
				break;
			case 2:
				I02 i2 = new I02();
				i2.printResult();
				break;
			case 3:
				I03 i3 = new I03();
				break;
			case 4:
				I04 i4 = new I04();
				break;
			case 5:
				I05 i5 = new I05();
				break;
			case 6:
				I06 i6 = new I06();
				i6.printResult();
				break;
			case 7:
				I07 i7 = new I07();
				break;
			}
		}

	}

	void printf(String s) {
		System.out.print(s);
	}
}
