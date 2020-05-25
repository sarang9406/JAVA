package kh.baseball;

import java.util.Arrays;
import java.util.Scanner;

public class MTest {

	public static void main(String[] args) {
		int cnt = 0;
		GoalNumber gn = new GoalNumber();
		gn.setGoalNum();
		System.out.println("목표숫자: " + gn);

		BaseBallBingo bb = new BaseBallBingo();

		int[] inputnum = new int[3];
		System.out.println("WELCOME TO BASEBALL BINGO!!");
		Scanner sc = new Scanner(System.in);

		while (true) {
			if (Arrays.equals(inputnum, gn.goalnumber)) {
				System.out.println("You Win!!");
				System.out.println("Goal Numbers: " + gn);
				break;
			} else {

				try {
					System.out.println("Please input three numbers (1~9)");
					for (int i = 0; i < inputnum.length; i++) {
						inputnum[i] = sc.nextInt();
						if (inputnum[i] <= 0 || inputnum[i] > 10) {
							throw new WrongInputException();
						}

					}
					if (inputnum[0] == inputnum[1] || inputnum[1] == inputnum[2] || inputnum[2] == inputnum[0]) {
						throw new WrongInputException();
					}

					cnt++;
				} catch (WrongInputException e) {

					continue;
				}

				System.out.println("cnt" + cnt);
				bb.baseballBingo(inputnum, gn.goalnumber);

				if (cnt >= 4) {
					System.out.println("You Lost!!");
					System.out.println("Goal Numbers: " + gn);
					break;
				}
			}

		}
	}

}
