package workbook.StepE;

import java.util.Scanner;

public class E01 {
	private int length;
	private int i;
	private int j;
	
	/** 생성자 **/
	public E01() {
		input();
	} 

	/** 값 출력 **/
	public void printSquare() {
		for(i = 0; i<length; i++) {
			for(j = 0; j<length; j++) {
				System.out.print("# ");
			}
			System.out.println();
		}
	}

	/** 갑 입력 **/
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정사각형의 크기를 입력하세요: ");
		length = sc.nextInt();
	}
}
