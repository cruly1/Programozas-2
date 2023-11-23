namespace ToInt;

public static class StringExtensions
{
    public static int ToInt(this string s)
    {
        return int.Parse(s);
    }
}