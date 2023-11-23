using System;
using System.Collections.Generic;

namespace Linq_Gyakorlas;

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
