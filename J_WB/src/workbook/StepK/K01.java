package workbook.StepK;

public class K01 {
	
	/** 생성자 **/
	public K01() {
		MenuPan menu = new MenuPan();
		System.out.print("메뉴의 번호, 메뉴명, 원산지, 가격을 입력하세요. ");
		menu.inputMenu();
		menu.printTitle();
		menu.printMenu();
	}
	
}
