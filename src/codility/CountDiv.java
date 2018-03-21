/*
https://app.codility.com/programmers/lessons/5-prefix_sums/count_div/
CountDiv
Write a function:
class Solution { public int solution(int A, int B, int K); }
that, given three integers A, B and K, returns the number of integers 
within the range [A..B] that are divisible by K, i.e.:
{ i : A <= i <= B, i mod K = 0 }
For example, for A = 6, B = 11 and K = 2, your function should return 3, 
because there are three numbers divisible by 2 
within the range [6..11], namely 6, 8 and 10.
Assume that:
A and B are integers within the range [0..2,000,000,000];
K is an integer within the range [1..2,000,000,000];
A <= B.
Complexity:
expected worst-case time complexity is O(1);
expected worst-case space complexity is O(1).
 */
package codility;

/**
 *
  * @author Jacek Byzdra , email: jacek.jaroslaw.byzdra@gmail.com
 */
public class CountDiv {
    
    /*
Task Score  / Correctness / Performance 
100%            100%           100% 
*/

    public int solution(int A, int B, int K) {
        int x = 0;
               
        if (A % K == 0) {
            x = B/K - A/ K + 1;
            System.out.println("x = " + x);
            return x;
        }

        if (A % K != 0) {
            x = B/K - A/ K;
            System.out.println("x = " + x);
            return x;
        }
        
        return x;
        

    }

}
