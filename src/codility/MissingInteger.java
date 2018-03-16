/*
https://app.codility.com/programmers/lessons/4-counting_elements/missing_integer/


This is a demo task.

Write a function:

int solution(int A[], int N);


that, given an array A of N integers, returns the smallest positive integer 
(greater than 0) that does not occur in A.

For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

Given A = [1, 2, 3], the function should return 4.

Given A = [−1, −3], the function should return 1.

Assume that:

•N is an integer within the range [1..100,000];
•each element of array A is an integer within the range [−1,000,000..1,000,000].

Complexity:

•expected worst-case time complexity is O(N);
•expected worst-case space complexity is O(N), 
beyond input storage (not counting the storage required for input arguments).

 */
package codility;

/**
 *
  * @author Jacek Byzdra , email: jacek.jaroslaw.byzdra@gmail.com
 */
public class MissingInteger {
    
    public int solution(int[] A){
        
        int N=A.length;
        int[] B = new int[1000001];
        int L = B.length;
        int tmp;
        int j;
        for(int i=0; i<N; i++){
         tmp=Math.abs(A[i]);
            if(A[i]>0 && B[tmp] ==0){
            B[A[i]]=1;
        }
        }
        for(j=1; j<L; j++ ){
            if(B[j]==0){
                System.out.println("Missing smallest positive integer is: " + j);
                return j;
            }
            
        }
        return j;
        }
    
}