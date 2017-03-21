public class Solution {
    public boolean isPalindrome(int x) {
        int num=x;
        if(num<0){
            return false;
        }
        String s=""+x;
        int str=0;
        int end=s.length()-1;
        while(str<end){
            char str_s=s.charAt(str);
            char end_s=s.charAt(end);
            if(str_s!=end_s){
                return false;
            }
            str++;
            end--;
        }
        return true;
    }
}
