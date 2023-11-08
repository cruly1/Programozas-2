import java.util.List;

public class Main {
    public static void main(String[] args) {
        String fileName = "words_alpha.txt";
        List<String> sorok = FileUtils.readLines(fileName);

        int palindromeCounter = 0;

        for (String sor : sorok) {
            if (StringUtils.isPalindrome(sor)) {
                palindromeCounter++;
            }
        }

        System.out.println("A fajlban levo palindrom szavak szama: " + palindromeCounter);

        if (StringUtils.isPalindrome(String.valueOf(palindromeCounter))) {
            System.out.println("Ez a szam szinten palindrom!");
        } else {
            System.out.println("Ez a szam nem palindrom!");
        }
    }
}
