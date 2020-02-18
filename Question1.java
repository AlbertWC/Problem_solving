public class Question1 
{
    public static void main(String[] agrs)
    {
        int a = 1 ;
        while ( a < 100)
        {
            //if the modulus of 3 or 5 getting 0 which means that the value is the factor of 3 or 5. 
            if(a % 3 == 0|| a % 5 == 0)
            {
                System.out.println(a);
            }
            a++;
        }
    }
}
