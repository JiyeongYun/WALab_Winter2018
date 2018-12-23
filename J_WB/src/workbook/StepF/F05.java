package workbook.StepF;

import java.util.Scanner;

public class F05 {
	private int height;
	private int weight;
	private double bmi;
	private int[][] bmilist = new int[10][3];
	private int count;
	
	/** 생성자 **/
	public F05() {
		input();
	}

	/** 값 출력 **/
	public void printOverBMI() {
		count = 0;
		for (int i = 0; i < bmilist.length; i++) {
			if(bmilist[i][2]>=25) {
				System.out.println((i+1)+"번째 사람은 비만입니다.");
				count++;
			}
		}
		System.out.println("총 "+count+"명의 사람이 비만입니다.");
	}

	/** 갑 입력 **/
	void input() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < bmilist.length; i++) {
			System.out.print((i+1) + "번째 사람의 신장(cm)과 체중(kg)을 입력하세요: ");
			bmilist[i][0] = sc.nextInt();
			bmilist[i][1] = sc.nextInt();
			bmilist[i][2] = getBMI(bmilist[i][0], bmilist[i][1]);
		}
	}

	/** 값 계산 **/
	int getBMI(int h, int w) {
		bmi = w /((h * 0.01) * (h * 0.01));; 
		return (int)bmi;
	}
	
}
