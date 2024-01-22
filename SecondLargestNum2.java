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
        int big1, big2;
        big1 = big2 = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>big1){
                big2 = big1;
                big1 = arr[i];
            }
            else if(arr[i]>big2 && arr[i]!=big1){
                big2 = arr[i];
            }
        }
        if(big2 == Integer.MIN_VALUE){
            System.out.println("there is no second largest element");
        }
        else{
            System.out.println("\n the second largest number is "+big2);
        }
    }
   
}
