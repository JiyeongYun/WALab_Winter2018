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
				System.out.println(menuArr.size() + "개의 메뉴가 등록되어 있습니다.");
			} else if (input == 6) {
				break;
			}

		}

		System.out.println("종료되었습니다.");

	}

	int showMenu() {
		System.out.print("\n1) 추가 2) 수정 3) 삭제 4)리스트 5)총개수 6)종료 ==> ");
		int in = sc.nextInt();
		System.out.println("------------------------------------------");
		return in;
	}

	void inputMenu() {
		System.out.print("메뉴의 메뉴명, 원산지, 가격을 입력하시오. ");
		String menu = sc.next();
		String origin = sc.next();
		int price = sc.nextInt();

		menuArr.add(new MenuBoard(menu, origin, price));
		System.out.println("입력되었습니다.");
	}

	void modifyMenu() {
		System.out.print("==> 수정할 번호를 입력하세요 : ");
		int pos = sc.nextInt();
		System.out.print("==> 메뉴의 메뉴명, 원산지, 가격을 입력하시오. ");
		String menu = sc.next();
		String origin = sc.next();
		int price = sc.nextInt();
		menuArr.set(pos - 1, new MenuBoard(menu, origin, price));
	}

	void deleteMenu() {
		System.out.print("==> 삭제할 번호를 입력하세요 : ");
		int pos = sc.nextInt();
		menuArr.remove(pos - 1);
		System.out.println("삭제되었습니다.");
	}

	void printMenu() {
		System.out.println("메뉴번호\t 메뉴이름\t 원산지\t 1인분가격");
		for (int i = 0; i < menuArr.size(); i++) {
			MenuBoard temp = menuArr.get(i);
			System.out.printf("%d\t %s\t %s\t %d\n", i + 1, temp.menu, temp.origin, temp.price);
		}

	}

}
