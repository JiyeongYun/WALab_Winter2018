package workbook.StepE;

import java.util.Scanner;

public class E01 {
	private int length;
	
	/** ������ **/
	public E01() {
		input();
	} 

	/** �� ��� **/
	public void printSquare() {
		for(int i = 0; i<length; i++) {
			for(int j = 0; j<length; j++) {
				System.out.print("# ");
			}
			System.out.println();
		}
	}

	/** �� �Է� **/
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���簢���� ũ�⸦ �Է��ϼ���: ");
		length = sc.nextInt();
	}
}
