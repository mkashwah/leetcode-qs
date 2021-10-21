import java.util.Arrays;

public class main {


    public static void main(String[] args) {
//        twoSum tryTwoSum = new twoSum();
//        System.out.println("test");
//        int[] testCase = {2,11,7,15};
//        int target = 9;
//        int[] ans = tryTwoSum.twoSum(testCase, target);
//        System.out.println(Arrays.toString(ans));

//        reverseNumber rn = new reverseNumber();
//        System.out.println(rn.revNumber(1552));

        //palindromeNumber(int x) test
        palindromeNumber pN = new palindromeNumber();

        System.out.println(pN.isPalindrome(1551));      //should return true
        System.out.println(pN.isPalindrome(9));         //should return true
        System.out.println(pN.isPalindrome(123));       //should return false
        System.out.println(pN.isPalindrome(-121));      //should return false


    }
}
