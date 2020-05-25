package codesignal.sequence;

import java.util.Arrays;

public class Sequence {

	boolean almostIncreasingSequence(int[] sequence) {
		int cnt = 0;
		int count = 0;
		for (int i = 1; i <= sequence.length - 1; i++) {
			if (sequence[i - 1] < sequence[i]) {
				cnt++;
				continue;
			} 
		}
		if (cnt == sequence.length - 2) {
			Arrays.sort(sequence);
			for (int i = 1; i <= sequence.length - 1; i++) {
				if (sequence[i - 1] == sequence[i]) {
					count++;
				} 
			}
		}
		if (count>=2) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {

		int[] s1 = { 1, 2, 5, 3, 5 };
		int[] s2 = { 1, 2, 1, 2 };

		Sequence sequence = new Sequence();
		System.out.println(sequence.almostIncreasingSequence(s1));
		System.out.println(sequence.almostIncreasingSequence(s2));
	}

}
