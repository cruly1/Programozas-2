using System;
using static System.Console;
using System.Linq;
using System.Collections;
using System.Collections.Generic;

namespace FizzBuzz
{
    public class Program
    {
        public static void Main(string[] args)
        {
            FizzBuzz fb = new FizzBuzz(100);
            fb.start();
        }
    }
}
