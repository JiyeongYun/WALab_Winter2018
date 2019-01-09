package workbook.StepK;

import java.util.Scanner;

public class K03 {
	private int[] count_area = {0,0,0,0};

	/** ������ **/
	public K03() {
		input();
	}

	public void printResult() {
		for (int i = 0; i < count_area.length; i++) {
			System.out.printf("%d��и��� ��ǥ�� ��� %d���Դϴ�.\n", (i + 1), count_area[i]);
		}
	}

	private void input() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��ǥ��  X,Y ���� �Է��Ͻÿ� --> ");
		double pos_x = sc.nextDouble();
		double pos_y = sc.nextDouble();
		
		Point p = new Point();
		int area = p.get_area(pos_x, pos_y);
		count_area[area-1]++;
		System.out.println("1��° ��ǥ�� "+ area +"��и鿡 ��ġ�մϴ�.");
	}

}
