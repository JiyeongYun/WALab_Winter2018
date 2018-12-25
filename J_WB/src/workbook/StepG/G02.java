package workbook.StepG;

import java.util.Scanner;

public class G02 {
	private double degrees[] = new double[10];
	private String degree_count[] = new String[10];
	private String degree_name[] = { "냉수", "미온수", "온수", "끓는물" };
	private int count[] = { 0, 0, 0, 0 };

	/** 생성자 **/
	public G02() {
		input();
	}

	/** 값 출력 **/
	public void printDegree() {
		for (int i = 0; i < degrees.length; i++) {
			System.out.printf("%d번 물의 온도는 %.1f도 입니다. %s\n", (i + 1), degrees[i], degree_count[i]);
		}
		for (int i = 0; i < degree_name.length; i++) {
			System.out.printf("%s 입력 횟수 : %d\n", degree_name[i], count[i]);
		}
	}

	/** 갑 입력 **/
	void input() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < degrees.length; i++) {
			System.out.print((i + 1) + "번 물의 온도를 입력하세요: ");
			degrees[i] = sc.nextDouble();
			int temp = getSel(degrees[i]);
			if (temp == -1) {
				System.out.println("잘못 입력하셨습니다.");
				i--;
			} else {
				setCount(i, temp);
			}
		}
	}

	/** 온도 판정 **/
	int getSel(double d) {
		if (0 <= d && d < 25) {
			return 0; // 냉수
		} else if (25 <= d && d < 40) {
			return 1; // 미온수
		} else if (40 <= d && d < 80) {
			return 2; // 온수
		} else if (80 <= d) {
			return 3; // 끓는 물
		}
		return -1;
	}

	/** count 세팅 **/
	void setCount(int i, int flag) {
		degree_count[i] = degree_name[flag];
		count[flag]++;
	}
}
