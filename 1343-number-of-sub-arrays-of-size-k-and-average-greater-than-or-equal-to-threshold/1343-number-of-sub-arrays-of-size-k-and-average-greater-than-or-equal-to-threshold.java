class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int currentSum = 0, count = 0;
        for (int i = 0; i < k; i++) {
            currentSum += arr[i];
        }
        if (currentSum >= (threshold * k)) {
            count++;
        }
        for (int i = k; i < arr.length; i++) {
            currentSum += arr[i] - arr[i - k];
            if (currentSum >= (threshold * k)) {
                count++;
            }
        }
        return count;
    }
}