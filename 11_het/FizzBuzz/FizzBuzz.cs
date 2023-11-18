using static System.Console;

namespace FizzBuzz
{
    public class FizzBuzz
    {
        private int num;

        public FizzBuzz(int num)
        {
            this.num = num;
        }

        public void start()
        {
            for (int i = 1; i <= this.num ; i++)
            {
                if (i % 3 == 0) Write("Fizz");
                
                if (i % 5 == 0) Write("Buzz");
                
                if (i % 3 != 0 && i % 5 != 0) Write(i);
                
                WriteLine();
            }
        }
    }
}
