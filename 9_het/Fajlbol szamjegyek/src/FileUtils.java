import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {
    public static List<String> readLines(String fileName) {
        List<String> lines = new ArrayList();

        try {
            String line;
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.exit(1);
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(2);
        }

        return lines;
    }

    public static List<Integer> readFirstLineAsDigits(String fileName) {
        List<Integer> digits = new ArrayList();
        String firstLine = readLines(fileName).get(0);

        for (char letter : firstLine.toCharArray()) {
            digits.add(Integer.parseInt(String.valueOf(letter)));
        }

        return digits;
    }
}
