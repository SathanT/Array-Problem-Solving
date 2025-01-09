import java.util.Scanner;
class array{
    public static void main(String[] args) {
        int n=5;
        int [] arr=new int[n];
        System.out.println("Enter a NUmber:");
        for (int i=0;i<=n-1;i++)
        {
            Scanner sc=new Scanner(System.in);
            arr[i]=sc.nextInt();
                
        }
        for (int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
            
        }
           

    }
      

}
