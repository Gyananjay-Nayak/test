public class ArraySum {

    public static void main(String[] args0){
    //int arr[]= new int[5];
    int[] arr= {1,2,3,4,5,6};
    //int z=8;

    for(int i=0;i< arr.length;i++){
        for(int j=i+1;j< arr.length;j++){
            if(arr[i]+arr[j]==8){
                System.out.print(arr[i]+"," +arr[j]+"  ");
            }
        }
    }
    }
}
