using System;
using static System.Console;
using System.Linq;
using System.Collections;
using System.Collections.Generic;

namespace ToInt
{
    public class Program
    {
        public static void Main(string[] args)
        {
            string s = "42";
            int num = s.ToInt();
            WriteLine(num);
        }
    }
}