public class uniquenumarr {
    public static void main(String[] args) {
        int[] arr={3,3,3,1,2,2,1,3,4,4,4,4};
        int num=0;
        int n=0;
        for(int i=0;i<arr.length;i++){
            boolean check = true;
            for(int j=0;j<arr.length;j++){
                if(i!=j){
                    if(arr[i]==arr[j]){
                        check=false;
                       break;
                    }
                }

            }
            if(check) num++;
        } 
        n=num;
        System.out.println(n);
    }
    
}
