/*
https://app.codility.com/programmers/lessons/6-sorting/distinct/

Write a function

class Solution { public int solution(int[] A); }

that, given a zero-indexed array A consisting of N integers, returns the number of distinct values in array A.

Assume that:

N is an integer within the range [0..100,000];
each element of array A is an integer within the range [-1,000,000..1,000,000].
For example, given array A consisting of six elements such that:

 A[0] = 2    A[1] = 1    A[2] = 1
 A[3] = 2    A[4] = 3    A[5] = 1
the function should return 3, because there are 3 distinct values appearing in array A, namely 1, 2 and 3.

Complexity:

expected worst-case time complexity is O(N*log(N));
expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
 */
package codility;

/**
 *
 * @author Jacek Byzdra , email: jacek.jaroslaw.byzdra@gmail.com
 */
public class Distinct {

    public int solution(int[] A) {

        int L = A.length;
        int sum=0;
        int[] B = new int[1000001];
        int[] C = new int[1000001];
        for (int i = 0; i < L; i++) {
            if (A[i] < 0) {
                C[Math.abs(A[i])] = 1;
            }
            if(A[i]>=0){
                B[A[i]]=1;
            }
        }
        for(int j=0; j<1000001; j++){
            if(B[j]==1){
                sum=sum+1;
            }
            if(C[j]==1){
                sum=sum+1;
            }
        }
        System.out.println("sum = : " + sum);
        return sum;
    }
}
