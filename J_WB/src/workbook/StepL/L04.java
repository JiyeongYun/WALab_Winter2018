package workbook.StepL;

import java.util.*;

class Student {
	int idx;
	String name;
	String std_num;
	String gender;
	String address;
	String phone_num;
	String isReturn;
	Scanner sc = new Scanner(System.in);

	public Student(int idx, String name, String std_num, String gender, String address, String phone_num, String isReturn) {
		this.idx = idx;
		this.name = name;
		this.std_num = std_num;
		this.gender = gender;
		this.address = address;
		this.phone_num = phone_num;
		this.isReturn = isReturn;
	}

	void modifyInfo() {
		System.out.print("학생이름, 학번, 성별을 입력하세요 : ");
		this.name = sc.next();
		this.std_num = sc.next();
		this.gender = sc.next();
		System.out.print("주소를 입력하세요 : ");
		sc.nextLine();
		this.address = sc.nextLine();
		System.out.print("전화번호를 입력하세요 : ");
		this.phone_num = sc.next();
		System.out.print("복학생입니까?(Y/N) ");
		this.isReturn = sc.next();
	}
	
	void printInfo() {
		System.out.printf("%d\t %s\t %s\t %s\t %s\t %s\t %s\n", this.idx, this.name, this.std_num, this.gender, this.address, this.phone_num, this.isReturn);
	}

}

public class L04 {
	Scanner sc = new Scanner(System.in);
	ArrayList<Student> stdArr = new ArrayList<Student>();
	boolean isEdit;
	int count = 0;

	public void main() {
		while (true) {
			int input = showMenu();
			if (input == 1) {
				inputInfo();
			} else if (input == 2) {
				printInfo();
				modifyInfo();
			} else if (input == 3) {
				removeInfo();
			} else if (input == 4) {
				printInfo();
			} else if (input == 5) {
				searchInfo();
			} else if (input == 6) {
				isResutnInfo();
			} else if (input == 7) {
				addressInfo();
			} else if (input == 8) {
				break;
			} else {
				System.out.print("잘못입력하셨습니다.");
			}
		}
		System.out.println("종료되었습니다.");
	}

	int showMenu() {
		System.out.println("\n---------------------------------------------------------");
		System.out.print("1) 학생등록 2) 정보수정 3)삭제 4)리스트 5)이름검색 6)복학생리스트 7)주소검색 8)종료 ==> ");
		int in = sc.nextInt();
		System.out.println("-----------------------------------------------------------");
		return in;
	}

	void inputInfo() {
		System.out.print("학생이름, 학번, 성별을 입력하세요 : ");
		String name = sc.next();
		String std_num = sc.next();
		String gender = sc.next();
		
		System.out.print("주소를 입력하세요 : ");
		sc.nextLine();
		String address = sc.nextLine();
		
		System.out.print("전화번호를 입력하세요 : ");
		String phone_num = sc.next();
		
		System.out.print("복학생입니까?(Y/N) ");
		String isReturn = sc.next();

		count++;
		stdArr.add(new Student(count, name, std_num, gender, address, phone_num, isReturn));
		System.out.printf("총 %d명이 등록되었습니다.", stdArr.size());
	}

	void printInfo() {
		System.out.println("번호\t 이름\t 학번\t\t 성별\t 주소\t\t 전화번호\t\t 복학생");
		for (int i = 0; i < stdArr.size(); i++) {
			Student temp = stdArr.get(i);
			temp.printInfo();
		}
	}

	void modifyInfo() {
		System.out.print("==> 수정하실 번호를 입력하세요 : ");
		int n = sc.nextInt();
		for (int i = 0; i < stdArr.size(); i++) {
			Student temp = stdArr.get(i);
			if(temp.idx == n) {
				stdArr.get(n - 1).modifyInfo();
				System.out.print("수정되었습니다.");		
				break;
			}
		}
		
	}

	void removeInfo() {
		System.out.print("==> 삭제하실 번호를 입력하세요 : ");
		int n = sc.nextInt();
		System.out.print("정말로 삭제하시겠습니까?(Y/N) ");
		if (sc.next().equalsIgnoreCase("Y")) {
			for (int i = 0; i < stdArr.size(); i++) {
				Student temp = stdArr.get(i);
				if(temp.idx == n) {
					stdArr.remove(n - 1);
					System.out.print("삭제되었습니다.");
					break;
				}
			}
			
		}
	}

	void searchInfo() {
		System.out.print("검색하실 이름을 임력하세요 : ");
		String str = sc.next();
		ArrayList<Integer> idxArr = new ArrayList<>();

		boolean isContain = false;
		for (int i = 0; i < stdArr.size(); i++) {
			if (stdArr.get(i).name.contains(str)) {
				isContain = true;
				idxArr.add(i);
			}
		}
		if (isContain) {
			System.out.println("검색되었습니다.\n");
			System.out.println("번호\t 이름\t 학번\t 성별\t 주소\t 전화번호\t 복학생");
			for (int i = 0; i < idxArr.size(); i++) {
				Student temp = stdArr.get(i);
				temp.printInfo();
			}
		}
	}
	
	void isResutnInfo() {
		int count = 0;
		System.out.println("번호\t 이름\t 학번\t 성별\t 주소\t 전화번호\t 복학생");
		for (int i = 0; i < stdArr.size(); i++) {
			Student temp = stdArr.get(i);
			if(temp.isReturn.equalsIgnoreCase("Y")) {
				count++;
				temp.printInfo();
			}
		}
		System.out.println("복학생은 "+count+"명입니다.");
	}

	void addressInfo() {
		System.out.print("검색하실 주소를 임력하세요 : ");
		String str = sc.next();
		ArrayList<Integer> idxArr = new ArrayList<>();

		boolean isContain = false;
		for (int i = 0; i < stdArr.size(); i++) {
			if (stdArr.get(i).name.contains(str)) {
				isContain = true;
				idxArr.add(i);
			}
		}
		if (isContain) {
			System.out.println("검색되었습니다.\n");
			System.out.println("번호\t 이름\t 학번\t 성별\t 주소\t 전화번호\t 복학생");
			for (int i = 0; i < idxArr.size(); i++) {
				Student temp = stdArr.get(i);
				temp.printInfo();
			}
		}
	}
}
