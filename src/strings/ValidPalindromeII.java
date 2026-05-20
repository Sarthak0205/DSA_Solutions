package strings;

public class ValidPalindromeII {
        public static boolean validPalindrome(String s) {
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
                    else return isSubStringPalindrome(s,i+1,j) || isSubStringPalindrome(s,i,j-1);
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
        public static boolean isSubStringPalindrome(String s,int i,int j){

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
            String s="abc";
            if(validPalindrome(s)){
                System.out.println("Valid");
            }
            else System.out.println("Invalid");
        }
    }

