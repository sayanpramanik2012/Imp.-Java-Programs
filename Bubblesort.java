//Code By TGSAYAN
import java.util.Scanner;
public class Bubblesort
{
   public static void main(String[] args)
   {
      int i, j, x;
      Scanner s = new Scanner(System.in);
      String input = s.nextLine();
      String[] arr = input.split(" ");
      
      int n = arr.length;
      int[] array = new int [n];
      for(i=0; i<n; i++) {
         array[i] = Integer.parseInt(arr[i]);
      }
      
      
      for(i=0; i<(n-1); i++)
      {
         for(j=0; j<(n-i-1); j++)
         {
            if(array[j]>array[j+1])
            {
               x = array[j];
               array[j] = array[j+1];
               array[j+1] = x;
            }
         }
      }
      
      for(i=0; i<n; i++)
         System.out.print(array[i]+ " ");
   }
}