package workbook.StepD;

import java.util.Scanner;

public class D02 {
	private int number;
	private int max_num;
	private int min_num;

	/** 생성자 **/
	public D02() {
		input();
	}

	/** 값 출력 **/
	public void printNum() {
		System.out.println("입력된 숫자들 중 가장 큰 수는 "+getMax()+"이고, 가장 작은 수는 "+getMin()+" 입니다.");
	}

	/** 갑 입력 **/
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("0부터 100 사이의 숫자를 입력하세요: ");
		number = sc.nextInt();
		max_num = number;
		min_num = number;
		
		while(true) {
			System.out.print("0부터 100 사이의 숫자를 입력하세요: ");
			number = sc.nextInt();
			if(number<0 || number > 100) {
				break;
			}
			setMax();
			setMin();
		}
	}

	/** 값 계산 **/
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
