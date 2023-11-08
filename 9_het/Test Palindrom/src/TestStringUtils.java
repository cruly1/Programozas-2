public class TestStringUtils {
    private static void isPalindromeTest() {
        assert StringUtils.isPalindrome("gorog") == true;
        assert StringUtils.isPalindrome("(())") == false;
        assert StringUtils.isPalindrome("())(") == true;
    }

    public static void main(String[] args) {
        isPalindromeTest();
    }
}
