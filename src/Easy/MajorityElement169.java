package Easy;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement169 {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int ret = 0;
        for(int num : nums){
            if(!map.containsKey(num)){
                map.put(num,1);
            }
            else{
                map.put(num, map.get(num)+1);
            }
            if(map.get(num) > nums.length/2){
                ret = num;
                break;
            }
        }
        return ret;
    }
}
