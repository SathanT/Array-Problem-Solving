public class sortarr
{
    //sorrting an array and printing alternate elements
    public static void main(String[] args)
    {
        int[] arr = {9,0,4,3,0,5,2,5,1,6};
        int temp=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
        }   }  
        for(int i=0;i<arr.length;i=i+2)
        {
            System.out.print(arr[i]);
        }  
    }
}
