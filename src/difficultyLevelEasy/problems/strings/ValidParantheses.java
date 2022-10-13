package difficultyLevelEasy.problems.strings;

import java.util.Stack;

public class ValidParantheses {

	public boolean isValid(String s) {

		Stack<Character> stackS = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == ')') {
				boolean c = check(stackS, '(');
				if (c == false)
					return false;
			} else if (ch == '}') {
				boolean c = check(stackS, '{');
				if (c == false)
					return false;
			} else if (ch == ']') {
				boolean c = check(stackS, '[');
				if (c == false)
					return false;
			} else {
				stackS.push(ch);
			}
		}
		if (stackS.size() > 0) {
			return false;
		}

		return true;

	}

	public boolean check(Stack<Character> st, char ch) {
		if (st.size() > 0 && st.peek() == ch) {
			st.pop();
			return true;
		} else {
			while (st.size() > 0 && st.peek() == ch) {
				st.pop();
			}
		}
		return false;
	}

}
