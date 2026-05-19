package arrays;

public class MoveZeros {
        public static void moveZeroes(int[] nums) {
            int i=0,j=0;
            while(j<nums.length){
                if(nums[j]==0){
                    j++;
                    continue;
                }
                if(nums[j]!=0){
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                    j++;
                    i++;
                }
            }
        }

    static void main() {
        int[] nums={0,1,0,3,12};
        moveZeroes(nums);
    }
    }
