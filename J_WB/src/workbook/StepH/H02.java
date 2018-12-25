package workbook.StepH;

import java.util.Scanner;
import java.util.Random;

public class H02 {
	private int lotto[] = new int[6];

	/** 생성자 **/
	public H02() {
		makeLottoNum();
	}

	/** 갑 입력 **/
	void makeLottoNum() {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		String onemore;

		while (true) {
			for (int i = 0; i < lotto.length; i++) {
				lotto[i] = rd.nextInt(45) + 1;

				if (check(i, lotto[i])) {
					i--;
				}
			}

			printLotto();

			System.out.print("더 만드시겠습니까? (Y/N) ");
			onemore = sc.next();
			if (onemore.equalsIgnoreCase("N")) {
				break;
			}
		}

	}

	/** 로또 번호 출력 **/
	void printLotto() {
		System.out.print("생성된 로또 번호는 ");
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
		System.out.println(" 입니다.");
	}

	/** 중복 확인 **/
	boolean check(int last, int num) {
		for (int i = 0; i < last; i++) {
			if (lotto[i] == num) {
				return true;
			}
		}
		return false;
	}
}
