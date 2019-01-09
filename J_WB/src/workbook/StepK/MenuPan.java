package workbook.StepK;

import java.util.Scanner;

public class MenuPan {
	int num;
	String name;
	String origin;
	int price;

	void inputMenu() {
		Scanner s = new Scanner(System.in);
		
		num = s.nextInt();
		name = s.next();
		origin = s.next();
		price = s.nextInt();
	}
	
	void printTitle() {
		System.out.println("=======================================");
		System.out.println("메뉴번호\t 메뉴이름\t 원산지\t 1인분가격");
	}
	
	void printMenu() {
		System.out.printf("%d\t %s\t %s\t %d\n", num, name, origin, price);
	}

}
