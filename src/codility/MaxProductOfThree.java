/*
MaxProductOfThree

https://app.codility.com/programmers/lessons/6-sorting/max_product_of_three/

A non-empty zero-indexed array A consisting of N integers is given. 
The product of triplet (P, Q, R) equates to A[P] * A[Q] * A[R] (0 ? P < Q < R < N).

For example, array A such that:

  A[0] = -3
  A[1] = 1
  A[2] = 2
  A[3] = -2
  A[4] = 5
  A[5] = 6
contains the following example triplets:

(0, 1, 2), product is -3 * 1 * 2 = -6
(1, 2, 4), product is 1 * 2 * 5 = 10
(2, 4, 5), product is 2 * 5 * 6 = 60
Your goal is to find the maximal product of any triplet.

Write a function:

class Solution { public int solution(int[] A); }

that, given a non-empty zero-indexed array A, returns the value of the maximal product of any triplet.

For example, given array A such that:

  A[0] = -3
  A[1] = 1
  A[2] = 2
  A[3] = -2
  A[4] = 5
  A[5] = 6
the function should return 60, as the product of triplet (2, 4, 5) is maximal.

Assume that:

N is an integer within the range [3..100,000];
each element of array A is an integer within the range [-1,000..1,000].
Complexity:

expected worst-case time complexity is O(N*log(N));
expected worst-case space complexity is O(1), beyond input storage (not counting the storage required for input arguments).
 */

package codility;

import java.util.Arrays;


 
/**
 *
 * @author Jacek Byzdra , email: jacek.jaroslaw.byzdra@gmail.com
 */
public class MaxProductOfThree {

    /*
    100%
    */
    private static int[] rev(int[] validData) {
        for (int i = 0; i < validData.length / 2; i++) {
            int temp = validData[i];
            validData[i] = validData[validData.length - i - 1];
            validData[validData.length - i - 1] = temp;
        }
        return validData;
    }

    public static int solution(int[] A) {
        long P = 0;
        long Q = 0;
        long R = 0;
        long maxR = Integer.MAX_VALUE;
        long maxL = Integer.MAX_VALUE;

        Arrays.sort(A);
        int start = 0;
        int L = A.length;

        R = A[L - 1];
        Q = A[L - 2];
        P = A[L - 3];
        maxR = P * Q * R;

        Q = A[start + 1];
        P = A[start];
        maxL = P * Q * R;
        int res = (int) Math.max(maxR, maxL);
        System.out.println("max =  " + res);
        return res;
    }

    /*
77%
     */
    public int solution2(int[] A) {
        int L = A.length;
        int i;
        int max = -1000000000;
        int P;
        int Q;
        int R;
        int tmp;
        int tmp2;

        Arrays.sort(A);
        for (i = 0; i < L - 2; i++) {
            P = i;
            Q = i + 1;
            R = i + 2;
            tmp = A[P] * A[Q] * A[R];
            if (A[P] < 0 && A[Q] < 0 && (Math.abs(A[P] * A[Q]) * A[L - 1]) > tmp) {
                max = Math.abs(A[P] * A[Q]) * A[L - 1];
            } else if (tmp > max) {
                max = tmp;
            }
        }
        System.out.println("max = " + max);
        return max;
    }

}
