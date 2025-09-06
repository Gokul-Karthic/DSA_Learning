package Learning;

public class sliddingWindow {
      public static int naive(int[] arr, int k) {
            int maxsum = Integer.MIN_VALUE;
            for (int i = 0; i < arr.length - k; i++) {
                  int sum = 0;
                  for (int j = i; j < i + k; j++) {
                        sum += arr[j];
                        maxsum = Math.max(maxsum, sum);
                  }
            }
            return maxsum;

      }

      public static int FixedWindow(int[] arr, int k) {
            int max = Integer.MIN_VALUE;
            int n = arr.length - 1;
            int sum = 0;
            int i = 0;
            int j = 0;
            int[] ans = new int[arr.length];
            while (j < n) {
                  sum += arr[j];
                  if ((j - i + 1) < k) {
                        j++;

                  } else if (j - i + 1 == k) {
                        max = Math.max(max, sum);
                        sum -= arr[i];
                        j++;
                        i++;

                  }
            }

            return max;

      }

      public static void main(String[] args) {
            int[] arr = { -2, -3, 1, 4, -5 };
            int k = 3;

            System.out.println(FixedWindow(arr, k));
      }
}
