import java.util.Scanner;

import workbook.StepA.StepAManager;
import workbook.StepB.StepBManager;
import workbook.StepC.StepCManager;
import workbook.StepD.StepDManager;

public class WBManager {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("���ϴ� Step��?");
		String step = sc.next();

		if (step.equalsIgnoreCase("A"))
			new StepAManager();
		else if (step.equalsIgnoreCase("B"))
			new StepBManager();
		else if (step.equalsIgnoreCase("C"))
			new StepCManager();
		else if (step.equalsIgnoreCase("D"))
			new StepDManager();

		System.out.println("����Ǿ����ϴ�.");
	}
}