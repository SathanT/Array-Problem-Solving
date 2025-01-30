public class addelementsarr
{
    //adding all elements in array
    public static void main(String[] args) 
    {
        int[] arr ={1,2,3,4,5,6,7,8,9,-1,-2,-9,-8};
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
          sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}
