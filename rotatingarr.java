public class rotatingarr
{
    //rotating array
    public static void main(String[] args) 
    {
        int[] arr={1,2,3,4,5};
        int rotate=3;
        for(int i=rotate+1;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }
        for(int i=0;i<=rotate;i++){
            System.out.print(arr[i]);
        }

    }
}
