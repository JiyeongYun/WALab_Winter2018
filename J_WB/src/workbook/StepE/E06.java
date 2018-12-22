package workbook.StepE;

import java.util.Scanner;

public class E06 {
	private int row;
	private int columns;
	private int number;
 
	/** 생성자 **/
	public E06() {
		input();
	}

	/** 값 출력 **/
	public void printDimen() {
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= columns; j++) {
				System.out.print("\t" + j * i);
			}
			System.out.println();
		}
	}

	/** 갑 입력 **/
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("출력하려는 행의 크기와 열의 크기를 입력하세요: ");
		row = sc.nextInt();
		columns = sc.nextInt();
	}
}
