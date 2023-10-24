public class Main {
    public static void main(String[] args) {
        String s = PyUtils.input("Text: ");
        String res = StringUtils.randomCase(s);
        System.out.println(res);
    }
}
