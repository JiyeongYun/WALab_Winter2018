package workbook.StepK;

public class Point {
	
	int get_area(double x, double y) {
		if(x == 0 || y == 0) return 0;
		else if(0 < x) {
			if(0 < y) return 1;
			else return 4;
		}else {
			if(0 < y) return 2;
			else return 3;
		}
	}
}
