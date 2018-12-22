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

	/** 생성자 **/
	public D05() {
		input();
	}

	/** 값 출력 **/
	public void printRect() {
		System.out.println("\"정사각형\"의 개수는 " + count1 + " 입니다.");
		System.out.println("\"좌우로 길쭉한 직사각형\"의 개수는 " + count2 + " 입니다.");
		System.out.println("\"위아래로 길쭉한 직사각형\"의 개수는 " + count3 + " 입니다.");
		System.out.println("\"일반적인 가로형 직사각형\"의 개수는 " + count4 + " 입니다.");
		System.out.println("\"일반적인 세로형 직사각형\"의 개수는 " + count5 + " 입니다.");
	}

	/** 갑 입력 **/
	void input() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("직사각형의 가로 크기와 세로 크기를 입력하세요: ");
			width = sc.nextInt();
			height = sc.nextInt();
			if (width <= 0 || height <= 0) {
				break;
			}
			CheckRect();
		}
	}

	/** 값 계산 **/
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
