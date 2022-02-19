//Code By TGSAYAN
import java.util.Scanner;
public class Binarysearch
{
   public static void main(String args[])
   {
      int counter, num, i,array[], item, first, last, middle;
      Scanner s = new Scanner(System.in);
      String input = s.nextLine();
      String[] arr = input.split(" ");
      
      num = arr.length;
      array = new int [num];
      for(i=0; i<num; i++) {
         array[i] = Integer.parseInt(arr[i]);
      }
      
      int n=num;
      //array = new int[num];
      item = s.nextInt();
      first = 0;
      last = num - 1;
      middle = (first + last)/2;

      

      while( first <= last )
      {
         if ( array[middle] < item )
           first = middle + 1;
         else if ( array[middle] == item )
         {
           System.out.println("Element "+ item +" is found in the given List.\n");
           break;
         }
         else
         {
             last = middle - 1;
         }
         middle = (first + last)/2;
      }

      if ( first > last )
          System.out.println("Element "+ item +" is not found in the given List.\n");
   }
}