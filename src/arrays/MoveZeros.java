package arrays;

public class MoveZeros {
        public void moveZeroes(int[] nums) {
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
    }
