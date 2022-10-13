package difficultyLevelEasy.problems.strings;

public class IsSubsequence {

	public boolean isSubsequence(String s, String t) {
		int i = 0, j = 0;
		while (i < s.length()) {
			char charS = s.charAt(i);
			while (j < t.length() && t.charAt(j) != charS) {
				j++;
			}
			if (j >= t.length()) {
				return false;
			}
			i++;
			j++;
		}
		return true;
	}

}
