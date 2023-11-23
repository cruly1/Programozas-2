using System;
using static System.Console;
using System.Linq;
using System.Collections;
using System.Collections.Generic;

namespace Linq_Gyakorlas
{
    public class Program
    {
        public static void Main(string[] args)
        {
            feladat_1();
            feladat_2();
            feladat_3();
            feladat_4();
            feladat_5();
            feladat_6();
            feladat_7();
            feladat_8();
            feladat_10();
            feladat_11();
            feladat_12();
            feladat_14();
            feladat_15();
        }

        private static void feladat_1()
        {
            var lista = new List<string> {"auto", "villamos", "metro"};
            var result = lista.Select(s => s.ToUpper() + "!");
            WriteLine(string.Join(", ", result));
        }

        private static void feladat_2()
        {
            var lista = new List<string> {"aladar", "bela", "cecil"};
            var result = lista.Select(s => s[0].ToString().ToUpper() + s[1..]);
            WriteLine(string.Join(", ", result));
        }

        private static void feladat_3()
        {
            var lista = PyUtils.Range(10);
            var result = lista.Select(n => n = 0);
            WriteLine(string.Join(", ", result));
        }

        private static void feladat_4()
        {
            var lista = PyUtils.Range(1, 11);
            var result = lista.Select(n => n * 2);
            WriteLine(string.Join(", ", result));
        }

        private static void feladat_5()
        {
            var lista = PyUtils.Range(1, 11).Select(n => n.ToString());
            var result = lista.Select(n => int.Parse(n));
            WriteLine(string.Join(", ", result));
        }

        private static void feladat_6()
        {
            string s = "1234567";
            var result = s.Select(c => char.GetNumericValue(c)).ToList();
            WriteLine(string.Join(", ", result));
        }

        private static void feladat_7()
        {
            string s = "The quick brown fox jumps over the lazy dog";
            string[] parts = s.Split(" ");
            var result = parts.Select(s => s.Length).ToList();
            WriteLine(string.Join(", ", result));
        }

        private static void feladat_8()
        {
            string s = "python is an awesome language";
            string[] parts = s.Split(" ");
            var result = parts.Select(s => s[0]).ToList();
            WriteLine(string.Join(", ", result));
        }

        private static void feladat_10()
        {
            var lista = PyUtils.Range(10);
            var result = lista.Where(n => n % 2 == 0).ToList();
            WriteLine(string.Join(", ", result));
        }

        private static void feladat_11()
        {
            var lista = PyUtils.Range(20);
            var result = lista.Select(n => n * n).Where(n => n % 2 == 0).ToList();
            WriteLine(string.Join(", ", result));
        }

        private static void feladat_12()
        {
            var lista = PyUtils.Range(20);
            var result = lista.Select(n => n * n).Where(n => n.ToString()[^1] == '4').ToList();
            WriteLine(string.Join(", ", result));
        }

        private static void feladat_14()
        {
            var lista = new List<string> {" apple ", " banana ", " kiwi"};
            var result = lista.Select(s => s.Trim()).ToList();
            WriteLine(string.Join(", ", result));
        }

        private static void feladat_15()
        {
            var lista = new List<int> {1, 0, 1, 1, 0, 1, 0, 0};
            var result = string.Join("", lista);
            WriteLine(result);
        }
    }
}
