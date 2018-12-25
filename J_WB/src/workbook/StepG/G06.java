package workbook.StepG;

import java.util.Scanner;

public class G06 {
	private int total_sale;
	private int price[] = { 10000, 6000, 3000 };

	/** 생성자 **/
	public G06() {
		input();
	}

	/** 갑 입력 **/
	void input() {
		int total_order[] = { 0, 0, 0 };
		int order[] = { 0, 0, 0 };
		
		Scanner sc = new Scanner(System.in);
		System.out.println("세 종류의 제품이 있습니다.");
		System.out.println("1.가죽장갑 1만원, 2. 털장갑 6천원, 3. 비닐장갑 3천원)\n");

		while (true) {
			for (int i = 0; i < price.length; i++) {
				System.out.print((i + 1) + "번 제품은 몇개를 구입하실래요? ");
				order[i] = sc.nextInt();
				total_order[i] += order[i];
			}
			if (order[0] == 0 && order[1] == 0 && order[2] == 0) {
				break;
			}

			System.out.println("판매금액은 " + getSel(order[0], order[1], order[2]) + "원입니다.\n");

		}

		for (int i = 0; i < total_order.length; i++) {
			System.out.println((i + 1) + "번 제품은 총 " + total_order[i] + "개를 구입하셨습니다.");
		}
		System.out.println("지금까지의 총 매출금액은 " + total_sale + "원입니다.");
	}

	/** 값 계산 **/
	int getSel(int n1, int n2, int n3) {
		int sel = 0;
		sel = (n1 * price[0]) + (n2 * price[1]) + (n3 * price[2]);
		total_sale += sel;
		return sel;
	}
}
