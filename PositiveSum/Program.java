public class Program{
    public static void main(String[] args) {
        int arr[] = {-20,-5,-1,-2,0,-5,-1,0};
        int sum=0;
        boolean count=false;
        for(int i = 0; i<=arr.length-1; i++){
            if(arr[i]>0){
                sum+=arr[i];
                count=true;
            }
        }
        double average = sum/2;
        System.out.println(count==true?"Average is: "+average : "No any positive number " );
       
    }
}