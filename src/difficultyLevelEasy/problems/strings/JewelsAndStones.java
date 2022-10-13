package difficultyLevelEasy.problems.strings;

public class JewelsAndStones {

	public int numJewelsInStones(String jewels, String stones) {
		int count = 0;
		char[] stonesArr = stones.toCharArray();
		char[] jewelsArr = jewels.toCharArray();
		for (int i = 0; i < jewelsArr.length; i++) {
			for (int j = 0; j < stonesArr.length; j++) {
				if (stonesArr[j] == jewelsArr[i])
					count++;
			}
		}
		return count;
	}

}
