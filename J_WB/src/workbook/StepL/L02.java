package workbook.StepL;

import java.util.*;
import java.text.SimpleDateFormat;

class Parking {
	int idx;
	String car_num;
	String car_type;
	int year;
	int month;
	int day;
	int hour;
	int min;

	Parking(int idx, String car_num, String car_type, int year, int month, int day, int hour, int min) {
		this.idx = idx;
		this.car_num = car_num;
		this.car_type = car_type;
		this.year = year;
		this.month = month;
		this.day = day;
		this.hour = hour;
		this.min = min;
	}

}

public class L02 {
	Scanner sc = new Scanner(System.in);
	ArrayList<Parking> carArr = new ArrayList<Parking>();
	SimpleDateFormat f;
	int max_car, count;

	public void main() {
		count = 0;

		System.out.print("������ �� �ִ� ���� ������ �Է��ϼ��� : ");
		max_car = sc.nextInt();
		System.out.printf("�� %d�븦 ������ �� �ֽ��ϴ�.", max_car);

		while (true) {
			int input = showMenu();

			if (input == 1) { // ����
				inputCar();
			} else if (input == 2) { // ����
				printCar();
				deleteCar();
			} else if (input == 3) { // ����Ʈ
				printCar();
				System.out.printf("%d�� ��������", max_car - carArr.size());
			} else if (input == 4) { // ���� �Ѱ���
				System.out.printf("�� %d�밡 �����Ǿ� �ֽ��ϴ�.\n\n", carArr.size());
				printCar();
			} else if (input == 5) { // �����ܿ�����
				System.out.printf("���� ������ �ڸ��� %d���Դϴ�.", max_car - carArr.size());
			} else if (input == 6) {
				break;
			}

		}

		System.out.println("����Ǿ����ϴ�.");

	}

	int showMenu() {
		System.out.println("\n\n-------------------------------------------------");
		System.out.print("1) ���� 2) ���� 3) ����Ʈ 4)���� �Ѱ��� 5)�����ܿ����� 6)���� ==> ");
		int in = sc.nextInt();
		System.out.println("-------------------------------------------------");
		return in;
	}

	void inputCar() {
		count++;

		System.out.print("������ ���� ��ȣ�� ������ �Է��ϼ���. ");
		String car_num = sc.next();
		String car_type = sc.next();

		String[] date = new String[5];
		f = new SimpleDateFormat("YYYY-MM-dd-hh-mm", Locale.KOREA);
		date = (f.format(new Date())).split("-");
		int year = Integer.parseInt(date[0]);
		int month = Integer.parseInt(date[1]);
		int day = Integer.parseInt(date[2]);
		int hour = Integer.parseInt(date[3]);
		int min = Integer.parseInt(date[4]);
		carArr.add(new Parking(count, car_num, car_type, year, month, day, hour, min));
		System.out.printf("[%d��] %d�� %d�� %d�� %d�� %d�� ���� �Ǿ����ϴ�.", count, year, month, day, hour, min);
	}

	void deleteCar() {
		System.out.print("==> ���� ��ȣ�� �Է��ϼ��� : ");
		int pos = sc.nextInt();

		f = new SimpleDateFormat("YYYYMMdd hh:mm", Locale.KOREA);
		System.out.printf("���� �ð��� [%s]�̹Ƿ� �����ݾ��� %d���Դϴ�.\n", f.format(new Date()), getPrice(pos - 1));
		System.out.print("==> ����Ǿ����ϴ�.");

		carArr.remove(pos - 1);
	}

	int getPrice(int p) {
		f = new SimpleDateFormat("YYYY-MM-dd-hh-mm", Locale.KOREA);
		int price = 0;
		int time = 0;

		String[] date = new String[5];
		date = (f.format(new Date())).split("-");
		int now_hour = Integer.parseInt(date[3]);
		int now_min = Integer.parseInt(date[4]);

		Parking car = carArr.get(p);

		if (now_hour == car.hour) {
			if (now_min == car.min) { // ��,���� ���� ���
				time = 0;
			} else { // �ô� ������, ���� �ٸ� ���
				time = now_min - car.min - 10;
			}
		} else {
			if (now_min > car.hour) { // �ð� �ٸ���, ���� �ð��� ���� �� ū ���
				time = (now_hour - car.hour) * 60 + (now_min - car.min);
			} else { // �ð� �ٸ���, ���� �ð��� ���� �� ū ���
				time = (now_hour - car.hour - 1) * 60 + (60 + now_min - car.min);
			}

		}

		price = time / 10 * 500;
		if (time % 10 > 0) {
			price += 500;
		}

		return price;
	}

	void printCar() {
		for (int i = 0; i < carArr.size(); i++) {
			Parking temp = carArr.get(i);
			String date = String.format("%04d-%02d-%02d %02d:%02d", temp.year, temp.month, temp.day, temp.hour,
					temp.min);
			System.out.printf("[%d��] %s %s %s\n", temp.idx, temp.car_num, temp.car_type, date);
		}

	}
}
