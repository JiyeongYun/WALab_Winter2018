package workbook.StepK;

import java.util.Scanner;

public class K07 {

	/** ������ **/
	public K07() {
		start();
	}

	private void start() {
		Scanner sc = new Scanner(System.in);
		System.out.print("����� �л��� �����? ");
		int num = sc.nextInt();

		Student student[] = new Student[num];
		for (int i = 0; i < num; i++) {
			student[i] = new Student();
			System.out.print((i + 1) + "�� �л��� ����, ����, ���� ������ �Է��Ͻÿ� --> ");
			student[i].input();
			student[i].index = (i + 1);
		}

		System.out.println("========================");
		System.out.printf("��ϵ� %d���� �л� ����� ������ �����ϴ�.", num);
		System.out.println("------------------------");
		System.out.println("��ȣ\t ����\t ����\t ����\t ����\t ���\t ����\t");
		for (int i = 0; i < student.length; i++) {
			student[i].print(student[i].index);
		}

	}
}
