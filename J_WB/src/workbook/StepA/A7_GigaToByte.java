package workbook.StepA;

import java.util.Scanner;

public class A7_GigaToByte {
	private int gigabytes;
	private int megabytes;
	private int kilobytes;
	private long bytes;

	/** 생성자 **/
	public A7_GigaToByte() {
		input();
	}

	/** 값 출력 **/
	public void printResult() {
		System.out.println("입력하신 파일 용량은");
		System.out.println(getMega() + " 메가바이트,");
		System.out.println(getKilo() + " 킬로바이트,");
		System.out.println(getBytes() + " 바이트 입니다.");
	}

	/** 갑 입력 **/
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("파일 용량을 기가바이트 단위로 입력하세요. ");
		gigabytes = sc.nextInt();
	}

	/** 값 계산 **/
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
