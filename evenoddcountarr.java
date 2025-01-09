public class evenoddcountarr {
    public static void main(String[] args) {
        int[] arr ={2,3,5,6,7,12,3,44,23,11,22};
        int o=0;
        int e=0;
        int ec=0;
        int oc=0;
        int[] odd = new int[arr.length];
        int[] even = new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
            even[e]=arr[i];
            ec++;
            e++;
            }
            else{
                odd[o]=arr[i];
                oc++;
                o++;
            }
        }
        for(int i=0;i<e;i++)
        {
            System.out.println("Even Number is "+ even[i]);
        }
        for(int i=0;i<o;i++)
        {
            System.out.println("Odd Number is "+ odd[i]);
       }
        System.out.println("Number of Even numbers is : "+ec);
        System.out.println("Number of Odd numbers  is : "+oc);
    }
}
