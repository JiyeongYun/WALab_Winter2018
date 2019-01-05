package workbook.StepJ;

public class J10 {

	/** 생성자 **/
	public J10() {
		printResult();
	}

	/** 결과 출력 **/
	void printResult() {
		int i = 1;
		double before = -1;
		while (true) {
			int n1 = fibonacci(i);
			int n2 = fibonacci(i + 1);
			double rate = (double) n2 / (double) n1;

			System.out.printf("%d번째 비율 (%d / %d) : %f\n", i, n2, n1, rate);
			if (Math.abs(rate - before) < 0.000001) {
				break;
			}
			i++;
			before = rate;
		}
	}

	int fibonacci(int n) {
		if (n == 1 || n == 2)
			return 1;
		else
			return fibonacci(n - 1) + fibonacci(n - 2);
	}
}
