package workbook.StepJ;

public class J10 {

	/** ������ **/
	public J10() {
		printResult();
	}

	/** ��� ��� **/
	void printResult() {
		int i = 1;
		double before = -1;
		while (true) {
			int n1 = fibonacci(i);
			int n2 = fibonacci(i + 1);
			double rate = (double) n2 / (double) n1;

			System.out.printf("%d��° ���� (%d / %d) : %f\n", i, n2, n1, rate);
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
