using System;
using static System.Console;
using System.Linq;
using System.Collections;
using System.Collections.Generic;

namespace Egesz_szam_megforditasa
{
    public class Program
    {
        public static int Megfordit(int num)
        {
            return int.Parse(string.Join("", num.ToString().Reverse()));
        }
        
        public static void Main(string[] args)
        {
            int num1 = 1977;
            int num2 = Megfordit(num1);
            WriteLine(num2);
        }
    }
}