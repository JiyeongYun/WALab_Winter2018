package workbook.StepK;

import java.util.Scanner;

public class K06 {

	/** ������ **/
	public K06() {
		start();
	}

	private void start() {
		Scanner sc = new Scanner(System.in);
		System.out.print("����� �л��� �����? ");
		int num = sc.nextInt();

		UserInfo user[] = new UserInfo[num];
		for (int i = 0; i < num; i++) {
			user[i] = new UserInfo();
			System.out.print((i + 1) + "�� �л��� ���̵�, ��й�ȣ�� �Է��Ͻÿ� --> ");
			user[i].input();
			user[i].index = (i + 1);
		}

		System.out.println("========================");
		System.out.println("��ϵ� �л� ����� ������ �����ϴ�.");
		System.out.println("------------------------");
		System.out.println("��ȣ\t ���̵�\t ��й�ȣ");
		for (int i = 0; i < user.length; i++) {
			user[i].print(user[i].index);
		}

	}
}
