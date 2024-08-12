public class MaxWealth {
    public static void main(String[] args) {
        
    }
    
    static int maximumWealth(int[][] accounts){
        // person = row
        // account = col
        int ans = 0;
        for(int person = 0; person < accounts.length; person++){
            // when you start a new column, take a new sum for that row
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account];
            }

            // now we have sum of accounts of person
            // check with overall ans
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
