package arrays;

public class Palindrome {
    static boolean isPalindrome(int num){
        if(num <0){
            return false;
        }

        else {
            int rev=reverseNumber(num);
            return num == rev;
        }
    }
    static int reverseNumber(int num) {
        int rev=0;
        while(num>0){
            int d=num%10;
            rev=(rev*10)+d;
            num=num/10;
        }
        return rev;
    }
    static void main() {
        int n=121;
        System.out.println("The Palindromes are "+ isPalindrome(n));
//        System.out.println(rev);
    }
}
