package workbook.StepK;

import java.util.Scanner;

public class K02 {
	
	/** ������ **/
	public K02() {
		input();
	}
	
	private void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("����Ͻ� �޴��� ������ �Է��ϼ��� : ");
		int count = sc.nextInt();
		MenuPan[] arr = new MenuPan[count];
		
		for(int i = 0; i< arr.length; i++) {
			arr[i] = new MenuPan();
			System.out.print((i+1)+"�� �޴��� ��ȣ, �޴���, ������, ������ �Է��Ͻÿ�. ");
			arr[i].inputMenu();			
		}
		
		arr[0].printTitle();
		for(int i = 0; i< arr.length; i++) {
			arr[i].printMenu();
		}
	}
}
