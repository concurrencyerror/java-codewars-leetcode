import leetcode.Solution387;
import org.junit.jupiter.api.Test;

public class TestLeetcode {


    @Test
    public void testT() {
        Solution387 s = new Solution387();
        int result = s.firstUniqChar("leetcode");
        assert result == 0;
    }
}
