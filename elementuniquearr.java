public class elementuniquearr 
{
   //returning unique elements in three arrays 
   public static void main(String[] args) 
   {
       int[] arr ={1,2,3};
       int[] arr1 ={1,2};
       int[] arr2 ={1,2,3,4,5};
       for(int i=0;i<arr.length;i++)
       {
        for(int j=0;j<arr1.length;j++)
        {
            for(int z=0;z<arr2.length;z++)
            {
               if(arr[i]==arr1[j]&&arr[i]==arr2[z])
               {
                System.out.print(arr[i]);
               }
            }
        }
    }
  }
}
