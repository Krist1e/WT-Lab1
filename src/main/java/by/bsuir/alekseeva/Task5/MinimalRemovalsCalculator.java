package main.java.by.bsuir.alekseeva.Task5;

public class MinimalRemovalsCalculator {
    private MinimalRemovalsCalculator() {
    }

    public static int minRemovals(int[] array) {
        int n = array.length;
        if (n <= 1) {
            return 0;
        }

        int[] dp = new int[n];

        initializeDpArray(dp, n);

        int maxIncreasingSeq = 0;

        for (int k : array) {
            int j = binarySearch(dp, k);
            dp[j] = k;
            maxIncreasingSeq = Math.max(maxIncreasingSeq, j + 1);
        }

        return n - maxIncreasingSeq;
    }

    private static void initializeDpArray(int[] dp, int n) {
        for (int i = 0; i < n; ++i)
            dp[i] = Integer.MAX_VALUE;
    }

    private static int binarySearch(int[] dp, int element) {
        int left = 0;
        int right = dp.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (dp[mid] < element) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}
