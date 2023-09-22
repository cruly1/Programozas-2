public class FizzBuzz {
    private int limit;

    public FizzBuzz(int limit) {
        this.limit = limit;
    }

    public void zsa() {
        for (int i = 1; i <= this.limit; i++) {
            if (i % 15 == 0) {
                System.out.println("fizzbuzz");
            } else if (i % 3 == 0) {
                System.out.println("fizz");
            } else if (i % 5 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
