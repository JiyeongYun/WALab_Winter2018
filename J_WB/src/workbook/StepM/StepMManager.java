package workbook.StepM;

import java.util.Scanner;

public class StepMManager {
	public StepMManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while (true) {
			printf("---------------------\n");
			printf("1. �޴��� �����ϱ�\n");
			printf("=>���ϴ� �޴���?(0:exit) :");
			menu = s.nextInt();
			if (menu == 0) {
				break;
			} else if (menu == 1) {
				M01 m1 = new M01();
				m1.main();
			}
		}

	}

	void printf(String s) {
		System.out.print(s);
	}
}
