import java.util.Scanner;

public class Question3
{
    public static void main(String[] agrs)
    {
        Scanner sc = new Scanner(System.in);
        //user input the string
        String x = sc.nextLine();
        //convert the string into lowercase before do the checker
        x = x.toLowerCase();
        String temp = "";
        //execute palindrome and store the reversed string
        for(int i = x.length(); i > 0 ;i--)
        {
            temp += x.charAt(i-1);
        }
        System.out.println(temp);
        //check original string and reversed string is matched 
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
