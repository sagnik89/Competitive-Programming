package programs;

public class palindrome {
    public static boolean isPalindrome(int x) {

        int pop, res = 0, d;

        d = x;

        while (d > 0) {
            pop = d % 10;
            res = (res * 10) + pop;
            d /= 10;
        }

        return (res == x) ? true : false;
    }
    public static void main(String[] args) {
        
        int n = 1331;
        
        boolean res = isPalindrome(n);

        System.out.println(res);

    }
}
