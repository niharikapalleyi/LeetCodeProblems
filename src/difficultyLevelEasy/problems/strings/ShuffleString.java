package difficultyLevelEasy.problems.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ShuffleString {

	public String restoreString(String s, int[] indices) {

		char[] arr = s.toCharArray();
		String output = "";
		char a;
		Map<Integer, Integer> initData = new HashMap<Integer, Integer>();
		for (int i = 0; i < indices.length; i++) {
			initData.put(indices[i], i);
		}

		Map<Integer, Integer> intData = new TreeMap<Integer, Integer>(initData);

		for (Map.Entry<Integer, Integer> entry : intData.entrySet()) {
			a = arr[entry.getValue()];
			System.out.println(a);
			output += a;
		}

		return output;
	}

}
