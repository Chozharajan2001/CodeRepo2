/*Given an array arr[] of non-negative integers and an integer sum, find a subarray that adds to a given sum.

Note: There may be more than one subarray with sum as the given sum, print first such subarray. 

Examples: 

Input: arr[] = {1, 4, 20, 3, 10, 5}, sum = 33
Output: Sum found between indexes 2 and 4
Explanation: Sum of elements between indices 2 and 4 is 20 + 3 + 10 = 33*/

class SubarraySum2{
    public static void main(String[] args){
        int arr[]={1,4,20,3,10,5};
        int sum = 33;
        find(arr, sum);
    }
    public static void find(int[] a, int sum){
        int current = a[0];
        int start = 0;
        for(int i=0; i<a.length; i++){
            
            while(current>sum && start<i){
                current = current-a[start];
                start++;
            }
            
            if(current == sum){
                int end = i;
                System.out.println("Sum found between "+start+" and "+end);
                return;
            }
            
            current = current+a[i+1];
            
            
        }
        System.out.println("no sub array found");
    }
}
