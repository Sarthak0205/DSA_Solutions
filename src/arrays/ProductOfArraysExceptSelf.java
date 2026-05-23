package arrays;
//import java.util.Arrays;

public class ProductOfArraysExceptSelf {
    //Brute Force  Time Complexity : O(n^2) Space Complexity : O(n)
//    public static int[] productExceptSelf(int[] nums) {
//        int res[]=new int[nums.length];
//        Arrays.fill(res,1);
//        for(int i=0;i<nums.length;i++){
//            for(int j=0;j<nums.length;j++){
//                if(i==j){
//                    continue;
//                }
//                else{
//                    res[i]=res[i]*nums[j];
//                }
//            }
//        }
//        return res;
//    }

//Optimized Solution Time Complexity : O(n) Space Complexity : O(1) due to proper use of res[]
    public static int[] productExceptSelf(int[] nums) {
        int leftProduct=1;
        int rightProduct=1;
        int[] res=new int[nums.length];
        //left pass
        for(int i=0;i<nums.length;i++){
            res[i]=leftProduct;
            leftProduct=nums[i]*leftProduct;
        }
        //right pass
        for(int i=nums.length-1;i>=0;i--){
            res[i]*=rightProduct;
            rightProduct*=nums[i];
        }
        return res;
    }
    static void main() {
        int[] nums ={1,2,3,4};
        int[] res ;
        res=productExceptSelf(nums);
        for (int re : res) {
            System.out.println(re);
        }
    }
}
