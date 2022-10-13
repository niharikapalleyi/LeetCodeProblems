package difficultyLevelEasy.problems.strings;

public class DefangingAnIPAddress {

	public String defangIPaddr(String address) {
		char[] arr = address.toCharArray();
		String op = "";
		for (char data : arr) {
			if (data != '.')
				op += data;
			else
				op += "[" + data + "]";
		}

		return op;
	}

}
