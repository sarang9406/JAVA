package kh.baseball;

public class WrongInputException extends Exception {
	
	public WrongInputException() {
		System.out.println("You have input incorrect number, please input numbers from 1~9.");
	}

}
