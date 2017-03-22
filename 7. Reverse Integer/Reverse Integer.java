public class Solution {
    public int reverse(int x) {
        int result=0;
        int s=x;
        while(s!=0){
            int temp=s%10;
            int newResult=result*10+temp;
            if((newResult-temp)/10!=result) return 0;
            result=newResult;
            s/=10;
        }
        return result;
    }
}
