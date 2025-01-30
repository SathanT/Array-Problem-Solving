public class addpositivenoarr
{
  //adding positive numbers in given array
  public static void main(String[]args)
  {
    int[] arr ={-2,1,-3,4,-1,2,1,-5,4};
    int sum =0;
    for(int i =0;i<arr.length;i++)
    {
      if(arr[i]>0)
      {
        sum+=arr[i];
      }
    }
        System.out.println(sum);
  }
}

