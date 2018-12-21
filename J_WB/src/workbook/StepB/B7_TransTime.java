package workbook.StepB;

import java.util.Scanner;

public class B7_TransTime {
	private int megabytes;
	private long bytes;
	private String usb2;
	private int time;

	/** ������ **/
	public B7_TransTime() {
		input();
	}

	/** �� ��� **/
	public void printTime() {
		System.out.println("���� ���� �ð��� " + getTime() + " ���Դϴ�.");
	}

	/** �� �Է� **/
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �뷮�� �Ⱑ����Ʈ ������ �Է��ϼ���. ");
		megabytes = sc.nextInt();
		System.out.printf("USB ��Ʈ�� 2.0 �̸� Y, �ƴϸ� N�� �Է��ϼ��� ");
		usb2 = sc.next();
	}

	/** �� ��� **/
	long getBytes() {
		bytes = (long) megabytes * 1024 * 1024;
		return bytes;
	}

	int getTime() {
		time = 0;
		if (usb2.equalsIgnoreCase("Y")) {
			time = (int) (getBytes() / 60000000);
		} else if (usb2.equalsIgnoreCase("N")) {
			time = (int) (getBytes() / 1500000);
		}
		return time;
	}
}
