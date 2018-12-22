package workbook.StepD;

import java.util.Scanner;

public class D06 {
	private double m2_area;
	private double pyung_area;
	private int count1 = 0;
	private int count2 = 0;
	private int count3 = 0;
	private int count4 = 0;
	private int i;

	/** 생성자 **/
	public D06() {
		input();
	}

	/** 값 출력 **/
	public void printApart() {
		System.out.println("\"소형 아파트\"의 개수는 " + count1 + " 입니다.");
		System.out.println("\"중소형 아파트\"의 개수는 " + count2 + " 입니다.");
		System.out.println("\"중형 아파트\"의 개수는 " + count3 + " 입니다.");
		System.out.println("\"대형 아파트\"의 개수는 " + count4 + " 입니다.");
	}

	/** 갑 입력 **/
	void input() {
		Scanner sc = new Scanner(System.in);
		for (i = 0; i < 10; i++) {
			System.out.print("아파트의 분양 면적(제곱미터)을 입력하세요: ");
			m2_area = sc.nextDouble();
			System.out.printf("--> 아파트의 평형은 %.1f 입니다.\n", getArea());
			CheckApart();
		}
	}

	/** 값 계산 **/
	double getArea() {
		pyung_area = m2_area / 3.305;
		return pyung_area;
	}

	void CheckApart() {
		if (getArea() < 15) {
			count1++;
		} else if (getArea() >= 15 && getArea() < 30) {
			count2++;
		} else if (getArea() >= 30 && getArea() < 50) {
			count3++;
		} else if (getArea() >= 50) {
			count4++;
		}
	}

}
