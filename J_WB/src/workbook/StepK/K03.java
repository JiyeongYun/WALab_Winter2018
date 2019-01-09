package workbook.StepK;

import java.util.Scanner;

public class K03 {
	private int[] count_area = {0,0,0,0};

	/** 생성자 **/
	public K03() {
		input();
	}

	public void printResult() {
		for (int i = 0; i < count_area.length; i++) {
			System.out.printf("%d사분면의 좌표는 모두 %d개입니다.\n", (i + 1), count_area[i]);
		}
	}

	private void input() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("좌표의  X,Y 값을 입력하시오 --> ");
		double pos_x = sc.nextDouble();
		double pos_y = sc.nextDouble();
		
		Point p = new Point();
		int area = p.get_area(pos_x, pos_y);
		count_area[area-1]++;
		System.out.println("1번째 좌표는 "+ area +"사분면에 위치합니다.");
	}

}
