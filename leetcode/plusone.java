package leetcode;

public class plusone {
      public static int[] plusone(int[] arr) {
            int n = arr.length;
            int k = arr[n - 1];
            if (k < 9) {
                  arr[n - 1] += 1;

            } else {
                  for (int i = arr.length - 1; i <= 0; i++) {
                        if (arr[i] == 9) {
                              arr[i] = 0;
                              arr[i - 1] += 1;
                        }
                  }
            }
            return arr;
      }

      public static void main(String[] args) {
            int arr[] = { 1, 0, 9 };
            int[] ans = plusone(arr);
            for (int i : ans) {
                  System.out.println(i);
            }

      }
}
