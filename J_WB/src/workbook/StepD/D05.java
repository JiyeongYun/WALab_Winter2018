package workbook.StepD;

import java.util.Scanner;

public class D05 {
	private int width;
	private int height;
	private int count1 = 0;
	private int count2 = 0;
	private int count3 = 0;
	private int count4 = 0;
	private int count5 = 0;

	/** ������ **/
	public D05() {
		input();
	}

	/** �� ��� **/
	public void printRect() {
		System.out.println("\"���簢��\"�� ������ " + count1 + " �Դϴ�.");
		System.out.println("\"�¿�� ������ ���簢��\"�� ������ " + count2 + " �Դϴ�.");
		System.out.println("\"���Ʒ��� ������ ���簢��\"�� ������ " + count3 + " �Դϴ�.");
		System.out.println("\"�Ϲ����� ������ ���簢��\"�� ������ " + count4 + " �Դϴ�.");
		System.out.println("\"�Ϲ����� ������ ���簢��\"�� ������ " + count5 + " �Դϴ�.");
	}

	/** �� �Է� **/
	void input() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("���簢���� ���� ũ��� ���� ũ�⸦ �Է��ϼ���: ");
			width = sc.nextInt();
			height = sc.nextInt();
			if (width <= 0 || height <= 0) {
				break;
			}
			CheckRect();
		}
	}

	/** �� ��� **/
	void CheckRect() {
		if (width == height) {
			count1++;
		} else if (width >= height * 2) {
			count2++;
		} else if (height >= width * 2) {
			count3++;
		} else if (width > height) {
			count4++;
		} else if (height > width) {
			count5++;
		}
	}

}
