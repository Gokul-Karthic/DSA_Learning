package Learning;

import java.util.Scanner;

class sumbetwenindexprefix {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter size - ");
            int n = sc.nextInt();
            // Array input
            int[] arr = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                  arr[i] = sc.nextInt();
            }
            // Prefix Array
            for (int i = 1; i <= n; i++) {
                  arr[i] = arr[i] + arr[i - 1];
            }
            System.out.println("enter start and end- ");
            int start = sc.nextInt();
            int end = sc.nextInt();
            int sum = arr[end] - arr[start - 1];
            System.out.println("sum- " + sum);

      }
}