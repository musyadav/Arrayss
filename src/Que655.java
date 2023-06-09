import java.util.Arrays;

public class Que655 {
    public static void main(String[] args) {
        int[] nums = {4,-2,-5,-9,21,45,-36,-34,15,-28,94};
        int temp[] = new int[nums.length];
        int k = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]<0)
                temp[k++] = nums[i];
        }
        for (int i=0; i <nums.length; i++){
            if(nums[i]>0)
                temp[k++] = nums[i];
        }
        nums=temp;
        System.out.println(Arrays.toString(nums));
    }
}
