import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        

        int Arr[] = new int[n];
        for(int i=0;i<n; i++ ){
            Arr[i]= sc.nextInt();
        }
        int k = sc.nextInt();
        sc.close();
        
        //int f= Binary(Arr,k);
        int f = RecursiveSearch(Arr, 0, n-1, k);
        System.out.println(f);

    }

    static int Binary(int a[], int key){
        int low =0, high=a.length;
        while(low<=high){
            int mid = (low +high)/2;
            if(a[mid]==key){
                return mid;
            }
            else if(a[mid]>key){
                if(mid>0){
                    high= mid-1;
                }
                else{
                    return -1;
                }
            }
            else{
                if(mid<a.length-1){
                    low= mid+1;
                }
                else{
                    return -1;
                }
            }
        }
        return -1;
    }

    static int RecursiveSearch(int arr[], int low ,int high,int key){
    if(low<=high){

        int mid = (low+high)/2;
        if(arr[mid]==key){
            return mid;
        }
        else if(arr[mid]<key){
            RecursiveSearch(arr,mid+1,high, key);
        }
        else{
            RecursiveSearch(arr,low, mid-1, key);
        }
    }
    return -1;
        
    }
}
