//Code By TGSAYAN
import java.util.Scanner;

public class InsertionSort 
{

    public static void sort( int arr[] )
    {
        int N = arr.length;
        int i, j, temp;
        for (i = 1; i< N; i++) 
        {
            j = i;
            temp = arr[i];    
            while (j > 0 && temp < arr[j-1])
            {
                arr[j] = arr[j-1];
                j = j-1;
            }
            arr[j] = temp;            
        }        
    }    

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner( System.in );        

        int n, i;
        n = scan.nextInt();
        int arr[] = new int[ n ];
        for (i = 0; i < n; i++)
            arr[i] = scan.nextInt();

        sort(arr);       
        for (i = 0; i < n; i++)
            System.out.print(arr[i]+" ");            
        System.out.println();                     
    }    
}