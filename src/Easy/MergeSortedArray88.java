package Easy;

import java.util.Arrays;

public class MergeSortedArray88 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = 0; i<m; i++){
            nums1[i+m] = nums2[i];
        }
        Arrays.sort(nums1);
    }

    public static void main(String[] args) {
        int [] nums1 =  {1,2,3,0,0,0};
        int [] nums2 = {2,5,6};

        int m = 3;
        int n = 3;

        MergeSortedArray88 ms = new MergeSortedArray88();
        ms.merge(nums1,m,nums2,n);

        System.out.println(Arrays.toString(nums1));
    }

}
