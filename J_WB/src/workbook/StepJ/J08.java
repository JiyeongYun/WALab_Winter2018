package workbook.StepJ;

public class J08 {

	/** 생성자 **/
	public J08() {
		printResult();
	}

	/** 결과 출력 **/
	void printResult() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.printf("Ackermann(%d,%d) = %d\n", i, j, Ackermann(i, j));
			}
		}
	}

	/** 값 계산 **/
	int Ackermann(int i, int j) {
		if (i == 0 && j >= 0) {
			return j + 1;
		} else if (i > 0 && j == 0) {
			return Ackermann(i - 1, 1);
		} else {
			return Ackermann(i - 1, Ackermann(i, j - 1));
		}
	}
}
