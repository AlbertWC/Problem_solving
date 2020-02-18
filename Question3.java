import java.util.Scanner;

public class Question3
{
    public static void main(String[] agrs)
    {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        x = x.toLowerCase();
        String temp = "";
        for(int i = x.length(); i > 0 ;i--)
        {
            temp += x.charAt(i-1);
        }
        System.out.println(temp);
        if(temp.equals(x))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}