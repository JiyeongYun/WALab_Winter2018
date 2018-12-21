package workbook.StepB;

import java.util.Scanner;

public class B7_TransTime {
	private int megabytes;
	private long bytes;
	private String usb2;
	private int time;

	/** 생성자 **/
	public B7_TransTime() {
		input();
	}

	/** 값 출력 **/
	public void printTime() {
		System.out.println("파일 전송 시간은 " + getTime() + " 초입니다.");
	}

	/** 갑 입력 **/
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("파일 용량을 기가바이트 단위로 입력하세요. ");
		megabytes = sc.nextInt();
		System.out.printf("USB 포트가 2.0 이면 Y, 아니면 N을 입력하세요 ");
		usb2 = sc.next();
	}

	/** 값 계산 **/
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
