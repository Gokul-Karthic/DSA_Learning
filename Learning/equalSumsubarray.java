package Learning;

public class equalSumsubarray {
  public static void main(String[] args) {
    int[] arr = { -7, 1, 5, -4, 3, 0 };
    int n = arr.length;
    int[] prefix = new int[n];
    int[] suffix = new int[n];
    prefix[0] = arr[0];
    suffix[n - 1] = arr[n - 1];
    for (int i = 1; i < n; i++) {
      prefix[i] = prefix[i - 1] + arr[i];
    }
    for (int i = n - 2; i >= 0; i--) {
      suffix[i] = suffix[i + 1] + arr[i];
    }
    int j = arr.length - 1;
    for (int i = 0; i < n - 1; i++) {
      if (prefix[i] == suffix[j--]) {
        System.out.println("yes");
        System.out.println(i + 1);
        return;
      }
    }
    System.out.println("no");
  }
}
