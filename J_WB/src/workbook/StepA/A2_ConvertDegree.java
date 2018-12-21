package workbook.StepA;

import java.util.Scanner;

public class A2_ConvertDegree {
	private double c_degree;
	private double f_degree;
	
	/**생성자**/
	public A2_ConvertDegree(){
		input();
	}
	
	/**값 출력**/
	public void printDegree() {
		System.out.println("화씨 온도는 " + getDegree() + " 도 입니다.");
	}	
	
	/**갑 입력**/
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("섭씨 온도를 입력하시오. ");
		this.c_degree = sc.nextDouble();
	}	
	
	/**값 계산**/
	double getDegree() {
		f_degree = c_degree * 1.8 + 32;
		return this.f_degree;
	}	
	
}
