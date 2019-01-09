package workbook.StepK;

import java.util.Scanner;

public class K04 {
	private int[] count_area = { 0, 0, 0, 0 };
	private int[] point_area;
	Point p;

	/** 생성자 **/
	public K04() {
		p = new Point();
		input();
	}

	public void printResult() {
		System.out.println("=========================");
		for (int i = 0; i < point_area.length; i++) {
			System.out.printf("%d번째 좌표는 %d사분면에 위치합니다.\n", i + 1, point_area[i]);
		}
		for (int i = 0; i < count_area.length; i++) {
			System.out.printf("%d사분면의 좌표는 모두 %d개입니다.\n", (i + 1), count_area[i]);
		}
	}

	private void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 개의 좌표를 입력하겠습니까? ");
		int num = sc.nextInt();
		point_area = new int[num];

		for (int i = 0; i < num; i++) {
			System.out.print((i + 1) + "번째 좌표의  X,Y 값을 입력하시오 --> ");
			double pos_x = sc.nextDouble();
			double pos_y = sc.nextDouble();

			int area = p.get_area(pos_x, pos_y);
			count_area[area - 1]++;
			point_area[i] = area;
		}
	}

}
