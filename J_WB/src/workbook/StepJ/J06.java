package workbook.StepJ;

public class J06 {

	/** 생성자 **/
	public J06() {
		printResult();
	}

	/** 결과 출력 **/
	void printResult() {
		System.out.println("1부터 20까지 피보나치 수는 다음과 같습니다.");
		for (int i = 1; i <= 20; i++) {
			System.out.println(i + "번째 : " + fibonacci(i));
		}
	}

	/** 값 계산 **/
	int fibonacci(int n) {
		if (n == 1 || n == 2) return 1;
		else return fibonacci(n - 1) + fibonacci(n - 2);
	}
}
