//to find the longest palindrome in the string
//using expansion from center
class LongestPalindrome{
    public static void main(String[] args){
        String str = "bala";
        palindrome(str);
    }
    public static void palindrome(String s){
        int low, hi, start, end;
        start = 0;
        end = 1;
        boolean flag = false;
        //To find palindrome in even length
        for(int i = 0; i<s.length(); i++){
            low = i-1;
            hi = i;
            while(low>=0 && hi<s.length() && s.charAt(low) == s.charAt(hi)){
                flag = true;
                if((hi-low+1)>end){
                    start = low;
                    end = hi-low+1;
                }
                low--;
                hi++;
            }
            //To find palindrome in odd length
            low = i-1;
            hi = i+1;
            while(low>=0 && hi<s.length() && s.charAt(low) == s.charAt(hi)){
                 flag = true;
                if((hi-low+1)>end){
                    start = low;
                    end = hi-low+1;
                }
                low--;
                hi++;
            }
        }
        
        String result = new String();
        //To print palindrome
        for(int i = start; i<=end && flag==true; i++){
            result = result+s.charAt(i);
        }
        System.out.println("The Longest Palindrome is: "+result+"\nlength:"+result.length());
    }
}
