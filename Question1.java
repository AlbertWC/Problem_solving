public class Question1 
{
    public static void main(String[] agrs)
    {
        int a = 1 ;
        while ( a < 100)
        {
            if(a % 3 == 0|| a % 5 == 0)
            {
                System.out.println(a);
            }
            a++;
        }
    }
}