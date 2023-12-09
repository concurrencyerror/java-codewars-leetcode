package leetcode;

/**
 * 2022/2/23
 * PACKAGE_NAME
 * horace
 */
public class ReverseOnlyLetters917 {
    public String reverseOnlyLetters(String s) {
        char[] array = s.toCharArray();
        int n = array.length;
        for (int i = 0, j = n - 1; i < j; ) {
            while (i < j && !Character.isLetter(array[i])) i++;
            while (i < j && !Character.isLetter(array[j])) j--;
            if (i < j) {
                char temp = array[i];
                array[i++] = array[j];
                array[j--] = temp;
            }
        }
        return String.valueOf(array);
    }
}
