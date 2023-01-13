HINT:
- Create 3 int[] arrays, one for left, right, and answer, respectively.
- The technique to solve this problem involves calulating all the products to the in one direction, for example, for the left array, the products to the left of the index of left[i] = are calculated by nums[i-1] * left[i-1],
apply this principle to the right array as well, but in the opposite direction.
- Lastly, the answer array is filled by calculating the products as answer[i] = left[i] * right[i];
 


SOLUTION:
- int n = nums.length;
- Create 3 int[] arrays, one for the left, one for the right, and one for the answer.
- Create a for loop, where above the loop, left[0] = 1, that loop will be set to iterate from the second index through to n, within the loop, left[i] = nums[i-1] * left[i-1];
- Create another for loop, where above the loop, right[n-1] = 1, that for loop will be set to iterate from the second to last index, through to index 0, within the loop, right[i] = nums[i+1] * right[i+1];
- Create another for loop iterating from index 0 to n traditionally, within that for loop, answer[i] = left[i] * right[i];
- return answer
