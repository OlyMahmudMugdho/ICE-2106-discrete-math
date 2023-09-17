public class Problem1B {
    public static void main(String[] args) {
        int[] nums = new int[4];
        for (int i=0; i<4; i++) {
            nums[i] = i+1;
        }
        for(int i=0; i<nums.length; i++) {
            for (int j=0 ; j < nums.length; j++) {
                if (nums[i] <= nums[j]) {
                    System.out.print("(" + nums[i] + "," + nums[j] + ") ");
                }
            }
        }
    }
}
