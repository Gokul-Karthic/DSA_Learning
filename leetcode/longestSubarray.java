import java.util.ArrayList;

class longestSubarray {
      public static int longestSubarray(int[] nums) {
            int curr = 0;
            int prev = 0;
            int max = 0;
            for (int i : nums) {
                  if (i == 1) {
                        curr++;
                  } else {
                        max = Math.max(max, prev + curr);
                        prev = curr;
                        curr = 0;
                  }
            }
            max = Math.max(max, prev + curr);
            if (max == nums.length) {
                  return max - 1;
            }
            return max;

      }

      public static int duplicate(int[] arr, int k) {

            ArrayList<Integer> ans = new ArrayList<>();

            for (int i = 0; i < arr.length; i++) {
                  if (arr[i] != k) {
                        ans.add(arr[i]);

                  }

            }
            int n = ans.size();
            return n;
      }

      public static void main(String[] args) {
            int[] arr = { 3, 2, 2, 3 };
            System.out.println(duplicate(arr, 3));
      }
}