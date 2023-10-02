public class Main {
    public static void main(String[] args) {
        String s1 = "123";
        String s2 = "3.14";
        String s3 = "7.89";
        String s4 = "a";

        long l = Long.parseLong(s1);
        float f = Float.parseFloat(s2);
        double d = Double.parseDouble(s3);
        char c = s4.charAt(0);

        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c);
    }
}
