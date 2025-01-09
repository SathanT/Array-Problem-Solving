public class insertionelementarr {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int n= 2;
        int [] arr1=new int[6];
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(i==n){
                arr1[i]=6;
                count++;
            }
            if(i==n){
                arr1[count]=arr[i];
                count++;
            }
            else{
                arr1[count]=arr[i];
                count++;
            }
        }
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]);
        }
    }
}
