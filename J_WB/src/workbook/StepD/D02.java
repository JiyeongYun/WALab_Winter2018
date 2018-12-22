package workbook.StepD;

import java.util.Scanner;

public class D02 {
	private int number;
	private int max_num;
	private int min_num;

	/** ������ **/
	public D02() {
		input();
	}

	/** �� ��� **/
	public void printNum() {
		System.out.println("�Էµ� ���ڵ� �� ���� ū ���� "+getMax()+"�̰�, ���� ���� ���� "+getMin()+" �Դϴ�.");
	}

	/** �� �Է� **/
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("0���� 100 ������ ���ڸ� �Է��ϼ���: ");
		number = sc.nextInt();
		max_num = number;
		min_num = number;
		
		while(true) {
			System.out.print("0���� 100 ������ ���ڸ� �Է��ϼ���: ");
			number = sc.nextInt();
			if(number<0 || number > 100) {
				break;
			}
			setMax();
			setMin();
		}
	}

	/** �� ��� **/
	void setMax() {
		if(max_num<number) {
			max_num = number;
		}
	}
	void setMin() {
		if(min_num>number) {
			min_num = number;
		}
	}
	int getMax() {
		return max_num;
	}
	int getMin() {
		return min_num;
	}
}
