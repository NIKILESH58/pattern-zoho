import java.util.Scanner;
public class numbermax
{
    public static void main(String[] args) 

    {
        Scanner in = new Scanner(System.in);      
        int n = in.nextInt();         
        for (int i = 1; i <= n; i++) 
        {
            int num = i;             
            for (int j = 1; j <= i; j++) 
            {

            System.out.print(num+" ");                 

                num = num+n-j;

            }             

            System.out.println();

        }         


    }

}