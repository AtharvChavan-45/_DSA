import java.util.*;

public class TwoSum {

    int[] solution(ArrayList<Integer> arr, int target){
        for(int i = 0;i<arr.size();i++){
            for(int j = i+1;j<arr.size();j++){
                if(arr.get(i)+arr.get(j)==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TwoSum obj = new TwoSum();
        ArrayList<Integer> arr = new ArrayList<>();
        
        while(true){
            int num = sc.nextInt();

            if(num == -1){
                break;
            }
            arr.add(num);
        }
        int target = sc.nextInt();
        int[] ans= obj.solution(arr,target);
        System.out.println(Arrays.toString(ans));
        
        // System.out.println(arr);
        /*
        for(int i:arr){
            System.out.println(i);
        }
        */
    }
}

/*
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            map.put(nums[i], i);
        }

        return new int[] {}; // Should never reach here if input always has one solution
    }
}
*/

/* by using two pointer
import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[][] arr = new int[nums.length][2];

        for (int i = 0; i < nums.length; i++) {
            arr[i][0] = nums[i]; // value
            arr[i][1] = i;       // original index
        }

        Arrays.sort(arr, (a, b) -> a[0] - b[0]);

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {

            int sum = arr[left][0] + arr[right][0];

            if (sum == target) {
                return new int[]{arr[left][1], arr[right][1]};
            }
            else if (sum < target) {
                left++;
            }
            else {
                right--;
            }
        }

        return new int[]{-1, -1};
    }
}import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[][] arr = new int[nums.length][2];

        for (int i = 0; i < nums.length; i++) {
            arr[i][0] = nums[i]; // value
            arr[i][1] = i;       // original index
        }

        Arrays.sort(arr, (a, b) -> a[0] - b[0]);

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {

            int sum = arr[left][0] + arr[right][0];

            if (sum == target) {
                return new int[]{arr[left][1], arr[right][1]};
            }
            else if (sum < target) {
                left++;
            }
            else {
                right--;
            }
        }

        return new int[]{-1, -1};
    }
}
*/