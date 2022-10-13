package difficultyLevelEasy.problems.strings;

public class FinalValueOfVariablesAfterPerformingOperations {

	public int finalValueAfterOperations(String[] operations) {
		int op = 0;
		
		for (String str : operations) {
			switch (str) {
			case "X++":
				op++;
				break;
			case "X--":
				op--;
				break;
			case "++X":
				++op;
				break;
			case "--X":
				--op;
				break;
			default:
				System.out.println("Invalid input");
			}

		}
		return op;
	}

}
