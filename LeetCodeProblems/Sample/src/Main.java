

public class Main {
    public static void main(String[] args) {

        int[] n = {10,20,30,40,50,60,70,80};
        int result = 0;
        int length = n.length;
        System.out.println(n.length);

        result = n[length/2];

        System.out.println(result);

        String s = "0-1";
        s= s.trim();
        System.out.println(find(s));

        //System.out.println(s);
        System.out.println(Integer.MIN_VALUE);

       System.out.println(Character.isWhitespace('i'));
    }


    static  int find(String input) {
        Integer result = 0;
        System.out.println(4-'0');
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i); //-
             if (Character.isDigit(ch) && ch != '0' || !Character.isWhitespace(ch) && Character.isDigit(ch) )
                    result = result * 10 + Integer.valueOf(String.valueOf(ch));
             else{

                return result;
             }
        }
        if(input.charAt(0) == '-')
         return -result;
        else return result;
    }

///  214748364
///  2147483647

    ///  214748364
    ///  2147483648

}