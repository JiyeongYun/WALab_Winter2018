package workbook.StepH;

import java.util.Random;
import java.util.Scanner;

public class H04 {
	private int score[][] = { { 0, 0, 0 }, { 0, 0, 0 } };
	
	/** ������ **/
	public H04() {
		input();
	}

	/** �� ��� **/
	public void printResult() {
		System.out.printf("��ǻ�� : �̱� Ƚ���� %dȸ, �� Ƚ�� %dȸ, ��� Ƚ���� %dȸ �Դϴ�.\n",score[0][0],score[0][2],score[0][1]);
		System.out.printf("����� : �̱� Ƚ���� %dȸ, �� Ƚ�� %dȸ, ��� Ƚ���� %dȸ �Դϴ�.\n",score[1][0],score[1][2],score[1][1]);
	}

	/** �� �Է� **/
	void input() {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int com_finger;
		int my_finger;

		while (true) {
			System.out.print("����(1), ����(2), ��(3)�� �Է��ϼ���: ");
			my_finger = sc.nextInt();
			
			while( my_finger < 1 || 3 < my_finger) {
				if(my_finger == 0) break;
				System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
				System.out.print("����(1), ����(2), ��(3)�� �Է��ϼ���: ");
				my_finger = sc.nextInt();
			}
			

			if (my_finger == 0)
				break;
			
			com_finger = rd.nextInt(3) + 1;
			check(my_finger, com_finger);
		}
	}

	/** �¸� ��� **/
	void check(int my, int com) {
		print(com);
		
		if (my < com) { // 1,2 2,3
			if(my == 1 && com == 3) {
				//����� ��!
				score[0][2]++;	//com 	��+1
				score[1][0]++;	//user 	�� +1
				System.out.println("����� ��!");
			}else {
				//��ǻ�� ��!
				score[0][0]++;	//com 	��+1
				score[1][2]++;	//user 	��+1
				System.out.println("��ǻ�� ��!");
			}
		} else if (my == com) {
			//���~!
			score[0][1]++;		//com	��+1
			score[1][1]++;		//user	��+1
			System.out.println("���~!");
		} else if (com < my) {
			if(com == 3 && my == 1) {
				//��ǻ�� ��!
				score[0][0]++;	//com 	��+1
				score[1][2]++;	//user 	��+1
				System.out.println("��ǻ�� ��!");
			}else {
				//����� ��!
				score[0][2]++;	//com 	��+1
				score[1][0]++;	//user 	��+1
				System.out.println("����� ��!");
			}
		}

	}

	void print(int num) {
		switch (num) {
		case 1:
			System.out.print("��ǻ�Ͱ� �� ���� �����Դϴ�. ----> ");
			break;
		case 2:
			System.out.print("��ǻ�Ͱ� �� ���� �����Դϴ�. ----> ");
			break;
		case 3:
			System.out.print("��ǻ�Ͱ� �� ���� ���Դϴ�. ----> ");
			break;
		}
	}

}
