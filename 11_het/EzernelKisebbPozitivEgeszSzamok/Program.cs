using System;
using static System.Console;
using System.Linq;
using System.Collections;
using System.Collections.Generic;

namespace Ezernel_kisebb_pozitiv_egesz_szamok
{
    public class Program
    {
        public static void Main(string[] args)
        {
            int sum = 0;
            
            for (int i = 1; i < 1000; i++)
            {
                if (i % 3 == 0 || i % 5 == 0)
                {
                    sum += i;
                }
            }
            
            WriteLine(sum);
        }
    }
}
