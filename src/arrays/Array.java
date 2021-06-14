package arrays;

import java.util.Arrays;

public class Array {
   public static void main(String[] args) throws Exception {

//      mergeOverLappingIntervals(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}});
   }

   private static void printPermutation(String str, String res) {
//      printPermutation("abc", "");
      if (str.length() == 0) {
         System.out.println(res);
      }
      for (int i = 0; i < str.length(); i++) {
         char ch = str.charAt(i);
         printPermutation(str.substring(0, i) + str.substring(i + 1), res + ch);
      }

   }

   private static void mergeOverLappingIntervals(int[][] arr) {

   }

   private static int kadaneAlgo(int[] arr) {
      if (arr.length == 0) {
         return -1;
      }
      int sum = arr[0], ans = arr[0];
      for (int idx = 1; idx < arr.length; idx++) {
         sum = Integer.max(sum + arr[idx], arr[idx]);
         ans = Integer.max(sum, ans);
      }
      return ans;
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
