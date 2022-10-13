package difficultyLevelEasy.problems.strings;

public class SortingTheSentence {

	public String sortSentence(String s) {
		char ch;
		int len = 0;
		String output = "";
		String[] arr = s.split(" ");
		String[] op = new String[arr.length];
		for (String str : arr) {
			ch = str.charAt(str.length() - 1);
			len = Integer.parseInt(String.valueOf(ch));
			op[len - 1] = str.substring(0, str.length() - 1);
		}

		for (int i = 0; i < op.length; i++) {
			output += op[i];
			if (i != op.length - 1)
				output += " ";
		}

		return output;
	}

}
