public class sumelementsubindex 
{
    //adding all elements in an array and subtract each element with index
    public static void main(String[] args) 
    {
        int[] arr={1,2,3,4,5};
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(sum-arr[i]+" ");
        }
    }
}
