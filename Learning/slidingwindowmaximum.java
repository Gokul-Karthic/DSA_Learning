package Learning;

class slidingwindowmaximum {
      public int[] maxSlidingWindow(int[] arr, int k) {
            int n = arr.length - 1;
            int max = 0;
            int sum = 0;
            int[] ans = new int[n - k + 1];
            int i = 0;
            int j = 0;
            while (j < n) {
                  sum += arr[j];
                  if (j - i + 1 < k) {
                        k++;
                  } else if (j - i + 1 == k) {
                        max = Math.max(sum, max);
                        sum -= arr[i];
                        i++;
                        j++;
                  }

            }
            return ans;
      }
}