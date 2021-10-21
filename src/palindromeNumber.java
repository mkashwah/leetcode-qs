/*
        9 - Palindrome numbers

        Given an integer x, return true if x is palindrome integer.

        An integer is a palindrome when it reads the same backward as forward. For example, 121 is palindrome while 123 is not.

        -121 is not palindrome because it reads 121- backwards

        **try solving it without turning the number to a string
*/
public class palindromeNumber {
    public boolean isPalindrome(int x){
        int answer = 0;
        int x_cpy = x;
        if(x < 0){
            return false;
        }else{
            while(x_cpy > 0){
                answer = answer * 10 + (x_cpy%10);
                x_cpy = (x_cpy - (x_cpy%10))/10;
            }

        }
        if(answer == x){
            return true;
        } else{
            return false;
        }
    }

}
