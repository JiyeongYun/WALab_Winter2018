package workbook.StepH;

import java.util.Random;
import java.util.Scanner;

public class H04 {
	private int score[][] = { { 0, 0, 0 }, { 0, 0, 0 } };
	
	/** 생성자 **/
	public H04() {
		input();
	}

	/** 값 출력 **/
	public void printResult() {
		System.out.printf("컴퓨터 : 이긴 횟수는 %d회, 진 횟수 %d회, 비긴 횟수는 %d회 입니다.\n",score[0][0],score[0][2],score[0][1]);
		System.out.printf("사용자 : 이긴 횟수는 %d회, 진 횟수 %d회, 비긴 횟수는 %d회 입니다.\n",score[1][0],score[1][2],score[1][1]);
	}

	/** 갑 입력 **/
	void input() {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int com_finger;
		int my_finger;

		while (true) {
			System.out.print("가위(1), 바위(2), 보(3)를 입력하세요: ");
			my_finger = sc.nextInt();
			
			while( my_finger < 1 || 3 < my_finger) {
				if(my_finger == 0) break;
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
				System.out.print("가위(1), 바위(2), 보(3)를 입력하세요: ");
				my_finger = sc.nextInt();
			}
			

			if (my_finger == 0)
				break;
			
			com_finger = rd.nextInt(3) + 1;
			check(my_finger, com_finger);
		}
	}

	/** 승리 계산 **/
	void check(int my, int com) {
		print(com);
		
		if (my < com) { // 1,2 2,3
			if(my == 1 && com == 3) {
				//사용자 승!
				score[0][2]++;	//com 	패+1
				score[1][0]++;	//user 	승 +1
				System.out.println("사용자 승!");
			}else {
				//컴퓨터 승!
				score[0][0]++;	//com 	승+1
				score[1][2]++;	//user 	패+1
				System.out.println("컴퓨터 승!");
			}
		} else if (my == com) {
			//비김~!
			score[0][1]++;		//com	무+1
			score[1][1]++;		//user	무+1
			System.out.println("비김~!");
		} else if (com < my) {
			if(com == 3 && my == 1) {
				//컴퓨터 승!
				score[0][0]++;	//com 	승+1
				score[1][2]++;	//user 	패+1
				System.out.println("컴퓨터 승!");
			}else {
				//사용자 승!
				score[0][2]++;	//com 	패+1
				score[1][0]++;	//user 	승+1
				System.out.println("사용자 승!");
			}
		}

	}

	void print(int num) {
		switch (num) {
		case 1:
			System.out.print("컴퓨터가 낸 것은 가위입니다. ----> ");
			break;
		case 2:
			System.out.print("컴퓨터가 낸 것은 바위입니다. ----> ");
			break;
		case 3:
			System.out.print("컴퓨터가 낸 것은 보입니다. ----> ");
			break;
		}
	}

}
