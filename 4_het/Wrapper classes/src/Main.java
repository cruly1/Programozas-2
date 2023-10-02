public class Main {
    public static void main(String[] args) {
        // char -> int
        int n = Character.getNumericValue('5');
        System.out.println(n);

        // char -> toUpperCase
        // a metódus önmagában nem modositja a karaktert
        char c = 'a';
        System.out.println(Character.toUpperCase(c));

        // összead két egész számot
        System.out.println(Integer.sum(5, 5));

        // String -> int
        String s = "51";
        int szam = Integer.parseInt(s);
        System.out.println(szam);

        // String -> double
        s = "3.14";
        double d = Double.parseDouble(s);
        System.out.println(d);

        // ha az első nagyobb mint a második, akkor 1, ha egyenlő, akkor 0, ha kisebb akkor -1
        System.out.println(Double.compare(3.15, 3.14));

        // logikai 'vagy' értéket konvertál két boolean értékből
        System.out.println(Boolean.logicalOr(false, true));

        // logikai 'és' értéket konvertál két boolean értékből
        System.out.println(Boolean.logicalAnd(false, true));
        System.out.println(Boolean.logicalAnd(true, true));
    }
}
