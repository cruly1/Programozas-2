public class V1 {
    public static void main(String[] args) {
        int number = Integer.parseInt(FileUtils.readLines("config.txt").get(0).replace("_", ""));

        String s = "";

        for (int i = 1; i <= number; i++) {
            s += i;
        }

        System.out.println(s);
    }
}
