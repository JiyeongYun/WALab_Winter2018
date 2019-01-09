package workbook.StepK;

public class K05 {

	/** 생성자 **/
	public K05() {
		start();
	}

	private void start() {
		UserInfo user = new UserInfo();

		System.out.print("학생의 아이디, 비밀번호를 입력하시오 --> ");
		user.input();
		user.index = 1;

		System.out.println("========================");
		System.out.println("등록된 학생 목록은 다음과 같습니다.");
		System.out.println("------------------------");
		System.out.println("번호\t 아이디\t 비밀번호");
		user.print(user.index);
	}
}
