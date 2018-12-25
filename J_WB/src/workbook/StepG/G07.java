package workbook.StepG;

import java.util.Scanner;

public class G07 {
	private int charge[] = { 5000, 10000, 15000, 3000 };
	private int v_count[] = { 0, 0, 0, 0 };
	private int count[] = { 0, 0, 0, 0 };
	private int total_sum = 0;
	int total_count = 0;

	/** 생성자 **/
	public G07() {
		input();
	}

	/** 값 출력 **/
	public void printResult() {
		System.out.println("\n오늘 총 방문자 수는 " + total_count + "명입니다.");
		System.out.println("초등학생 수는 " + v_count[0] + "명입니다.");
		System.out.println("청소년 수는 " + v_count[1] + "명입니다.");
		System.out.println("일반인 수는 " + v_count[2] + "명입니다.");
		System.out.println("경로대상 수는 " + v_count[3] + "명입니다.\n");
		System.out.println("총 입장료는 " + total_sum + "원입니다.");
	}

	/** 갑 입력 **/
	void input() {
		Scanner sc = new Scanner(System.in);

		System.out.print("오늘 방문한 팀 수를 입력하세요: ");
		int team_count = sc.nextInt();

		for (int i = 0; i < team_count; i++) {

			/** 대상에 따른 인원수 받기 **/
			System.out.print((i + 1) + "번팀 인원수(초등학생, 청소년, 일반, 경로대상)를 입력하세요: ");
			for (int j = 0; j < count.length; j++) {
				count[j] = sc.nextInt();
				total_count += count[j];
				v_count[j] += count[j];
			}

			/** 할인카드 종류 받기 **/
			System.out.print((i + 1) + "번팀 할인카드 종류(카드없음:0, 일반등급:1, VIP등급:2)를 입력하세요: ");
			int membership = sc.nextInt();

			System.out.println((i + 1) + "번팀 입장료는 " + getPay(count, membership) + "원입니다.");
		}

	}

	/** 입장료 계산 **/
	int getPay(int[] c, int m) {
		int sum = 0;
		for (int i = 0; i < charge.length; i++) {
			sum += c[i] * charge[i];
		}

		if (m == 1) {
			sum = (int) (sum * 0.9);
		} else if (m == 2) {
			sum = (int) (sum * 0.8);
		}

		total_sum += sum;
		return sum;
	}
}
