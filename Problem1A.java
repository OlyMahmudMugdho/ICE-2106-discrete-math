public class Problem1A {
    public static void main(String[] args) {
        int[] nums = new int[4];
        for (int i=0 ; i<4; i++){
            nums[i] = i+1;
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++){

                if((nums[j]%nums[i]) ==0 ) {
                    System.out.print("(" + nums[i] + "," + nums[j] + ") ");
                }

            }
        }

    }
}