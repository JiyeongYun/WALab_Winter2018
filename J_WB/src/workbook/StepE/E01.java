package workbook.StepE;

import java.util.Scanner;

public class E01 {
	private int length;
	private int i;
	private int j;
	
	/** ������ **/
	public E01() {
		input();
	} 

	/** �� ��� **/
	public void printSquare() {
		for(i = 0; i<length; i++) {
			for(j = 0; j<length; j++) {
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
