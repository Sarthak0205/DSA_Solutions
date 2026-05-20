package strings;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        while(i<j){
            char c=s.charAt(i);
            char ch=s.charAt(j);
            if(Character.isLetterOrDigit(c) && Character.isLetterOrDigit(ch) ){
                if(Character.toLowerCase(c)==Character.toLowerCase(ch)){
                    i++;
                    j--;
                }
                else return false;
            }
            else if(!Character.isLetterOrDigit(c)){
                i++;

            }
            else if(!Character.isLetterOrDigit(ch)){
                j--;

            }
        }
        return true;
    }

    static void main() {
        String s="A man, a plan, a canal: Panama";
        if(isPalindrome(s)){
            System.out.println("Valid");
        }
        else System.out.println("Invalid");
    }
}
