package difficultyLevelEasy.problems.strings;

public class ValidPalindrome {

	public boolean isPalindrome(String s) {
		s = s.toLowerCase();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
			if (Character.isLetterOrDigit(s.charAt(i))) {
				sb.append(s.charAt(i));
			}
		}

		s = String.valueOf(sb);
		String rev = String.valueOf(sb.reverse());
		if (s.equals(rev)) {
			return true;
		}
		return false;
	}

}
