package arrays;

import java.util.Arrays;

public class Array {
   public static void main(String[] args) {
      sortArrayZeroOneTwo(new int[]{1, 2, 0});
   }

   // dutch national flag algo to solve it
   private static void sortArrayZeroOneTwo(int[] arr) {
//      sortArrayZeroOneTwo(new int[]{2, 0, 2, 1, 1, 0});
      int length = arr.length;
      int low = 0, mid = 0, high = length - 1;
      while (mid <= high) {
         if (arr[mid] == 0) {
            int temp = arr[low];
            arr[low] = arr[mid];
            arr[mid] = temp;
            low += 1;
            mid += 1;
         } else if (arr[mid] == 2) {
            int temp = arr[high];
            arr[high] = arr[mid];
            arr[mid] = temp;
            high--;
         } else if (arr[mid] == 1) {
            mid += 1;
         }
      }
      System.out.println(Arrays.toString(arr));
   }
}
