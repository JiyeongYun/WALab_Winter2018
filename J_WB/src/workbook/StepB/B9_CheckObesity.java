package workbook.StepB;

import java.util.Scanner;

public class B9_CheckObesity {
	private int height;
	private int weight;
	private int bmi;

	/** 생성자 **/
	public B9_CheckObesity() {
		input();
	}

	/** 값 출력 **/
	public void printObesity() {
		if (getBMI() >= 25) {
			System.out.println("당신은 비만이십니다.");
		} else {
			System.out.println("당신은 비만이 아니군요.");
		}
	}

	/** 갑 입력 **/
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("신장(cm단위)을 입력하세요 ");
		height = sc.nextInt();
		System.out.print("체중(kg단위)을 입력하세요 ");
		weight = sc.nextInt();
	}

	/** 값 계산 **/
	int getBMI() {
		bmi = weight / (int) ((height * 0.01) * (height * 0.01));
		return bmi;
	}

}
