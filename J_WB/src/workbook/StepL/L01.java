package workbook.StepL;

import java.util.*;

class MenuBoard {
	String menu;
	String origin;
	int price;

	MenuBoard(String menu, String origin, int price) {
		this.menu = menu;
		this.origin = origin;
		this.price = price;
	}

}

public class L01 {
	ArrayList<MenuBoard> menuArr = new ArrayList<MenuBoard>();
	Scanner sc = new Scanner(System.in);

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
			}

		}

		System.out.println("����Ǿ����ϴ�.");

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

		menuArr.add(new MenuBoard(menu, origin, price));
		System.out.println("�ԷµǾ����ϴ�.");
	}

	void modifyMenu() {
		System.out.print("==> ������ ��ȣ�� �Է��ϼ��� : ");
		int pos = sc.nextInt();
		System.out.print("==> �޴��� �޴���, ������, ������ �Է��Ͻÿ�. ");
		String menu = sc.next();
		String origin = sc.next();
		int price = sc.nextInt();
		menuArr.set(pos - 1, new MenuBoard(menu, origin, price));
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
			MenuBoard temp = menuArr.get(i);
			System.out.printf("%d\t %s\t %s\t %d\n", i + 1, temp.menu, temp.origin, temp.price);
		}

	}

}
