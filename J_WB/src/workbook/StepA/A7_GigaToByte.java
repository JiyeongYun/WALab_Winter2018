package workbook.StepA;

import java.util.Scanner;

public class A7_GigaToByte {
	private int gigabytes;
	private int megabytes;
	private int kilobytes;
	private long bytes;

	/** ������ **/
	public A7_GigaToByte() {
		input();
	}

	/** �� ��� **/
	public void printResult() {
		System.out.println("�Է��Ͻ� ���� �뷮��");
		System.out.println(getMega() + " �ް�����Ʈ,");
		System.out.println(getKilo() + " ų�ι���Ʈ,");
		System.out.println(getBytes() + " ����Ʈ �Դϴ�.");
	}

	/** �� �Է� **/
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �뷮�� �Ⱑ����Ʈ ������ �Է��ϼ���. ");
		gigabytes = sc.nextInt();
	}

	/** �� ��� **/
	int getMega() {
		megabytes = gigabytes * 1024;
		return megabytes;
	}

	int getKilo() {
		kilobytes = megabytes * 1024;
		return kilobytes;
	}

	long getBytes() {
		bytes = (long) kilobytes * 1024;
		return bytes;
	}

}
