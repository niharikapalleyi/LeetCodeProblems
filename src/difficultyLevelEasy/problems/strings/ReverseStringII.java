package difficultyLevelEasy.problems.strings;

public class ReverseStringII {

	public String reverseStr(String s, int k) {

		char[] arr = s.toCharArray();
		int l = s.length();

		if (l < k)
			k = l;

		for (int i = 0; i < l - 1; i = i + 2 * k) {
			int j = i, m = i + k - 1;
			if (m >= l) {
				m = l - 1;
			}
			while (j < m) {
				char b = arr[j];
				arr[j++] = arr[m];
				arr[m--] = b;
			}
		}
		return String.valueOf(arr);
	}

}
