public class addnegativenoarr
{
    //adding negative numbers in an array
    public static void main(String[] args)
    {
      int[] arr={1,2,-1,9,-8,-7,-9,0};
      int sum=0;
      for(int i=0;i<arr.length;i++)
      {
        if(arr[i]<0)
        {
          sum=sum+arr[i];
        }        
      }
      System.out.println(sum);
    }
}
