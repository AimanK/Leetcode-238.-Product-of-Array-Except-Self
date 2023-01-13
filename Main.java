import java.util.*;

class Main {
  public static void main(String[] args) {

    /**

        Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.

        Input: nums = [1,1,1,2,2,3], k = 2
        Output: [1,2]

**/
    
    int[] nums = {1,2,3,4};

    System.out.println(Arrays.toString(productExceptSelf(nums)));


    /**

      SOLUTION:
        - int n = nums.length;
        - Create 3 int[] arrays, one for the left, one for the right, and one for the answer.
        - Create a for loop, where above the loop, left[0] = 1, that loop will be set to iterate from the second index through to n, within the loop, left[i] = nums[i-1] * left[i-1];
        - Create another for loop, where above the loop, right[n-1] = 1, that for loop will be set to iterate from the second to last index, through to index 0, within the loop, right[i] = nums[i+1] * right[i+1];
        - Create another for loop iterating from index 0 to n traditionally, within that for loop, answer[i] = left[i] * right[i];
        - return answer

    **/

    
  }





  public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int[] answer = new int[n];

        left[0] = 1;
        for (int i = 1; i < n; i++)
        {
            left[i] = nums[i-1] * left[i-1];
        }

        right[n-1] = 1;
        for (int i = n-2; i >= 0; i--)
        {
            right[i] = nums[i+1] * right[i+1];
        }


        for (int i = 0; i < n; i++)
        {
            answer[i] = left[i] * right[i];
        }


        return answer;
    }
}