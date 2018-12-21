package workbook.StepB;

import java.util.Scanner;

import workbook.StepA.A1_YearToAge;
import workbook.StepA.A2_ConvertDegree;
import workbook.StepA.A3_RectArea;
import workbook.StepA.A4_PyungArea;
import workbook.StepA.A5_DayToSecond;
import workbook.StepA.A6_TotalAndAvg;
import workbook.StepA.A7_GigaToByte;

public class StepBManager {
	public StepBManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while (true) {
			printf("---------------------\n");
			printf("1. ���� ��� �� �̼����� ����\n");
			printf("2. �µ� ��ȣ ��ȯ\n");
			printf("3. ���簢�� ���� ��� �� ���簢�� ����\n");
			printf("4. ����Ʈ ���� ��� �� ���� ����\n");
			printf("5. ��¥ ���\n");
			printf("6. ���� ���\n");
			printf("7. ���� ���� �ð� ���\n");
			printf("8. �پ��� ���� ����\n");
			printf("9. �� ����\n");
			printf("=>���ϴ� �޴���?(0:exit) :");
			menu = s.nextInt();
			if (menu == 0)
				break;
			switch (menu) {
			case 1:
				B1_CheckTeen b1 = new B1_CheckTeen();
				b1.printAge();
				break;
			case 2:
				B2_ConvertDegree b2 = new B2_ConvertDegree();
				b2.printArea();
				break;
			case 3:
				B3_CheckSquare b3 = new B3_CheckSquare();
				b3.printArea();
				break;
			case 4:
				B4_ApartSize b4 = new B4_ApartSize();
				b4.printArea();
				break;
			case 5:
				B5_CalDate b5 = new B5_CalDate();
				b5.printArea();
				break;
			case 6:
				B6_CalScore b6 = new B6_CalScore();
				b6.printArea();
				break;
			case 7:
				B7_TransTime b7 = new B7_TransTime();
				b7.printArea();
				break;
			case 8:
				B8_VarCondition b8 = new B8_VarCondition();
				b8.printArea();
				break;
			case 9:
				B9_CheckObesity b9 = new B9_CheckObesity();
				b9.printArea();
				break;
			
			}
		}

	}

	void printf(String s) {
		System.out.print(s);
	}
}
