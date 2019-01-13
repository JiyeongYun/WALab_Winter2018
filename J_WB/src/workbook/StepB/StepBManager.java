package workbook.StepB;

import java.util.Scanner;

public class StepBManager {
	public StepBManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while (true) {
			printf("---------------------\n");
			printf("1. 나이 계산 및 미성년자 판정\n");
			printf("2. 온도 상호 변환\n");
			printf("3. 직사각형 넓이 계산 및 정사각형 판정\n");
			printf("4. 아파트 평형 계산 및 종류 판정\n");
			printf("5. 날짜 계산\n");
			printf("6. 점수 계산\n");
			printf("7. 파일 전송 시간 계산\n");
			printf("8. 다양한 조건 판정\n");
			printf("9. 비만 판정\n");
			printf("=>원하는 메뉴는?(0:exit) :");
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
				b2.printDegree();
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
				b5.printDate();
				break;
			case 6:
				B6_CalScore b6 = new B6_CalScore();
				b6.printScore();
				break;
			case 7:
				B7_TransTime b7 = new B7_TransTime();
				b7.printTime();
				break;
			case 8:
				B8_VarCondition b8 = new B8_VarCondition();
				b8.printConditional();
				break;
			case 9:
				B9_CheckObesity b9 = new B9_CheckObesity();
				b9.printObesity();
				break;
			
			}
		}

	}

	void printf(String s) {
		System.out.print(s);
	}
}
