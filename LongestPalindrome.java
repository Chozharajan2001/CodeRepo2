//to find the longest palindrome in the string
class LongestPalindrome{
    public static void main(String[] args){
        String str = "bala";
        palindrome(str);
    }
    public static void palindrome(String s){
        int start , max_len;
        start = 0;
        max_len = 1;
        for(int i = 0; i<s.length(); i++){
            for(int j = i; j<s.length(); j++){
                boolean flag = true;
                
                for(int k = 0; k<(j-i+1)/2; k++){
                    if(s.charAt(i+k) != s.charAt(j-k)){
                        flag = false;
                    }
                }
                
                if(flag == true && (j-i+1)>max_len){
                    start = i;
                    max_len = j-i+1;
                }
            }
        }
        String result = new String();
        //To print palindrome
        for(int i = start; i<=start+max_len-1; i++){
            result = result+s.charAt(i);
        }
        System.out.println("The Longest Palindrome is: "+result+"\nlength:"+result.length());
    }
}
