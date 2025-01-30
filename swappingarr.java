public class swappingarr
{
    //swapping index value 
    public static void main(String[]args)
    {
       int[] arr={1,2,3,4,5};
       int temp=0;
       int fi=2;
       int si=3;
            temp=arr[fi];
            arr[fi]=arr[si];
            arr[si]=temp;
    
       for(int i=0;i<arr.length;i++)
       {
        System.out.print(arr[i]);
       }
    }
}
