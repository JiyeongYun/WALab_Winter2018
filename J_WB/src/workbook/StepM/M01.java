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
		System.out.print("==> 메뉴의 메뉴명, 원산지, 가격을 입력하시오. ");
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
				System.out.println(menuArr.size() + "개의 메뉴가 등록되어 있습니다.");
			} else if (input == 6) {
				break;
			} else {
				System.out.println("잘못입력하셨습니다.");
			}

		}

		try {
			saveTxt();
			System.out.println("저장완료");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("파일이 저장되지 않았습니다.");
		}
		System.out.println("종료되었습니다.");

	}

	void saveTxt() throws IOException {
		FileWriter fw = new FileWriter("D:\\WALAB\\workspace\\menu.txt");
		fw.write("메뉴번호\t 메뉴이름\t 원산지\t 1인분가격\n");
		for (int i = 0; i < menuArr.size(); i++) {
			MenuPan temp = menuArr.get(i);
			fw.write((i + 1) + "\t" + temp.menu + "\t" + temp.origin + "\t" + temp.price + "\n");
		}
		fw.close();
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

		menuArr.add(new MenuPan(menu, origin, price));
		System.out.println("입력되었습니다.");
	}

	void modifyMenu() {
		System.out.print("==> 수정할 번호를 입력하세요 : ");
		int n = sc.nextInt();

		if (menuArr.size() < n) {
			System.out.println("해당 번호가 없습니다.");
		}
		menuArr.get(n - 1).modifyMenu();
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
			MenuPan temp = menuArr.get(i);
			System.out.printf("%d\t %s\t %s\t %d\n", i + 1, temp.menu, temp.origin, temp.price);
		}

	}
}
