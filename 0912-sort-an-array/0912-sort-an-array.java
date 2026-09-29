class Solution {
    public int[] sortArray(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return nums;
        }
        int[] aux = new int[nums.length];
        mergeSort(nums, aux, 0, nums.length - 1);
        return nums;
    }

    private void mergeSort(int[] nums, int[] aux, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = left + (right - left) / 2;
        mergeSort(nums, aux, left, mid);
        mergeSort(nums, aux, mid + 1, right);
        merge(nums, aux, left, mid, right);
    }

    private void merge(int[] nums, int[] aux, int left, int mid, int right) {
        for (int i = left; i <= right; i++) {
            aux[i] = nums[i];
        }

        int i = left;     
        int j = mid + 1;  
        int k = left;    

        while (i <= mid && j <= right) {
            if (aux[i] <= aux[j]) {
                nums[k++] = aux[i++];
            } else {
                nums[k++] = aux[j++];
            }
        }

        while (i <= mid) {
            nums[k++] = aux[i++];
        }
    }
}   