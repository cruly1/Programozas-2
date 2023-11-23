using System;
using System.Collections.Generic;

namespace Ezernel_kisebb_pozitiv_egesz_szamok;

public static class PyUtils
{
    public static List<int> Range(int start, int end, int step)
    {
        List<int> result = new List<int>();
        
        for (int i = start; i < end; i+= step)
        {
            result.Add(i);
        }

        return result;
    }

    public static List<int> Range(int start, int end)
    {
        return Range(start, end, 1);
    }
    
    public static List<int> Range(int end)
    {
        return Range(0, end, 1);
    }
}
