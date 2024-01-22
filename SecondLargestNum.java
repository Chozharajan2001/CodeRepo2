// Input: arr[] = {12, 35, 1, 10, 34, 1}
// Output: The second largest element is 34.
// Explanation: The largest element of the array is 35 and the second largest element is 34

// Input: arr[] = {10, 5, 10}
// Output: The second largest element is 5.
// Explanation: The largest element of the array is 10 and the second largest element is 5
class SecondLargestNum{
    public static void main(String[] args){
        int[] arr1 = {12, 35, 1, 10, 34, 1};
        int[] arr2 = {10, 5, 10};
        largest2(arr1);
        largest2(arr2);
    }
    public static void largest2(int[] arr){
        //Arrays.sort(arr, Collections.reverseOrder());
        //or
        sortRev(arr);
        for(int i=0; i<arr.length; i++){
            if(arr[i+1]<arr[i]){
                System.out.println("\n"+arr[i+1]+" is the second largest number");
                return;
            }
        }
        System.out.println("\nthere is no second largest numbber."+arr[1]+" is the largest number.");
    }
    public static void sortRev(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i; j>0; j--){
                if(arr[j]>arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}
