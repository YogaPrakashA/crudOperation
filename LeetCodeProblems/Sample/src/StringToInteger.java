public class StringToInteger {
    public static void main(String[] args) {
        String number = "10";
        System.out.println( );
        System.out.println(myAtoi("42"));              // 42
        System.out.println(myAtoi("   -42"));          // -42
        System.out.println(myAtoi("4193 with words")); // 4193
        System.out.println(myAtoi("words and 987"));   // 0
        System.out.println(myAtoi("-91283472332"));
    }

    public static int myAtoi(String s) {
        if (s == null || s.isEmpty()) return 0;

        int i = 0, sign = 1, result = 0;
        int n = s.length();

        // 1. Skip leading whitespaces
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // 2. Handle sign
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // 3. Convert digits to integer
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            // 4. Handle overflow
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            i++;
        }

        return result * sign;
    }
}
