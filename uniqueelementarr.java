public class uniqueelementarr
{
    //returning unique elements 
    public static void main(String[] args) 
    {
       int[] arr={1,1,2,3,3,5,4,3,2};
      
       for(int i=0;i<arr.length;i++)
       {
        int c=0;
        for(int j=0;j<arr.length;j++)
        {
           if( i!=j && arr[i]==arr[j])
           {
                c++;
           }
        }
        if(c==0)
        {
            System.out.print(arr[i]+ " ");
        }
    }
}
}
