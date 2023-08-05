package Easy;

import java.util.Arrays;

public class MergeSortedArray88 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = m, j = 0; j<m; j++){
            nums1[i] = nums2[j];
            i++;
        }
        Arrays.sort(nums1);
    }

}
