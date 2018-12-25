package workbook.StepG;

import java.util.Scanner;

public class StepGManager {
	public StepGManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while (true) {
			printf("---------------------\n");
			printf("1. 나이 계산 및 연령대 판정\n");
			printf("2. 물의 온도 구간 판정\n");
			printf("3. 점수 계신\n");
			printf("4. 부동산 중계 수수료 계산기\n");
			printf("5. PC방 이용료 계산기\n");
			printf("6. 쇼핑몰 매출 계산기\n");
			printf("7. 놀이공원 매표소\n");
			printf("=>원하는 메뉴는?(0:exit) :");
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
