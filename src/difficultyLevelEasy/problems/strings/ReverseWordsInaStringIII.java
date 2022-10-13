package difficultyLevelEasy.problems.strings;

public class ReverseWordsInaStringIII {

	public String reverseWords(String s) {

		String[] subStrings = s.split(" ");
		String output = "";

		if (s.length() == 0 || s == null) {
			return null;
		}

		for (String str : subStrings) {
			output += reverseString(str);
			if (str != subStrings[subStrings.length - 1]) {
				output += " ";
			}
		}

		return output;
	}

	public String reverseString(String str) {
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		return sb.toString();
	}

}
