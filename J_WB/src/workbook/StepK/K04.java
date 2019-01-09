package workbook.StepK;

import java.util.Scanner;

public class K04 {
	private int[] count_area = { 0, 0, 0, 0 };
	private int[] point_area;
	Point p;

	/** ������ **/
	public K04() {
		p = new Point();
		input();
	}

	public void printResult() {
		System.out.println("=========================");
		for (int i = 0; i < point_area.length; i++) {
			System.out.printf("%d��° ��ǥ�� %d��и鿡 ��ġ�մϴ�.\n", i + 1, point_area[i]);
		}
		for (int i = 0; i < count_area.length; i++) {
			System.out.printf("%d��и��� ��ǥ�� ��� %d���Դϴ�.\n", (i + 1), count_area[i]);
		}
	}

	private void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ���� ��ǥ�� �Է��ϰڽ��ϱ�? ");
		int num = sc.nextInt();
		point_area = new int[num];

		for (int i = 0; i < num; i++) {
			System.out.print((i + 1) + "��° ��ǥ��  X,Y ���� �Է��Ͻÿ� --> ");
			double pos_x = sc.nextDouble();
			double pos_y = sc.nextDouble();

			int area = p.get_area(pos_x, pos_y);
			count_area[area - 1]++;
			point_area[i] = area;
		}
	}

}
