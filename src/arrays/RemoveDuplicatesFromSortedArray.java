package arrays;

//import java.util.ArrayList;
//import java.util.List;

public class RemoveDuplicatesFromSortedArray {
    //Brute Force
    // Time Complexity: O(n²) because res.contains(lastEle) scans the list every time.
    //Space Complexity: O(n) because of the extra ArrayList.s
//    public static int removeDuplicates(int[] nums) {
//        List<Integer> res=new ArrayList<>();
//        int lastEle;
//        for (int i = 0; i < nums.length; i++) {
//            lastEle=nums[i];
//            if(res.isEmpty()){
//                res.add(lastEle);
//            }
//            if(!res.contains(lastEle)){
//                res.add(lastEle);
//            };
//
//        }
//        for (int i = 0; i < res.size(); i++) {
//            nums[i]= res.get(i);
//        }
//
//        return res.size();
//    }

//Optimised Solution Time Complexity: O(n) Space Complexity: O(1)
    public static int removeDuplicates(int[] nums){
        int i=0;
        int j=0;
        while(i<nums.length){
            if(nums[i]!=nums[j]){
                j++;
                nums[j]=nums[i];
            }
            i++;
        }
        return j+1;
    }
    static void main() {
        int [] nums={0,0,1,1,1,2,2,3,3,4};
        int size=removeDuplicates(nums);
        System.out.println(size);
    }
}
