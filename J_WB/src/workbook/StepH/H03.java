package workbook.StepH;

import java.util.Random;
import java.util.Scanner;

public class H03 {
	private int lotto_com[] = new int[6];
	private int lotto_user[] = new int[6];

	/** 생성자 **/
	public H03() {
		makeLottoNum();
	}

	/** 로또 번호 출력 **/
	void printLotto() {
		System.out.print("\n이번 주의 로또 당첨 번호는 ");
		for (int i = 0; i < lotto_com.length; i++) {
			System.out.print(lotto_com[i] + " ");
		}
		System.out.println(" 입니다.\n");

		System.out.println("일치하는 로또 번호는 " + getMatch() + "개 입니다.");
	}

	/** 갑 입력 **/
	void makeLottoNum() {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		String onemore;

		// 컴퓨터 로또 생성
		for (int i = 0; i < lotto_com.length; i++) {
			lotto_com[i] = rd.nextInt(45) + 1;

			if (check(i, lotto_com[i], lotto_com)) {
				i--;
			}

		}

		// user 로또 생성
		for (int i = 0; i < lotto_user.length; i++) {
			System.out.print("원하는 " + (i + 1) + "번째 로또 숫자를 입력하세요: ");
			lotto_user[i] = sc.nextInt();

			if (check(i, lotto_user[i], lotto_user)) {
				System.out.println("=> 잘못 입력하셨습니다.");
				i--;
			}
		}

	}

	/** 중복 확인 **/
	boolean check(int last, int num, int lotto[]) {
		for (int i = 0; i < last; i++) {
			if (num == lotto[i] || num < 1 || 45 < num) {
				return true;
			}
		}
		return false;
	}

	/** computer와 user의 로또 번호 중복 확인 **/
	int getMatch() {
		int match_count = 0;

		for (int i = 0; i < lotto_user.length; i++) {
			for (int j = 0; j < lotto_com.length; j++) {
				if (lotto_user[i] == lotto_com[j]) {
					match_count++;
					break; // 한 번 중복된 경우 더 이상 중복될 일이 없기 때문에 내부 for문 탈출
				}
			}
		}

		return match_count;
	}
}
