/*
https://app.codility.com/programmers/lessons/4-counting_elements/perm_check/

A non-empty zero-indexed array A consisting of N integers is given.

A permutation is a sequence containing each element from 1 to N once, and only once.

For example, array A such that:
    A[0] = 4
    A[1] = 1
    A[2] = 3
    A[3] = 2 
is a permutation, but array A such that:
    A[0] = 4
    A[1] = 1
    A[2] = 3 
is not a permutation, because value 2 is missing.

The goal is to check whether array A is a permutation.

Write a function:

int solution(int A[], int N);


that, given a zero-indexed array A, 
returns 1 if array A is a permutation and 0 if it is not.

For example, given array A such that:
    A[0] = 4
    A[1] = 1
    A[2] = 3
    A[3] = 2 
the function should return 1.

Given array A such that:
    A[0] = 4
    A[1] = 1
    A[2] = 3 
the function should return 0.

Assume that:

•N is an integer within the range [1..100,000];
•each element of array A is an integer within the range [1..1,000,000,000].

Complexity:

•expected worst-case time complexity is O(N);
•expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).

 */
package codility;

import java.util.Arrays;

/**
 *
 * @author Jacek Byzdra , email: jacek.jaroslaw.byzdra@gmail.com
 */
public class PermCheck {

    
/*
Task Score  / Correctness / Performance 
100%            100%           100% 
*/
    public int solution(int[] A) {
        int N = A.length;
        int tmp;
        int res = 1;
        Arrays.sort(A);
        if (N == 1 && A[0] == 1) {

            res = 1;
            System.out.println("Array is   permutation. RES= :" + res);
            return res;
        }
        if (N == 1 && A[0] != 1) {

            res = 0;
            System.out.println("Array is  not permutation. RES= :" + res);
            return res;
        }

        if (N==2 && (A[0] * A[1]) != 2) {
            res = 0;
            System.out.println("Array is  not permutation. RES= :" + res);
            return res;
        }

        if (N==2 && (A[0] * A[1]) == 2) {
            res = 1;
            System.out.println("Array is   permutation. RES= :" + res);
            return res;
        }

        for (int i = 0; i < N - 1; i++) {
            tmp = A[i];

            if (A[i + 1] != tmp + 1) {

                res = 0;
                System.out.println("Array is not permutation. RES= :" + res);
                return res;
            }
        }
        System.out.println("Array is  permutation. RES= :" + res);
        return res;
    }
    
    
/*
Task Score  / Correctness / Performance 
100%            100%           100% 
*/
    
    public static int solution2(int[] A) {
        int N=A.length;
        int[] B = new int[N];
        for (int j=0; j<N; j++) {
            if (A[j]> N) {
                System.out.println("Array is not permutation");
                return 0;
            }
            B[A[j]-1]=B[A[j]-1]+1;  // mark all subsequent visited elements and assign 1 to B, where value of A = index of B
        }
        for (int i = 0; i < A.length; i++) {
            if (B[i] != 1) {    // if element is not marked is not subsequent el. of permutation
                System.out.println("Array is  not permutation");
                return 0;
            }
        }
System.out.println("Array is  permutation.");
        return 1;
    }
}
