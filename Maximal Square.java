// Time Complexity : O(m * n); where m = number of rows and n = number of columns
// Space Complexity : O(m * n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public int maximalSquare(char[][] matrix) {
        if(matrix == null || matrix.length == 0) return 0;
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        int [][] dp = new int [m + 1][n + 1];
        int max = 0;
        
        for(int i = 1; i < dp.length; i++){
            for(int j = 1; j < dp[0].length; j++){
                if(matrix[i - 1][j - 1] == '1'){
                    dp[i][j] = Math.min(dp[i - 1][j - 1], Math.min(dp[i][j - 1], dp[i - 1][j])) + 1;
                    max = Math.max(max, dp[i][j]);
                }
            }
        }
        return max * max;
        
//         for(int i = 0; i < dp.length; i++){
//             for(int j = 0; j < dp[0].length; j++){
//                 System.out.print(dp[i][j] + " ");
//             }
//             System.out.println();
//         }
    }
}