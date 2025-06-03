public class FIndGIvenStringIsPalindromeOrNot {

    public static void main(String[] args) {
        String input = "malayaiklam";
        System.out.println(isPalindrome(input));
    }

    static boolean isPalindrome(String input) {

        int left = 0, right = input.length() - 1;
        int duplicateCount = 0;

        while (left < right) {
            if (input.charAt(left) == input.charAt(right)) {
                left++;
                right--;
            }else if (input.charAt(left) == input.charAt(right-1)) {
                    duplicateCount++;
                    right--;
            }else if(input.charAt(left+1) == input.charAt(right)){
                    duplicateCount++;
                    left++;
            }
            System.out.println("bye");
        }

         if(duplicateCount == 1 || left == right)
            return true;
         else return false;
    }

}
