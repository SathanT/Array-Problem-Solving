public class addingelementsarr 
{
   //adding existing array elements into new array
   public static void main(String[] args)
   {
       int[] arr ={1,2,3,4,5};
       int[] arr2=new int[5];
       int k =0;
       for(int i=0;i<arr.length;i++)
        {
        if(k>=0)
        {
        arr2[k]=arr[i];
        k++;
        }
        }
       for(int i=0;i<5;i++){
        System.out.print(arr2[i]);
       }
   } 
}
