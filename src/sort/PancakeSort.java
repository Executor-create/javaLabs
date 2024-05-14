package src.sort;

public class PancakeSort {
  static void flip(int[] arr, int i) {
    int temp, start = 0;
    while (start < i) {
      temp = arr[start];
      arr[start] = arr[i];
      arr[i] = temp;
      start++;
      i--;
    }
  }

  static int findMax(int[] arr, int n) {
    int mi, i;
    for (mi = 0, i = 0; i < n; ++i)
      if (arr[i] > arr[mi])
        mi = i;
    return mi;
  }

  static void pancakeSort(int[] arr, int n) {
    for (int curr_size = n; curr_size > 1; --curr_size) {
      int mi = findMax(arr, curr_size);
      if (mi != curr_size - 1) {
        flip(arr, mi);
        flip(arr, curr_size - 1);
      }
    }
  }

  public static void main(String[] args) {
    int[] arr = { 23, 10, 20, 11, 12, 6, 7 };
    int n = arr.length;
    System.out.println("Original Array: ");
    for (int i : arr) {
      System.out.print(i + " ");
    }
    System.out.println();

    pancakeSort(arr, n);

    System.out.println("Sorted Array: ");
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }
}
