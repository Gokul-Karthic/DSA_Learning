
public class palindromeNumber {
      public static boolean pn(int n) {
            String s = Integer.toString(n);
            int l = 0;
            int r = s.length() - 1;
            while (l < r) {
                  if (s.charAt(l) == s.charAt(r)) {
                        l++;
                        r--;

                  } else {
                        return false;
                  }
            }
            return true;

      }

      public static void main(String[] args) {
            boolean ans = pn(122);
            System.out.println(ans);
      }

}
