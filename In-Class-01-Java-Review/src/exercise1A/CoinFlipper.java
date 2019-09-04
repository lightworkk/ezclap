/*
 * CS272 ic01
 * 
 * A simple IPO Program
 * 
 * @author Scott Ly
 * @version 2019 09-04
 */
package exercise1A;
import java.util.Scanner;

public class CoinFlipper
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        System.out.print("How many times do you want to flip the coin? ");
        int s= input.nextInt();
        for(int i= s;i> 0;i--)
        {
            double x = Math.random();
            if(x>.50)
            {
                System.out.println("heads");
            }
            else
            {
                System.out.println("tails");
            }
        }
        
    }

}
