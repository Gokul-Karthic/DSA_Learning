
import java.util.Scanner;

public class BearAndBigBrother {
      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int limank = sc.nextInt();
            int bob = sc.nextInt();
            int years = 0;
            while (limank <= bob) {
                  years++;
                  limank *= 3;
                  bob *= 2;
            }
            System.out.println(years);
      }
}
