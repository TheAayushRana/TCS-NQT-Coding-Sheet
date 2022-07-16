// Find the smallest element in an array

//  Example 1:
//        Input: arr[] = {2,5,1,3,0};
//        Output: 0
//        Explanation: 0 is the smallest element in the array.

// Approch: First Sorting the array after sorting display the first element which will be smallest.

public class SmallestElement {
    public static void main(String[] args) {
        int[] arr= {2,5,1,3,0};
        bubblesort(arr);
    }
    static int[] bubblesort(int[] arr){
        boolean swapped;
        for(int i=0; i<arr.length; i++){
            swapped = false;
            for(int j=1; j<arr.length-1;j++){
                if(arr[j]<arr[j-1]){
                    // swap the elements
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1]= temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
        return arr;
    }
}
