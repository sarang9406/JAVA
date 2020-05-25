package codesignal.character;

public class FirstNotRepeatingCharacter {
	char firstNotRepeatingCharacter(String s) {

		char[] ch = s.toCharArray();

		for (int i = 0; i < s.length(); i++) {
			if (s.indexOf(ch[i]) == s.lastIndexOf(ch[i])) {

				return ch[i];
			}

		}

		return '_';
	}

	public static void main(String[] args) {
		String s = "abacabad";
		String s2 = "abacabaabacaba";
		String s3 = "bcb";
		FirstNotRepeatingCharacter nrc = new FirstNotRepeatingCharacter();

		System.out.println(nrc.firstNotRepeatingCharacter(s));

		System.out.println(nrc.firstNotRepeatingCharacter(s2));

		System.out.println(nrc.firstNotRepeatingCharacter(s3));
		
		
		
		
	}
}
