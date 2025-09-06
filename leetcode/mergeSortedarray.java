
class mergeSortedarray {
      public static int[] merge(int[] nums1, int m, int[] nums2, int n) {

            int j = 0;
            for (int i = (nums1.length - n); i < m + n; i++) {
                  nums1[i] = nums2[j++];

            }
            // Arrays.sort(nums1);

            for (int i = 1; i < nums1.length - 1; i++) {
                  if (nums1[i] < nums1[i - 1]) {
                        nums1[i] = nums1[i - 1];
                  }

            }

            return nums1;

      }

      public static void main(String[] args) {
            int[] nums1 = { 1, 2, 3, 0, 0, 0 };
            int m = 3;
            int[] nums2 = { 2, 5, 6 };
            int n = 3;
            int[] ans = merge(nums1, m, nums2, n);
            for (int i : ans) {
                  System.out.println(i);
            }

      }
}
