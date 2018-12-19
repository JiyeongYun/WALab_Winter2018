package workbook.StepA;

import java.util.Scanner;

public class A2_ConvertDegree {

	private double c_degree;
	private double f_degree;
	
	public A2_ConvertDegree(){
		input();
	}
	
	public void printDegree() {
		System.out.println("화씨 온도는 " + getDegree() + " 도 입니다.");
	}	
	
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("섭씨 온도를 입력하시오. ");
		double c_degree = sc.nextDouble();
	}	
	
	double getDegree() {
		f_degree = c_degree * 1.8 + 32;
		return this.f_degree;
	}	
	
}
