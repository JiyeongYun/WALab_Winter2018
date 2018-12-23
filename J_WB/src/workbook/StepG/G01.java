package workbook.StepG;

import java.util.Scanner;

public class G01 {
	private int age[] = new int[100];
	private int birth_year;
	private int count_person;
	private int count_baby = 0;
	private int count_child = 0;
	private int count_youth = 0;
	private int count_young = 0;
	private int count_adult = 0;
	private int count_old = 0;

	/** ������ **/
	public G01() {
		input();
	}

	/** �� ��� **/
	public void printResult() {
		for (int i = 0; i < count_person; i++) {
			System.out.println((i + 1) + "���� ����� ���̴� " + age[i] + " �Դϴ�.");
		}
		System.out.println("���ƴ� " + count_baby + "�� �Դϴ�.");
		System.out.println("��̴� " + count_child + "�� �Դϴ�.");
		System.out.println("û�ҳ��� " + count_youth + "�� �Դϴ�.");
		System.out.println("û���� " + count_young + "�� �Դϴ�.");
		System.out.println("�߳��� " + count_adult + "�� �Դϴ�.");
		System.out.println("����� " + count_old + "�� �Դϴ�.");
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
			count_baby++;
		} else if (age >= 7 && age < 13) {
			count_child++;
		} else if (age >= 13 && age < 20) {
			count_youth++;
		} else if (age >= 20 && age < 30) {
			count_young++;
		} else if (age > 30 && age < 60) {
			count_adult++;
		} else if (age >= 60) {
			count_old++;
		}
	}

}
