package kh.baseball;


import java.util.Arrays;

/*
 * 숫자야구게임을 구현하자
 * - 숫자 3개 입력받고, 내부적으로 만들어진 목표 숫자와 비교한다
 * - 입력받은 값을 목표값과 비교할 때, 같은 위치에 같은 값인 경우 strike, 위치는 다르지만 같은 값인 경우 ball, 값이 없으면 out
 * - 총 10번 안에 목표 숫자를 맞추면 승리! 아니면 패배
 */

public class GoalNumber {
	
	int [] goalnumber = new int [3]; 
	
	public GoalNumber() {
		getGoalNum();
	}
	
	public int [] getGoalNum() {
		return goalnumber;
	}
	public void setGoalNum() {
		int [] goalnumber = getGoalNum();
		this.goalnumber = goalnumber;
		for (int i = 0; i < 3; i++) {
			goalnumber[i] = (int)(Math.random()*9)+1;
			for(int j = 0; j<i; j++) {
				if (goalnumber[i]==goalnumber[j]) {
					i--;
				}
			}
		}
	}
	

	@Override
	public String toString() {		
		return Arrays.toString(goalnumber);
	}

	public void toArrays() {
		
		
	}
}
