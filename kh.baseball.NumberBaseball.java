package kh.baseball;

import java.util.Arrays;
import java.util.Scanner;

public class NumberBaseball {
	/*
	 * 숫자야구게임을 구현하자
  	 * - 숫자 3개 입력받고, 내부적으로 만들어진 목표 숫자와 비교한다
	 * - 입력받은 값을 목표값과 비교할 때, 같은 위치에 같은 값인 경우 strike, 위치는 다르지만 같은 값인 경우 ball, 값이 없으면 out
	 * - 총 10번 안에 목표 숫자를 맞추면 승리! 아니면 패배
	 * 
	 */
	
	//목표숫자 선언
	static int goalnum[] = new int [3];
	

	public static void baseballBingo(int[] inputnum) {
		int strikecnt = 0;
		int ballcnt = 0;
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (inputnum[i] == goalnum[j]) {
					ballcnt++;
				}
			}
			if (goalnum[i] == inputnum[i]) {
				strikecnt++;
			} 
		}
		
		if (ballcnt == 0 && strikecnt == 0 ) {
			System.out.println("out");
		}else {
			System.out.println(ballcnt + " ball");
			System.out.println(strikecnt + " strike");
		}
	}

	public static void main(String[] args) throws WrongInputException  {
		for (int i = 0; i < 3; i++) {
			goalnum[i] = (int) (Math.random() * 9) + 1;
			for (int j = 0; j < i; j++) {
				if (goalnum[i] == goalnum[j]) {
					i--;
				}
			}
		}

		System.out.println("Welcome to Number Baseball Game!");
//		System.out.println("Goal Numbers: " + Arrays.toString(goalnum));
		System.out.println();
		//숫자 3개 입력
		Scanner sc = new Scanner(System.in);
		
		int[] inputnum = new int[3];
		int cnt = 0;

		while (true) {
			if (Arrays.equals(inputnum, goalnum)) {
				System.out.println("You Win!!");
				System.out.println("Goal Numbers: " + Arrays.toString(goalnum));
				break;
			} else {
				System.out.println("Please input three numbers (1~9)");
				for (int i = 0; i < inputnum.length; i++) {
					inputnum[i] = sc.nextInt();		
				}
				if (inputnum[0]==inputnum[1] || inputnum[1]==inputnum[2] || inputnum[2]==inputnum[0]) {
					throw new WrongInputException();
				} else {
					baseballBingo(inputnum);
					cnt++;
				}
			}
			if (cnt == 3) {
				System.out.println("You Lost!!");
				System.out.println("Goal Numbers: " + Arrays.toString(goalnum));
				break;
			}
		}
		sc.close();
	}
}
