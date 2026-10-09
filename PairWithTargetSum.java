import java.util.Scanner;
class PairWithTargetSum{
    boolean tf;
    public void hasPairWithSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            if(nums[i]==target) {
                    tf = true;
                    return;
            } else {
                tf = false;
            } 
        }
    }
    public static void main(String[] args){
        Scanner s1=new Scanner(System.in);
        int[] nums = new int[5];
        for(int i = 0; i < 5; i++) {
            nums[i] = s1.nextInt();
        }
        int target = s1.nextInt();
        PairWithTargetSum pair = new PairWithTargetSum();
        pair.hasPairWithSum(nums, target);
        System.out.println(pair.tf);
    }
}