
public class Sort {

    //Good for small amount of data/array
    //Insertion Sort
   // Best O(n), Worst O(n^2), Average O(n^2) Space Complexity O(1), Stability Yes

    public static void insertionSort(int[] a){
        if(a.length==0){
            return;
        }
        if(a.length==1){
            return;
        }

        // i step
       for(int i = 1; i < a.length; i++){
           int key = a[i];
           int j = i-1; // increase the j

           // For descending order, change key<array[j] to key>array[j].
           while (j>=0 && key < a[j]){
               a[j+1] = a[j];
               j = j-1;
           }

           a[j+1] = key;
       }
    }

    public static void main(String[] args) {
        int [] a = {4,3,2,10,12,1,5,6};
        insertionSort(a);

        for (int i : a) {
            System.out.println(i);
        }

    }
}
