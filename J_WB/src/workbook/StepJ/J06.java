package workbook.StepJ;

public class J06 {

	/** ������ **/
	public J06() {
		printResult();
	}

	/** ��� ��� **/
	void printResult() {
		System.out.println("1���� 20���� �Ǻ���ġ ���� ������ �����ϴ�.");
		for (int i = 1; i <= 20; i++) {
			System.out.println(i + "��° : " + fibonacci(i));
		}
	}

	/** �� ��� **/
	int fibonacci(int n) {
		if (n == 1 || n == 2) return 1;
		else return fibonacci(n - 1) + fibonacci(n - 2);
	}
}
