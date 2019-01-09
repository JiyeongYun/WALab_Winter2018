package workbook.StepK;

import java.util.Scanner;

public class UserInfo {
	public int index;
	public String id;
	public String pwd;
	
	void input() {
		Scanner sc = new Scanner(System.in);
		this.id = sc.next();
		this.pwd = sc.next();
	}
	
	void print(int index) {
		System.out.printf("%d\t %s\t %s\n",index, this.id, this.pwd);
	}
	
}
