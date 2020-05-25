package kh.bombs;


public class Bombs {
	/*
	 * 폭탄게임 - 10*10 크기의 맵에, A폭탄/B폭탄/C폭탄을 입력하면, 폭탄의 범위들이 맵에 출력되도록 하자 - 폭탄의 범위는 다음과 같다
	 * A폭탄 : 가로 세로 각 1칸씩 B폭탄 : 가로 세로 각 2칸씩 C폭탄 : 가로 세로 각 3칸씩 * *** * - 입력할 수 있는 폭탄의
	 * 갯수는 제한이 없으며, 각 폭탄의 종류는 /로 구분한다. 입력 예 : 0192/22980977/55 
	 * A폭탄 : (0,1), (9,2)
	 * B폭탄 : (2,2), (9,8), (0,9), (7,7) 
	 * C폭탄 : (5,5)
	 *
	 *
	 */

	private String[][] map = new String[10][10];

	private String[][] getMap() {
		return map;
	}

	private void prnMap(String[][] map) {
		map = getMap();
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				if (map[i][j] == null) {
					map[i][j] = "_";
				}
				System.out.printf("%2s", map[i][j]);

				if (j % 9 == 0 && j != 0) {
					System.out.println();
				}
			}
		}

	}

	public void bombA(int x, int y) {
		for (int i = 1; i < 2; i++) {
			map[x][y] = "A";
			if (!(x + i >= map.length)) {
				map[x + i][y] = "A";
			}
			if (!(x - i < 0)) {
				map[x - i][y] = "A";
			}
			if (!(y + i >= map.length)) {
				map[x][y + i] = "A";
			}
			if (!(y - i < 0)) {
				map[x][y - i] = "A";
			}
		}
	}

	public void bombB(int x, int y) {
		for (int i = 1; i < 3; i++) {
			map[x][y] = "B";
			if (!(x + i >= map.length)) {
				map[x + i][y] = "B";
			}
			if (!(x - i < 0)) {
				map[x - i][y] = "B";
			}
			if (!(y + i >= map.length)) {
				map[x][y + i] = "B";
			}
			if (!(y - i < 0)) {
				map[x][y - i] = "B";
			}
		}
	}

	public void bombC(int x, int y) {
		for (int i = 1; i < 4; i++) {
			map[x][y] = "C";
			if (!(x + i >= map.length)) {
				map[x + i][y] = "C";
			}
			if (!(x - i < 0)) {
				map[x - i][y] = "C";
			}
			if (!(y + i >= map.length)) {
				map[x][y + i] = "C";
			}
			if (!(y - i < 0)) {
				map[x][y - i] = "C";
			}
		}
	}

	public void prn () {
		prnMap(map);
	}
	
	public void bomb(int x, int y) {
		bombA(x, y);
		bombB(x, y);
		bombC(x, y);

		prnMap(map);
	}
}
