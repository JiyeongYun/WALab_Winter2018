import java.util.Scanner;

import workbook.StepA.StepAManager;
import workbook.StepB.StepBManager;

public class WBManager {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("원하는 Step은?");
		String step = sc.next();

		if (step.equalsIgnoreCase("A"))
			new StepAManager();
		else if (step.equalsIgnoreCase("B"))
			new StepBManager();

		System.out.println("종료되었습니다.");
	}
}