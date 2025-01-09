import java.util.Arrays;
public class secondLargestarr {
    public static void main(String[] args) {
        int [] arr = {2,3,1,5,4};
        int n = arr.length;
        Arrays.sort(arr);
        System.out.println(arr[n-2]);
    }
    
}
