/*
https://app.codility.com/programmers/lessons/4-counting_elements/frog_river_one/
1. FrogRiverOne:
Find the earliest time when a frog can
jump to the other side of a river. 
Task Score/ Correctness / Performance:
100% 100% 100%

A small frog wants to get to the other side of a river. The frog is initially located on one bank of the river (position 0) and wants to get to the opposite bank (position X+1). Leaves fall from a tree onto the surface of the river.

You are given a zero-indexed array A consisting of N integers representing the falling leaves. A[K] represents the position where one leaf falls at time K, measured in seconds.

The goal is to find the earliest time when the frog can jump to the other side of the river. The frog can cross only when leaves appear at every position across the river from 1 to X (that is, we want to find the earliest moment when all the positions from 1 to X are covered by leaves). You may assume that the speed of the current in the river is negligibly small, i.e. the leaves do not change their positions once they fall in the river.

For example, you are given integer X = 5 and array A such that:
  A[0] = 1
  A[1] = 3
  A[2] = 1
  A[3] = 4
  A[4] = 2
  A[5] = 3
  A[6] = 5
  A[7] = 4 
In second 6, a leaf falls into position 5. This is the earliest time when leaves appear in every position across the river.

Write a function:

int solution(int X, int A[], int N);


that, given a non-empty zero-indexed array A consisting of N integers and integer X, returns the earliest time when the frog can jump to the other side of the river.

If the frog is never able to jump to the other side of the river, the function should return −1.

For example, given X = 5 and array A such that:
  A[0] = 1
  A[1] = 3
  A[2] = 1
  A[3] = 4
  A[4] = 2
  A[5] = 3
  A[6] = 5
  A[7] = 4 
the function should return 6, as explained above.

Assume that:

•N and X are integers within the range [1..100,000];
•each element of array A is an integer within the range [1..X].

Complexity:

•expected worst-case time complexity is O(N);
•expected worst-case space complexity is O(X), beyond input storage (not counting the storage required for input arguments).


 */
package codility;

/**
 *
 * @author Jacek Byzdra , email: jacek.jaroslaw.byzdra@gmail.com
 */
public class FrogRiverOne{
    
    FrogRiverOne(){
}

    /*
Task Score  / Correctness / Performance 
100%            100%           100% 
*/
    public int solution(int X, int A[]){  
    int N=A.length;
    int counter =1;
    int licz=0;
    int[] B = new int[X+1];
    for(int i=0; i<N; i++){
        if(A[i]<=X){
            if(B[A[i]]==counter){
               continue;
            }
            else{
            B[A[i]]=counter;  // when index in B[X+1] is eaqual met value of A[i], write 1 to B[X+1]
            licz++;         // increase counter
              if(licz==X){
                  System.out.println("For above array with " + N + " elements, and " + X + " leaves on surface,  the earliest time when a frog can\n" +
"jump to the other side of a river is " + i + " sec");
                return i;  // if counter "licz" is equal number X return index i, which is the earliest time when frog may jump to other side of the river
               }
            }
          }
        
        }
      System.out.println("Result = -1 ");
       return -1;
       }
    
    
}
