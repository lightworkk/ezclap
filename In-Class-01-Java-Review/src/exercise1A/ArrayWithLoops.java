/*
 * CS272 ic01
 * Prcoess Array with Loops 
 * 
 * @author Scott Ly
 * @version 2019 09-04
 */

package exercise1A;
import java.util.Random;
public class ArrayWithLoops
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        int total = 0;
        int intArray[];
        intArray = new int[100];
        for(int i=0;i<intArray.length; i++)
        {
         intArray[i]= RNG(25,75);
        }
       for(int x=0;x<5;x++)
       {
          for(int f=0;f<20;f++)
          {
              
           System.out.print(intArray[total]+ " ");
           total++;
           
          }
          System.out.println(" ");
       }
    }
    public static int RNG(int min, int max)
{
    Random r = new Random();
    return r.nextInt((max-min)+1)+min;
}
}
