/**
 * Created by Dave on 1/20/17.
 */

class ReverseInteger {
    public static void main(String[] args) {
        int x = 123456789;
        String s = "abcdefhijklm";
        reverseInt(x);
        System.out.println();
        reverseString(s);
    }

    private static void reverseInt(int n) {
        if (n != 0) {
            System.out.print(n % 10);
            n = n /10;
            reverseInt(n);
        }
    }

    private static void reverseString(String s) {
        if (s.length() == 1) {
            System.out.print(s);
        }

        else {
            System.out.print(s.substring(s.length() - 1));
            s = s.substring(0, s.length() - 1);
            reverseString(s);
        }

    }
}
