class SumOfSquares{
    public static void main(String[] args) throws Exception{
        int[] nums = {2,4,6,8,12,14,10000000};
        System.out.println(Integer.toString(sumEven(nums)));
    }
    private static int sumEven(int[] nums){
        int sum = 0;
        for(int i =0; i < nums.length;i++){
            if(nums[i] % 2 ==0 ){
                sum += (nums[i] * nums[i]);
            }
        }
        return sum;
    }
}