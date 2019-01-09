package workbook.StepK;

import java.util.Scanner;

public class K02 {
	
	/** 생성자 **/
	public K02() {
		input();
	}
	
	private void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("등록하실 메뉴의 개수를 입력하세요 : ");
		int count = sc.nextInt();
		MenuPan[] arr = new MenuPan[count];
		
		for(int i = 0; i< arr.length; i++) {
			arr[i] = new MenuPan();
			System.out.print((i+1)+"번 메뉴의 번호, 메뉴명, 원산지, 가격을 입력하시오. ");
			arr[i].inputMenu();			
		}
		
		arr[0].printTitle();
		for(int i = 0; i< arr.length; i++) {
			arr[i].printMenu();
		}
	}
}
