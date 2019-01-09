package workbook.StepL;

import java.util.*;

class Student {
	int idx;
	String name;
	String std_num;
	String gender;
	String address;
	String phone_num;
	String isReturn;
	Scanner sc = new Scanner(System.in);

	public Student(int idx, String name, String std_num, String gender, String address, String phone_num, String isReturn) {
		this.idx = idx;
		this.name = name;
		this.std_num = std_num;
		this.gender = gender;
		this.address = address;
		this.phone_num = phone_num;
		this.isReturn = isReturn;
	}

	void modifyInfo() {
		System.out.print("�л��̸�, �й�, ������ �Է��ϼ��� : ");
		this.name = sc.next();
		this.std_num = sc.next();
		this.gender = sc.next();
		System.out.print("�ּҸ� �Է��ϼ��� : ");
		sc.nextLine();
		this.address = sc.nextLine();
		System.out.print("��ȭ��ȣ�� �Է��ϼ��� : ");
		this.phone_num = sc.next();
		System.out.print("���л��Դϱ�?(Y/N) ");
		this.isReturn = sc.next();
	}
	
	void printInfo() {
		System.out.printf("%d\t %s\t %s\t %s\t %s\t %s\t %s\n", this.idx, this.name, this.std_num, this.gender, this.address, this.phone_num, this.isReturn);
	}

}

public class L04 {
	Scanner sc = new Scanner(System.in);
	ArrayList<Student> stdArr = new ArrayList<Student>();
	boolean isEdit;
	int count = 0;

	public void main() {
		while (true) {
			int input = showMenu();
			if (input == 1) {
				inputInfo();
			} else if (input == 2) {
				printInfo();
				modifyInfo();
			} else if (input == 3) {
				removeInfo();
			} else if (input == 4) {
				printInfo();
			} else if (input == 5) {
				searchInfo();
			} else if (input == 6) {
				isResutnInfo();
			} else if (input == 7) {
				addressInfo();
			} else if (input == 8) {
				break;
			} else {
				System.out.print("�߸��Է��ϼ̽��ϴ�.");
			}
		}
		System.out.println("����Ǿ����ϴ�.");
	}

	int showMenu() {
		System.out.println("\n---------------------------------------------------------");
		System.out.print("1) �л���� 2) �������� 3)���� 4)����Ʈ 5)�̸��˻� 6)���л�����Ʈ 7)�ּҰ˻� 8)���� ==> ");
		int in = sc.nextInt();
		System.out.println("-----------------------------------------------------------");
		return in;
	}

	void inputInfo() {
		System.out.print("�л��̸�, �й�, ������ �Է��ϼ��� : ");
		String name = sc.next();
		String std_num = sc.next();
		String gender = sc.next();
		
		System.out.print("�ּҸ� �Է��ϼ��� : ");
		sc.nextLine();
		String address = sc.nextLine();
		
		System.out.print("��ȭ��ȣ�� �Է��ϼ��� : ");
		String phone_num = sc.next();
		
		System.out.print("���л��Դϱ�?(Y/N) ");
		String isReturn = sc.next();

		count++;
		stdArr.add(new Student(count, name, std_num, gender, address, phone_num, isReturn));
		System.out.printf("�� %d���� ��ϵǾ����ϴ�.", stdArr.size());
	}

	void printInfo() {
		System.out.println("��ȣ\t �̸�\t �й�\t\t ����\t �ּ�\t\t ��ȭ��ȣ\t\t ���л�");
		for (int i = 0; i < stdArr.size(); i++) {
			Student temp = stdArr.get(i);
			temp.printInfo();
		}
	}

	void modifyInfo() {
		System.out.print("==> �����Ͻ� ��ȣ�� �Է��ϼ��� : ");
		int n = sc.nextInt();
		for (int i = 0; i < stdArr.size(); i++) {
			Student temp = stdArr.get(i);
			if(temp.idx == n) {
				stdArr.get(n - 1).modifyInfo();
				System.out.print("�����Ǿ����ϴ�.");		
				break;
			}
		}
		
	}

	void removeInfo() {
		System.out.print("==> �����Ͻ� ��ȣ�� �Է��ϼ��� : ");
		int n = sc.nextInt();
		System.out.print("������ �����Ͻðڽ��ϱ�?(Y/N) ");
		if (sc.next().equalsIgnoreCase("Y")) {
			for (int i = 0; i < stdArr.size(); i++) {
				Student temp = stdArr.get(i);
				if(temp.idx == n) {
					stdArr.remove(n - 1);
					System.out.print("�����Ǿ����ϴ�.");
					break;
				}
			}
			
		}
	}

	void searchInfo() {
		System.out.print("�˻��Ͻ� �̸��� �ӷ��ϼ��� : ");
		String str = sc.next();
		ArrayList<Integer> idxArr = new ArrayList<>();

		boolean isContain = false;
		for (int i = 0; i < stdArr.size(); i++) {
			if (stdArr.get(i).name.contains(str)) {
				isContain = true;
				idxArr.add(i);
			}
		}
		if (isContain) {
			System.out.println("�˻��Ǿ����ϴ�.\n");
			System.out.println("��ȣ\t �̸�\t �й�\t ����\t �ּ�\t ��ȭ��ȣ\t ���л�");
			for (int i = 0; i < idxArr.size(); i++) {
				Student temp = stdArr.get(i);
				temp.printInfo();
			}
		}
	}
	
	void isResutnInfo() {
		int count = 0;
		System.out.println("��ȣ\t �̸�\t �й�\t ����\t �ּ�\t ��ȭ��ȣ\t ���л�");
		for (int i = 0; i < stdArr.size(); i++) {
			Student temp = stdArr.get(i);
			if(temp.isReturn.equalsIgnoreCase("Y")) {
				count++;
				temp.printInfo();
			}
		}
		System.out.println("���л��� "+count+"���Դϴ�.");
	}

	void addressInfo() {
		System.out.print("�˻��Ͻ� �ּҸ� �ӷ��ϼ��� : ");
		String str = sc.next();
		ArrayList<Integer> idxArr = new ArrayList<>();

		boolean isContain = false;
		for (int i = 0; i < stdArr.size(); i++) {
			if (stdArr.get(i).name.contains(str)) {
				isContain = true;
				idxArr.add(i);
			}
		}
		if (isContain) {
			System.out.println("�˻��Ǿ����ϴ�.\n");
			System.out.println("��ȣ\t �̸�\t �й�\t ����\t �ּ�\t ��ȭ��ȣ\t ���л�");
			for (int i = 0; i < idxArr.size(); i++) {
				Student temp = stdArr.get(i);
				temp.printInfo();
			}
		}
	}
}
