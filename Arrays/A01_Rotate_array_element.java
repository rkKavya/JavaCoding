package Arrays;

/*
 * Rotate array items based on given number d
 */
public class A01_Rotate_array_element {
    public static void main(String[] args) {
        int arr[]={ 1, 2, 3, 4, 5, 6, 7 };
        int n= arr.length;
        int d=2;
        rotate1(arr,n,d);
        PrintTheArray(arr, n);
    }

    /*
     * Solution 1:
     * - create temp array
     * - move items from position d to n-1 from original array to temp array
     * - then move items from pos 0 to d-1 to temp array
     * - them copy all items from temp array to original array
     */
    static void rotate1(int arr[], int n, int d){
        int temp[]=new int[n];
        int k=0;
        for(int i=d;i<n;i++){
            temp[k]=arr[i];
            k++;
        }
        for(int i=0;i<d;i++){
            temp[k]=arr[i];
            k++;
        }
       
        for(int i=0;i<n;i++){
            arr[i]=temp[i];
        }
    }
       
    
    static void PrintTheArray(int arr[], int n){
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    
    



    /*
     * Solution 2: Effecient - will not use extra space
     * - 
     */
}
