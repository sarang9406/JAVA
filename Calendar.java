package kh.calendar;

public class Calendar {
	/*
	 * 특정년도 특정 월을 입력하면, 
	 * 입력한 년도의 달을 출력하는 코드를 작성하자
	 *	- java.util.Calendar 클래스 사용 금지
	 *	- hint : 윤년 계산
	 *
	 */
	
	static int  d=0;
	public static void calendar (int year, int month) {
		System.out.println(" Mon"+ " Tue"+ " Wed"+" Thr"+ " Fri"+" Sat"+" Sun");
		
		
		int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
//		int [] space = {0, 1, 2, 3, 4, 5, 6};
		
		if (month == 1) {
			for (int i = 0; i < days[month - 1]; i++) {
				++d;
				System.out.printf("%3d ", d);
				if (i != 0 && ((i + 1) % 7) == 0) {
					System.out.println();
				}
			}
			System.out.println();
		} 
		
		if (month == 2 || month == 3 || month ==6) { 		//공백 3
			for (int i = 0; i < days[month - 1] + 3; i++) {
				if (i < 3) {
					System.out.print("    ");
				} else {
					d++;
					System.out.printf("%3d ", d);
					if (i != 0 && ((i + 1) % 7) == 0) {
						System.out.println("");
					}
				}
			}
			System.out.println();
		} 
				
		if (month ==4) {
			for (int i = 0; i < days[month - 1] + 6; i++) {
				if (i < 6) {
					System.out.print("    ");
				} else {
					d++;
					System.out.printf("%3d ", d);
					if (i != 0 && ((i + 1) % 7) == 0) {
						System.out.println("");
					}
				}
			}
			System.out.println();
		}
		
		if (month == 5||month ==8||month==10||month==12) {
			for (int i = 0; i < days[month - 1] + 1; i++) {
				if (i < 1) {
					System.out.print("    ");
				} else {
					d++;
					System.out.printf("%3d ", d);
					if (i != 0 && ((i + 1) % 7) == 0) {
						System.out.println("");
					}
				}
			}
			System.out.println();
		}
		
		if (month ==7) {
			for (int i = 0; i < days[month - 1] + 5; i++) {
				if (i < 5) {
					System.out.print("    ");
				} else {
					d++;
					System.out.printf("%3d ", d);
					if (i != 0 && ((i + 1) % 7) == 0) {
						System.out.println("");
					}
				}
			}
			System.out.println();
		}
		
		if (month==9||month==11) {
			for (int i = 0; i < days[month - 1] + 4; i++) {
				if (i < 4) {
					System.out.print("    ");
				} else {
					d++;
					System.out.printf("%3d ", d);
					if (i != 0 && ((i + 1) % 7) == 0) {
						System.out.println("");
					}
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		calendar(1,2);
	}
}
