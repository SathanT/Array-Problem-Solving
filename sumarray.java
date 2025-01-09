import java.util.Scanner;
public class sumarray {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Length of an Array:");
        int n=scan.nextInt();
        int[] arr=new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
            sum+=arr[i];

        }System.out.println("the sum of array is "+sum);
        
    }
    
}
