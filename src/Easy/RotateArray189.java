package Easy;

public class RotateArray189 {
    public void rotate(int[] nums, int k) {
        /*int [] temp = nums.clone();
        for(int i = 0; i < nums.length; i++){
            if(i >= (nums.length - k)){
                nums[i-(nums.length-k)] = temp[i];
            }
            else{
                nums[i+k] = temp[i];
            }
        }*/

        k %= nums.length;

    }

    public void reverse(int[] nums, int start, int end){

    }

}
