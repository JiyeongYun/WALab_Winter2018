package workbook.StepF;

import java.util.Scanner;

public class StepFManager {
	public StepFManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while (true) {
			printf("---------------------\n");
			printf("1. 두 번째로 큰 수의 순서 찾기\n");
			printf("2. 심사점수 계산\n");
			printf("3. 5명의 국, 영, 수 3과목 점수의 과목별 총점, 평균값 구하기\n");
			printf("4. 5명의 국, 영, 수 3과목 점수의 학생별 총점, 평균값 구하기\n");
			printf("5. 비만 판정\n");
			printf("6. 5층 아파트의 거주자 숫자 구하기\n");
			printf("7. 5층 아파트의 층별, 호수별 거주자 숫자 구하기\n");
			printf("8. 겹치지 않는 숫자 10개 입력 받기\n");
			printf("9. 배열을 이용한 연중 날짜 계산\n");
			printf("=>원하는 메뉴는?(0:exit) :");
			menu = s.nextInt();
			if (menu == 0)
				break;
			switch (menu) {
			case 1:

				break;
			case 2:

				break;
			case 3:

				break;
			case 4:

				break;
			case 5:

				break;
			case 6:
				
				break;
			case 7:
				
				break;
			case 8:
				
				break;
			case 9:
				
				break;
			}
		}

	}

	void printf(String s) {
		System.out.print(s);
	}
	
}
