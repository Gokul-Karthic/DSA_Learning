import java.util.*;

public class xyz {
  // Simple sieve
  public static void simplesieve(int n) {
    boolean[] prime = new boolean[n + 1];
    for (int i = 0; i < prime.length; i++) {
      prime[i] = true;
    }
    for (int p = 2; p * p <= n; p++) {
      if (prime[p] == true) {
        for (int i = p * p; i <= n; i += p) {
          prime[i] = false;
        }
      }
    }
    for (int i = 2; i <= n; i++) {
      if (prime[i]) {
        System.out.println(i);
      }
    }

  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }
  // segmented sieve

  public static void segmentedsieve(int l, int h) {
    boolean[] prime = new boolean[h + 1];
    for (int i = 0; i <= h; i++) {
      prime[i] = true;
    }
    for (int p = 2; p * p <= h; p++) {
      if (prime[p]) {
        for (int i = p * p; i <= h; i += p) {
          prime[i] = false;
        }
      }
    }
    for (int i = l; i <= h; i++) {
      if (prime[i]) {
        System.out.println(i);
      }
    }
  }

  // gcd
  public static int gcd(int a, int b) {
    if (a == 0) {
      return b;
    }
    return gcd(b % a, a);
  }

  // binarypalindrome
  public static boolean binarypalindrome(int n) {
    String bnum = Integer.toBinaryString(n);
    int l = 0;
    int r = bnum.length() - 1;
    while (l < r) {
      if (bnum.charAt(l) == bnum.charAt(r)) {
        l++;
        r--;
      } else {
        return false;
      }
    }
    return true;
  }

  // toggle
  public static void toggleswitch(int n) {
    int count = 0;
    for (int i = 1; i * i <= n; i++) {
      count++;
      System.out.println(i * i);

    }
    System.out.println("total " + count);
  }

  // nibble
  public static byte nibble(byte n) {

    byte swap = (byte) (((n & 0x0F) << 4) | ((n & 0xF0) >> 4));
    return swap;
  }

  // Hourglass
  public static int hourglass(int[][] arr, int r, int c) {
    int max = 0;
    if (r < 3 || c < 3) {
      System.out.println("not possible");
      return 0;
    } else {
      for (int i = 0; i < r - 2; i++) {
        int sum = 0;
        for (int j = 0; j < c - 2; j++) {
          sum = (arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j] + arr[i + 2][j + 1]
              + arr[i + 2][j + 2]);

        }
        max = Math.max(sum, max);
      }
    }

    return max;
  }

  // Alice
  public static int Alice(int a) {
    int level = 0;
    int total = 0;
    while (total < a) {
      level++;
      total += 12 * level * level;
    }
    return 8 * level;
  }

  // Blockswap
  public static int[] blockswap(int[] arr, int k) {

    int n = arr.length;
    k = k % n;
    int[] ans = new int[n];
    int j = 0;
    for (int i = n - k; i < n; i++) {
      ans[j++] = arr[i];
    }
    for (int i = 0; i < n - k; i++) {
      ans[j++] = arr[i];
    }
    return ans;
  }

  // Majority
  public static void Majority(int[] arr) {
    int freq = 0;
    int ans = 0;
    for (int i = 0; i < arr.length; i++) {
      if (freq == 0) {
        freq = 1;
        ans = arr[i];
      } else if (arr[i] == ans) {
        freq++;

      } else {
        freq--;
      }
    }
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == ans) {
        count++;
      }
    }
    if (count > (arr.length / 2)) {
      System.out.println("majority element is- " + ans);
    } else {
      System.out.println("no majority element");
    }
  }

  // Leader
  public static void leader(int[] arr) {
    int max = arr[arr.length - 1];
    System.out.println(max);
    for (int i = arr.length - 2; i >= 0; i--) {
      if (arr[i] > max) {
        max = arr[i];
        System.out.println(max);
      }
    }
  }

  public static int maxprod(int[] arr) {
    int n = arr.length;
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < n; i++) {
      int prod = 1;
      for (int j = i; j < n; j++) {
        prod *= arr[j];
        max = Math.max(prod, max);
      }
    }
    return max;
  }

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

  // QUiCK Sort
  static int partition(int[] arr, int low, int high) {
    int pivot = arr[low];
    int i = low + 1;
    int j = high;
    while (true) {
      while (i <= j && arr[i] <= pivot) {
        i++;
      }
      while (i <= j && arr[j] > pivot) {
        j--;
      }
      if (i > j) {
        break;
      }
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
    }
    int temp = arr[low];
    arr[low] = arr[j];
    arr[j] = temp;
    return j;
  }

  static void quickSort(int[] arr, int low, int high) {
    if (low < high) {
      int pi = partition(arr, low, high);
      quickSort(arr, low, pi - 1);
      quickSort(arr, pi + 1, high);
    }
  }

  static int[] values = new int[26];

  public static void insertvalues() {
    values[0] = 1;
    int prev = 1;
    for (int i = 1; i < 26; i++) {
      values[i] = (i + i) * prev + prev;
      prev = values[i];
    }
  }

  static void formedString(List<Character> s, int k) {
    int low = 0;
    int high = 25;
    while (k != 0) {
      int ind = findfloor(k, low, high);
      s.add((char) (ind + 'A'));
      k = k - values[ind];
    }
    for (int i = s.size() - 1; i >= 0; i--) {
      System.out.print(s.get(i));
    }
  }

  static int findfloor(int k , int low,int high){
    int ans =-1;
    while(low<high)
  }

  public static void main(String[] args) {

    // int[] arr = { 10, 7, 8, 9, 1, 5 };
    // int n = arr.length;

    // quickSort(arr, 0, n - 1);

    // System.out.println("Sorted array:");
    // for (int num : arr) {
    // System.out.print(num + " ");
    // }
    insertvalues();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    List<Character> s = new ArrayList<>();
    formedString(s, n);

    // simplesieve(100);
    // segmentedsieve(10, 20);
    // System.out.println(gcd(12,48));
    // System.out.println(binarypalindrome(4));
    // byte byteValue = (byte) 0xAB; // 1010 1011 in binary
    // byte swappedByte = nibble(byteValue);
    // System.out.println("Original byte: " + Integer.toBinaryString(byteValue &
    // 0xFF));
    // System.out.println("Swapped byte: " + Integer.toBinaryString(swappedByte &
    // 0xFF));
    // int [][]mat = new int[4][4];
    // for (int i = 0; i < 4; i++) {
    // for (int j = 0; j < 4; j++) {
    // mat[i][j]= sc.nextInt();
    // }
    // }
    // int res = hourglass(mat,4,4);
    // System.out.println("Maximum sum of hour glass = "+ res);
    // }
    // System.out.println(Alice(1000000000));
    // int[] arr = {1, 2, 3, 4, 5};
    // int[]an = blockswap(arr,2);
    // print(an);
    // int[] arr = {2,2,1,1,1,2,2};
    // Majority(arr);
    // int [] arr ={14,20,3,6,5};
    // leader(arr);
    // toggleswitch(10);
    // int[] arr = {4,3,4,1,2};

    // int ans = maxprod(arr);
    // System.out.println(ans);
    // int[] arr = { 1, 1, 1 };
    // System.out.println(longestSubarray(arr));

  }
}
