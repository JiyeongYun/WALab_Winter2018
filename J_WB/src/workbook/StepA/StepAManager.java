package workbook.StepA;

import java.util.Scanner;

public class StepAManager {
	public StepAManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while (true) {
			printf("---------------------\n");
			printf("1. ���̰��\n");
			printf("2. �µ���ȯ\n");
			printf("3. ���簢�� ���̰��\n");
			printf("4. ����Ʈ ���� ���\n");
			printf("5. ��¥���\n");
			printf("6. �������\n");
			printf("7. ���� �뷮 ���\n");
			printf("=>���ϴ� �޴���?(0:exit) :");
			menu = s.nextInt();
			if (menu == 0)
				break;
			switch (menu) {
			case 1:
				A1_YearToAge a1 = new A1_YearToAge();
				a1.printAge();
			case 2:
				A2_ConvertDegree a2 = new A2_ConvertDegree();
				a2.printDegree();
			case 3:
				A3_RectArea a3 = new A3_RectArea();
				a3.printArea();
			case 4:
				A4_PyungArea a4 = new A4_PyungArea();
				a4.printArea();
			case 5:
				A5_DayToSecond a5 = new A5_DayToSecond();
				a5.printSeconds();
			case 6:
				A6_TotalAndAvg a6 = new A6_TotalAndAvg();
				a6.printResult();
			case 7:
				A7_GigaToByte a7 = new A7_GigaToByte();
				a7.printResult();
			case 0:
				System.exit(0);
			}
		}

	}

	void printf(String s) {
		System.out.print(s);
	}
}