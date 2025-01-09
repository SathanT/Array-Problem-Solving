public class searchelementarr {
    public static void main(String[] args) {
        int[] arr={2,5,4,3,0,9,7};
        int target=10;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target)
            {
                System.out.println("            Target number is : "+arr[i]);
                System.out.println("Target number is at position : "+i);
                break;
            }
             else{
               System.out.println("Your Target number not found!");  
               break;
            }
        }
        
    }
    
}
