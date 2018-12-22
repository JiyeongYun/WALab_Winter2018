package workbook.StepC;

import java.util.Scanner;

public class C07 {
	private int megabytes;
	private long bytes;
	private byte kind;
	private double time;

	/** 생성자 **/
	public C07() {
		input();
	}

	/** 값 출력 **/
	public void printTime() {
		System.out.printf("파일 전송 시간은 %.1f 초입니다.", getTime());
	}

	/** 갑 입력 **/
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("파일 용량을 메가바이트 단위로 입력하세요. ");
		megabytes = sc.nextInt();
		System.out.println("전송방식을 1:Wi-Fi, 2:BlueTooth, 3:LTE, 4: USB");
		kind = sc.nextByte();
	}

	/** 값 계산 **/
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
