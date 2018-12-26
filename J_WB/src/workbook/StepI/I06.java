package workbook.StepI;

import java.util.Scanner;
import java.util.Random;;

public class I06 {
	private int size_s = 0;
	private int size_m = 0;
	private int size_b = 0;

	/** ������ **/
	public I06() {
		input();
	}

	/** �� ��� **/
	public void printResult() {
		System.out.printf("\n1. �� (70 �̻�) : %dȸ ����\n",size_b);
		System.out.printf("2. �� (40 �̻�) : %dȸ ����\n",size_m);
		System.out.printf("3. �� (40 �̸�) : %dȸ ����\n",size_s);
	}

	/** �� �Է� **/
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("10���� ���ڸ� �����մϴ�.");
		for(int i = 0; i<10; i++) {
			int temp = GetRandom();
			if(temp == 0) {
				size_b++;
			}else if(temp == 1) {
				size_m++;
			}else if(temp == 2) {
				size_s++;
			}
		}

	}

	/** ���� �� ���� **/
	byte GetRandom() {
		
		Random rd = new Random();
		int num = rd.nextInt(100)+1;
		
		System.out.println("������ ������ ���ڴ� "+num+"�Դϴ�.");
		if(num < 40) {
			return 2;
		}else if(40 <= num && num < 70) {
			return 1;
		}else{
			return 0;
		}
		
	}
}
