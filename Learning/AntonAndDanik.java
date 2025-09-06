import java.util.Scanner;

public class AntonAndDanik {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            String name = sc.next();
            int A = 0, D = 0;

            for (int i = 0; i < n; i++) {
                  if (name.charAt(i) == 'A') {
                        A++;
                  } else {
                        D++;
                  }
            }

            if (A > D) {
                  System.out.println("Anton");
            } else if (D > A) {
                  System.out.println("Danik");
            } else {
                  System.out.println("Friendship");
            }
      }
}
