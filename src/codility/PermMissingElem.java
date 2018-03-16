/*
https://app.codility.com/programmers/lessons/3-time_complexity/perm_missing_elem/

A zero-indexed array A consisting of N different integers is given. 
The array contains integers in the range [1..(N + 1)], which means that exactly one element is missing.

Your goal is to find that missing element.

Write a function:

int solution(int A[], int N);


that, given a zero-indexed array A, returns the value of the missing element.

For example, given array A such that:
  A[0] = 2
  A[1] = 3
  A[2] = 1
  A[3] = 5 
the function should return 4, as it is the missing element.

Assume that:

•N is an integer within the range [0..100,000];
•the elements of A are all distinct;
•each element of array A is an integer within the range [1..(N + 1)].

Complexity:

•expected worst-case time complexity is O(N);
•expected worst-case space complexity is O(1), beyond input storage (not counting the storage required for input arguments).

 */


package codility;

/**
 *
  * @author Jacek Byzdra , email: jacek.jaroslaw.byzdra@gmail.com
 */
public class PermMissingElem {
    
 public int solution(int[] A){
        
        int N=A.length;
        int[] B = new int[N+2];
        int j;
        
        for(int i=0; i<N; i++){
            if(B[A[i]]==0){
                B[A[i]]= -1;
            }
        }
        for(j=1; j<N+2; j++){
            if(B[j]==0){
                System.out.println("Missing number in Array is: " + j);
                return j;
            }
        }
        return j;
    }
    
}

