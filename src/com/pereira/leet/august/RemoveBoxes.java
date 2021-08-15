package com.pereira.leet.august;

/**
 * You are given several boxes with different colors represented by different positive numbers.
 * You may experience several rounds to remove boxes until there is no box left. Each time you can choose some continuous boxes with the same color (i.e., composed of k boxes, k >= 1), remove them and get k * k points.
 * Return the maximum points you can get.
 * <pre>
 *     Example 1:
 *
 * Input: boxes = [1,3,2,2,2,3,4,3,1]
 * Output: 23
 * Explanation:
 * [1, 3, 2, 2, 2, 3, 4, 3, 1]
 * ----> [1, 3, 3, 4, 3, 1] (3*3=9 points)
 * ----> [1, 3, 3, 3, 1] (1*1=1 points)
 * ----> [1, 1] (3*3=9 points)
 * ----> [] (2*2=4 points)
 * </pre>
 */
public class RemoveBoxes {
    int[][][] memo;
    public int removeBoxes(int[] boxes) {
        int n = boxes.length;
        memo = new int[n][n][n];
        return dp(boxes, 0, n - 1, 0);
    }
    int dp(int[] boxes, int l, int r, int k) {
        if (l > r){
            return 0;
        }
        if (memo[l][r][k] > 0){
            return memo[l][r][k];
        }
        int lOrg = l;
        int kOrg = k;

        while (l+1 <= r && boxes[l] == boxes[l+1]) { // Increase both `l` and `k` if they have consecutive colors with `boxes[l]`
            l += 1;
            k += 1;
        }
        int ans = (k+1) * (k+1) + dp(boxes, l+1, r, 0); // Remove all boxes which has the same with `boxes[l]`
        for (int m = l + 1; m <= r; ++m) {// Try to merge non-contiguous boxes of the same color together
            if (boxes[m] == boxes[l]) {
                ans = Math.max(ans, dp(boxes, m, r, k + 1) + dp(boxes, l + 1, m - 1, 0));
            }
        }
        memo[lOrg][r][kOrg] = ans;
        return memo[lOrg][r][kOrg];
    }
}
