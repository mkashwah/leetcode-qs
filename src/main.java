import java.util.Arrays;

public class main {


    public static void main(String[] args) {
        twoSum tryTwoSum = new twoSum();
        System.out.println("test");
        int[] testCase = {2,11,7,15};
        int target = 9;
        int[] ans = tryTwoSum.twoSum(testCase, target);
        System.out.println(Arrays.toString(ans));
    }
}
