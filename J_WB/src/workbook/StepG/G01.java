package workbook.StepG;

import java.util.Scanner;

public class G01 {
	private int age[] = new int[100];
	private int birth_year;
	private int count_person;
	private String person[] = { "����", "���", "û�ҳ�", "û��", "�߳�", "���" };
	private int count[] = { 0, 0, 0, 0, 0, 0 };

	/** ������ **/
	public G01() {
		input();
	}

	/** �� ��� **/
	public void printResult() {
		for (int i = 0; i < count_person; i++) {
			System.out.println((i + 1) + "���� ����� ���̴� " + age[i] + " �Դϴ�.");
		}
		for (int i = 0; i < count.length; i++) {
			if (i < 2) {
				System.out.println(person[i] + "�� " + count[i] + "�� �Դϴ�.");
			} else {
				System.out.println(person[i] + "�� " + count[i] + "�� �Դϴ�.");
			}

		}
	}

	/** �� �Է� **/
	void input() {
		Scanner sc = new Scanner(System.in);
		count_person = 0;
		while (true) {
			System.out.print((count_person + 1) + "��° ����� �¾ �⵵�� �Է��ϼ���. ");
			birth_year = sc.nextInt();

			if (birth_year > 2012) {
				break;
			}
			age[count_person] = getAge(birth_year);
			count_person++;
		}
	}

	/** �� ��� **/
	int getAge(int year) {
		int age = 2012 - year + 1;
		setAge(age);
		return age;
	}

	/** ���ɴ� üũ **/
	void setAge(int age) {
		if (age < 7) {
			count[0]++;
		} else if (age >= 7 && age < 13) {
			count[1]++;
		} else if (age >= 13 && age < 20) {
			count[2]++;
		} else if (age >= 20 && age < 30) {
			count[3]++;
		} else if (age > 30 && age < 60) {
			count[4]++;
		} else if (age >= 60) {
			count[5]++;
		}
	}

}
