package workbook.StepD;

import java.util.Scanner;

public class D10 {
	private int num1;
	private int num2;
	
	/** ������ **/
	public D10() {
		input();
	}

	/** �� ��� **/
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
  
	/** �� �Է� **/
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("2���� ���ڸ� �Է��ϼ���: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
	}
	
}
