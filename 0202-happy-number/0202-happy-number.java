class Solution {
    public boolean isHappy(int n) {

        int slow = n;
        int fast = getSumOfSquare(n);

        while(fast != 1 && fast != slow){

            slow = getSumOfSquare(slow);
            fast = getSumOfSquare(getSumOfSquare(fast));
        }

        return fast == 1;
        
    }

    private int getSumOfSquare(int n){

        int sum = 0;

        while(n > 0){

            int digit = n % 10; // 19 % 10 = 9
            sum = sum + (digit * digit); // iteration-1 -> 0 + (9 * 9) = 0 + 81 = 81
                                        // iteration-2 -> 81 + (1 * 1) = 81 + 1 = 82
            n = n / 10;// 19 / 10 = 1
        }

        return sum;
    }
}