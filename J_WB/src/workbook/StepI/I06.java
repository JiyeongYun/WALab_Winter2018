package workbook.StepI;

import java.util.Scanner;
import java.util.Random;;

public class I06 {
	private int size_s = 0;
	private int size_m = 0;
	private int size_b = 0;

	/** 생성자 **/
	public I06() {
		input();
	}

	/** 값 출력 **/
	public void printResult() {
		System.out.printf("\n1. 대 (70 이상) : %d회 생성\n",size_b);
		System.out.printf("2. 중 (40 이상) : %d회 생성\n",size_m);
		System.out.printf("3. 소 (40 미만) : %d회 생성\n",size_s);
	}

	/** 갑 입력 **/
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("10개의 숫자를 생성합니다.");
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

	/** 랜덤 값 리턴 **/
	byte GetRandom() {
		
		Random rd = new Random();
		int num = rd.nextInt(100)+1;
		
		System.out.println("생성된 임의의 숫자는 "+num+"입니다.");
		if(num < 40) {
			return 2;
		}else if(40 <= num && num < 70) {
			return 1;
		}else{
			return 0;
		}
		
	}
}
