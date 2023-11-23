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
            var lista = PyUtils.Range(1000);
            var result = lista.Where(n => n % 3 == 0 || n % 5 == 0).Sum();
            WriteLine(result);
        }
    }
}