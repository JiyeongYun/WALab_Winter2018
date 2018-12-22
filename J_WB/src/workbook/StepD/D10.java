package workbook.StepD;

import java.util.Scanner;

public class D10 {
	private int num1;
	private int num2;
	
	/** 생성자 **/
	public D10() {
		input();
	}

	/** 값 출력 **/
	public void printMulti() {
		for(int i = 1; i <= 100; i++) {
			if(i%num1==0 || i%num2==0) {
				if(i%num1==0 && i%num2==0) {
					continue;
				}else {
					System.out.print(i+", ");
				}
			}
		}
		System.out.println("");
	}
  
	/** 갑 입력 **/
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("2개의 숫자를 입력하세요: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
	}
	
}
