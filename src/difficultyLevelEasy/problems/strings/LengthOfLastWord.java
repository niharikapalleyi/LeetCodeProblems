package difficultyLevelEasy.problems.strings;

public class LengthOfLastWord {

	public int lengthOfLastWord(String s) {
		String[] arr = s.split(" ");
		return arr[arr.length - 1].length();
	}

}
