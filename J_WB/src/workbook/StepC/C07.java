package workbook.StepC;

import java.util.Scanner;

public class C07 {
	private int megabytes;
	private long bytes;
	private byte kind;
	private double time;

	/** ������ **/
	public C07() {
		input();
	}

	/** �� ��� **/
	public void printTime() {
		System.out.printf("���� ���� �ð��� %.1f ���Դϴ�.", getTime());
	}

	/** �� �Է� **/
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �뷮�� �ް�����Ʈ ������ �Է��ϼ���. ");
		megabytes = sc.nextInt();
		System.out.println("���۹���� 1:Wi-Fi, 2:BlueTooth, 3:LTE, 4: USB");
		kind = sc.nextByte();
	}

	/** �� ��� **/
	long getBytes() {
		bytes = (long) megabytes * 1024 * 1024;
		return bytes;
	}

	double getTime() {
		switch (kind) {
		case 1: // wifi
			time = (double)getBytes() / 1500000;
			break;
		case 2: // bluetooth
			time = (double)getBytes() / 300000;
			break;
		case 3: // LTE
			time = (double)getBytes() / 1000000;
			break;
		case 4: // USB
			time = (double)getBytes() / 60000000;
			break;
		}

		return time;
	}
}
