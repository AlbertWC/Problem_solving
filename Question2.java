import java.util.*;
public class Question2 
{
    public static void main(String[] agrs)
    {
        int[] x = {2, 3, 4, 5, 6};
        int[] x1 = {2, 4, 6, 8, 10};
        int[] x2 = {-3, -1, 0, 3, 21};
        int[] x3 = {-1, 4, 48, 12, 8};
        int[] x4 = {-1, -2, -3, -4, 21};

        System.out.println(findHCF(5 , x));
        System.out.println(findHCF(5, x1));
        System.out.println(findHCF(3, x2));
        System.out.println(findHCF(4, x3));
        System.out.println(findHCF(1, x4));
        
    }
    public static int findHCF(int num, int[] arr)
    {
        ArrayList<Integer> posarr = new ArrayList<Integer>();
        for(int i = 0 ; i < arr.length; i++)
        {
            if(arr[i] > 0)
            {
                posarr.add(arr[i]);
            }
        }
        int temp = posarr.get(0);
        for(int i = 0 ; i < posarr.size(); i++)
        {
            temp = hcf(posarr.get(i), temp);
        }

        return temp;
    }
    public static int hcf(int x , int y )
    {
        if (x <= 0)
        {
            return y;
        }
        else
        {
            return hcf(y%x,x);
        }
    }
}