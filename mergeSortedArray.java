import java.util.*;
class mergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=0; i<n; i++){
            nums1[m+i]=nums2[i];
        }
     Arrays.sort(nums1,0,m+n);
            
    
       for(int k=0; k<m+n; k++){
        System.out.println(nums1[k]);
       }
    }
}
