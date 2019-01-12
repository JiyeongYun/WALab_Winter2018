package workbook.StepM;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

class MenuPan {
	String menu;
	String origin;
	int price;

	MenuPan(String menu, String origin, int price) {
		this.menu = menu;
		this.origin = origin;
		this.price = price;
	}

	void modifyMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.print("==> �޴��� �޴���, ������, ������ �Է��Ͻÿ�. ");
		this.menu = sc.next();
		this.origin = sc.next();
		this.price = sc.nextInt();
	}

}

public class M01 {
	ArrayList<MenuPan> menuArr = new ArrayList<MenuPan>();
	Scanner sc = new Scanner(System.in);
	private int count = 0;

	public void main() {
		while (true) {
			int input = showMenu();

			if (input == 1) {
				inputMenu();
			} else if (input == 2) {
				modifyMenu();
			} else if (input == 3) {
				deleteMenu();
			} else if (input == 4) {
				printMenu();
			} else if (input == 5) {
				System.out.println(menuArr.size() + "���� �޴��� ��ϵǾ� �ֽ��ϴ�.");
			} else if (input == 6) {
				break;
			} else {
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
			}

		}

		try {
			saveTxt();
			System.out.println("����Ϸ�");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("������ ������� �ʾҽ��ϴ�.");
		}
		System.out.println("����Ǿ����ϴ�.");

	}

	void saveTxt() throws IOException {
		FileWriter fw = new FileWriter("D:\\WALAB\\workspace\\menu.txt");
		fw.write("�޴���ȣ\t �޴��̸�\t ������\t 1�κа���\n");
		for (int i = 0; i < menuArr.size(); i++) {
			MenuPan temp = menuArr.get(i);
			fw.write((i + 1) + "\t" + temp.menu + "\t" + temp.origin + "\t" + temp.price + "\n");
		}
		fw.close();
	}

	int showMenu() {
		System.out.print("\n1) �߰� 2) ���� 3) ���� 4)����Ʈ 5)�Ѱ��� 6)���� ==> ");
		int in = sc.nextInt();
		System.out.println("------------------------------------------");
		return in;
	}

	void inputMenu() {
		System.out.print("�޴��� �޴���, ������, ������ �Է��Ͻÿ�. ");
		String menu = sc.next();
		String origin = sc.next();
		int price = sc.nextInt();

		menuArr.add(new MenuPan(menu, origin, price));
		System.out.println("�ԷµǾ����ϴ�.");
	}

	void modifyMenu() {
		System.out.print("==> ������ ��ȣ�� �Է��ϼ��� : ");
		int n = sc.nextInt();

		if (menuArr.size() < n) {
			System.out.println("�ش� ��ȣ�� �����ϴ�.");
		}
		menuArr.get(n - 1).modifyMenu();
	}

	void deleteMenu() {
		System.out.print("==> ������ ��ȣ�� �Է��ϼ��� : ");
		int pos = sc.nextInt();
		menuArr.remove(pos - 1);
		System.out.println("�����Ǿ����ϴ�.");
	}

	void printMenu() {
		System.out.println("�޴���ȣ\t �޴��̸�\t ������\t 1�κа���");
		for (int i = 0; i < menuArr.size(); i++) {
			MenuPan temp = menuArr.get(i);
			System.out.printf("%d\t %s\t %s\t %d\n", i + 1, temp.menu, temp.origin, temp.price);
		}

	}
}
