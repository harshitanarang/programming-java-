public class majority_Element {

    public static void main(String[] args) {
        int[] nums = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        int majorityElement = findMajorityElement(nums);
        
        System.out.println("Majority Element: " + majorityElement);
    }

    public static int findMajorityElement(int[] nums) {
        int candidate = nums[0];
        int count = 1;

        // Moore's Voting Algorithm
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == candidate) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    candidate = nums[i];
                    count = 1;
                }
            }
        }

        // Verify if the candidate is the majority element
        count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }

        if (count > nums.length / 2) {
            return candidate;
        } else {
            throw new IllegalArgumentException("No majority element found");
        }
    }
}
