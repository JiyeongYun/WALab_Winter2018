package workbook.StepK;

import java.util.Scanner;

public class K06 {

	/** 생성자 **/
	public K06() {
		start();
	}

	private void start() {
		Scanner sc = new Scanner(System.in);
		System.out.print("등록할 학생의 명수는? ");
		int num = sc.nextInt();

		UserInfo user[] = new UserInfo[num];
		for (int i = 0; i < num; i++) {
			user[i] = new UserInfo();
			System.out.print((i + 1) + "번 학생의 아이디, 비밀번호를 입력하시오 --> ");
			user[i].input();
			user[i].index = (i + 1);
		}

		System.out.println("========================");
		System.out.println("등록된 학생 목록은 다음과 같습니다.");
		System.out.println("------------------------");
		System.out.println("번호\t 아이디\t 비밀번호");
		for (int i = 0; i < user.length; i++) {
			user[i].print(user[i].index);
		}

	}
}
