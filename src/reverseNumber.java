public class reverseNumber {
    public int revNumber(int x){
        int answer = 0;
        int i = 0;
        while(x > 0){
            answer = answer * 10 + (x%10);
            x = (x - (x%10))/10;
        }
        return answer;
    }
}
