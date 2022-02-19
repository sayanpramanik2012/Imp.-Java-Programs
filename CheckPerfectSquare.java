//Code By TGSAYAN
import java.util.Scanner;  
public class CheckPerfectSquare  
{  
public static void main(String[] args)  
{  
Scanner sc = new Scanner(System.in);  
int number = sc.nextInt();   
double x = Math.sqrt(number);   
if(x == (int)x)  
{  
System.out.println(number+" is a perfect square");  
}  
else  
{  
System.out.println(number+" is not a perfect square");  
}  
}  
}  