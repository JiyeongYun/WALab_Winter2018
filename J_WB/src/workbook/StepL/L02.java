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

		System.out.print("주차할 수 있는 차의 개수를 입력하세요 : ");
		max_car = sc.nextInt();
		System.out.printf("총 %d대를 주차할 수 있습니다.", max_car);

		while (true) {
			int input = showMenu();

			if (input == 1) { // 입차
				inputCar();
			} else if (input == 2) { // 출차
				printCar();
				deleteCar();
			} else if (input == 3) { // 리스트
				printCar();
				System.out.printf("%d대 주차가능", max_car - carArr.size());
			} else if (input == 4) { // 입차 총개수
				System.out.printf("총 %d대가 주차되어 있습니다.\n\n", carArr.size());
				printCar();
			} else if (input == 5) { // 주차잔여개수
				System.out.printf("주차 가능한 자리는 %d대입니다.", max_car - carArr.size());
			} else if (input == 6) {
				break;
			}

		}

		System.out.println("종료되었습니다.");

	}

	int showMenu() {
		System.out.println("\n\n-------------------------------------------------");
		System.out.print("1) 입차 2) 출차 3) 리스트 4)입차 총개수 5)주차잔여개수 6)종료 ==> ");
		int in = sc.nextInt();
		System.out.println("-------------------------------------------------");
		return in;
	}

	void inputCar() {
		count++;

		System.out.print("입차할 차의 번호와 차종을 입력하세요. ");
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
		System.out.printf("[%d번] %d년 %d월 %d일 %d시 %d분 입차 되었습니다.", count, year, month, day, hour, min);
	}

	void deleteCar() {
		System.out.print("==> 출차 번호를 입력하세요 : ");
		int pos = sc.nextInt();

		f = new SimpleDateFormat("YYYYMMdd hh:mm", Locale.KOREA);
		System.out.printf("현재 시간은 [%s]이므로 주차금액은 %d원입니다.\n", f.format(new Date()), getPrice(pos - 1));
		System.out.print("==> 정산되었습니다.");

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
			if (now_min == car.min) { // 시,분이 같은 경우
				time = 0;
			} else { // 시는 같지만, 분이 다른 경우
				time = now_min - car.min - 10;
			}
		} else {
			if (now_min > car.hour) { // 시가 다르고, 현재 시간의 분이 더 큰 경우
				time = (now_hour - car.hour) * 60 + (now_min - car.min);
			} else { // 시가 다르고, 입차 시간의 분이 더 큰 경우
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
			System.out.printf("[%d번] %s %s %s\n", temp.idx, temp.car_num, temp.car_type, date);
		}

	}
}
