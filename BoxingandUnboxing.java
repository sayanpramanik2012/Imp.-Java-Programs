//Code By TGSAYAN
import java.util.Scanner;
public class BoxingandUnboxing
{
   public static void main(String args[])
   {
      int n=2,l,m;
      Scanner sc=new Scanner(System.in);  
      float i,o,k;
      
      i=sc.nextInt();
      o=sc.nextFloat();

      k=(i*100)+o;

      if (k-(int)k!=0){
         String s=String.valueOf(k);
         String[] splitter = s.toString().split("\\.");
      splitter[0].length();  
      splitter[1].length();
      l=splitter[0].length()+splitter[1].length()+1;
      System.out.println("Length : "+l);
      System.out.println("Output : "+k);
      }
      else{
      l = (int) (Math.log10(k) + 1);
      System.out.println("Length : "+l);
      m=(int)k;
      System.out.println("Output : "+m);
      }
      
   }
}