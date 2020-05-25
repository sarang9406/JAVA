package kh.bombs;

import java.util.Scanner;

public class MTest {

	// 0192/22980977/55
	public static void main(String[] args) {
		Bombs b1 = new Bombs();
//		b1.bombA(0, 1);
//		b1.bombA(9, 2);
//		b1.bombB(2, 2);
//		b1.bombB(9, 8);
//		b1.bombB(0, 9);
//		b1.bombB(7, 7);
//		b1.bombC(5, 5);
//		b1.prn();

		Scanner sc = new Scanner(System.in);
		System.out.println("Please input positions for bombs(Type of bombs will be spilted based on '/')");
		String input = sc.nextLine();
		String[] tmp = input.split("/");

		String A = tmp[0];
		String B = tmp[1];
		String C = tmp[2];

		for (int i = 0; i < A.length(); i++) {
			if (i != 0 && i % 2 == 1) {
				continue;
			}
			int xA = Integer.valueOf(A.substring(i, i + 1));
			int yA = Integer.valueOf(A.substring(i + 1, i + 2));
//			System.out.println("Ax" + xA);
//			System.out.println("Ay" + yA);
			b1.bombA(xA, yA);

		}
		for (int i = 0; i < B.length(); i++) {
			if (i != 0 && i % 2 == 1) {
				continue;
			}
			int xB = Integer.valueOf(B.substring(i, i + 1));
			int yB = Integer.valueOf(B.substring(i + 1, i + 2));
//			System.out.println("Bx" + xB);
//			System.out.println("By" + yB);
			b1.bombB(xB, yB);

		}
		for (int i = 0; i < C.length(); i++) {
			if (i != 0 && i % 2 == 1) {
				continue;
			}
			int xC = Integer.valueOf(C.substring(i, i + 1));
			int yC = Integer.valueOf(C.substring(i + 1, i + 2));
//			System.out.println("Cx" + xC);
//			System.out.println("Cy" + yC);
			b1.bombC(xC, yC);

		}

		b1.prn();
		sc.close();
	}
}
