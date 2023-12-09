package leetcode;

//检测大写字母第520号题
public class _520 {
//	public static boolean detectCapitalUse(String word) {
//		if (word.length() <= 1) {
//			return true;
//		} else {
//			boolean flag = word.charAt(0) >= 'A' ? true : false;
//			for (int i = 1; i < word.length(); i++) {
//				if (flag) {
//					if (word.charAt(i) < 'A') {
//						return false;
//					}
//				} else {
//					if (word.charAt(i) >= 'A') {
//						return false;
//					}
//				}
//			}
//		}
//		return true;
//	}
	public static boolean detectCapitalUse(String word) {
		if (word.length() <= 1) {
			return true;
		}
		int[] temp = new int[word.length()];
		for (int i = 0; i < temp.length; i++) {
			if (word.charAt(i) <= 'Z') {
				temp[i] = 1;
			}
		}
		if (temp[0] == 0 && temp[1] == 1) {
			return false;
		}
		for (int i = 2; i < temp.length; i++) {
			if (temp[0] == 1) {
				if (temp[1] == 1) {
					if (temp[i] == 0) {
						return false;
					}
				} else {
					if (temp[i] == 1) {
						return false;
					}
				}
			} else {
				if (temp[1] == 0) {
					if (temp[i] == 1) {
						return false;
					}
				} else {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String testString = "mL";
		detectCapitalUse(testString);
	}
}
