package kh.baseball;


public class BaseBallBingo {
	
	public void baseballBingo(int[] inputnum, int [] goalnum) {
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

}
