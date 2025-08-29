
import java.util.Scanner;

public class patternPrinting {
      public static void rectangle(int r, int c) {
            for (int i = 0; i < r; i++) {
                  for (int j = 0; j < c; j++) {
                        System.out.print("*");
                  }
                  System.out.println();
            }
      }

      public static void rectangleHole(int r, int c) {
            for (int i = 0; i < r; i++) {

                  for (int j = 0; j < c; j++) {
                        if (i == 0 || i == r - 1 || j == 0 || j == c - 1) {
                              System.out.print("*");
                        } else {
                              System.out.print(" ");
                        }

                  }
                  System.out.println(" ");

            }

      }

      public static void triangle(int h) {

            for (int i = 1; i <= h; i++) {

                  for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                  }
                  System.out.println();
            }
      }

      public static void revTriangle(int h) {
            for (int i = h; i >= 1; i--) {
                  for (int j = i; j >= 1; j--) {
                        System.out.print("*");
                  }
                  System.out.println();
            }
      }

      public static void equilateral(int h) {
            for (int i = 1; i <= h; i++) {
                  for (int j = 1; j <= h - i; j++) {
                        System.out.print(" ");
                  }
                  for (int k = 1; k <= (2 * i - 1); k++) {
                        System.out.print("*");

                  }
                  System.out.println();

            }
      }

      public static void NumericRect(int n) {

            for (int i = 0; i < n; i++) {
                  int k = i;
                  for (int j = 1; j <= n; j++) {
                        System.out.print((k % n) + 1 + " ");
                        k++;
                  }
                  System.out.println();
            }
      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int r = sc.nextInt();
            // int c = sc.nextInt();
            // rectangle(r, c);
            // rectangleHole(r, c);
            // triangle(r);
            // revTriangle(r);
            // equilateral(r);
            NumericRect(r);
      }
}
