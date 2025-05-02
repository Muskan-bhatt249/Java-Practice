class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;
    }

    
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums = {1, 1, 2, 3, 3};
        int[] expectedNums = {1, 2, 3};

        int k = sol.removeDuplicates(nums); 

        assert k == expectedNums.length : "Length mismatch";

        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i] : "Mismatch at index " + i;
        }

        System.out.println("All assertions passed. Unique elements: " + k);
    }
}
