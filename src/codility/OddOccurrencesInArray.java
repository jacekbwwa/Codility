/*
 *https://app.codility.com/programmers/lessons/2-arrays/odd_occurrences_in_array/
 
A non-empty zero-indexed array A consisting of N integers is given. The array contains an odd number of elements, 
and each element of the array can be paired with another element that has the same value, 
except for one element that is left unpaired.

For example, in array A such that:
  A[0] = 9  A[1] = 3  A[2] = 9
  A[3] = 3  A[4] = 9  A[5] = 7
  A[6] = 9 
•the elements at indexes 0 and 2 have value 9,
•the elements at indexes 1 and 3 have value 3,
•the elements at indexes 4 and 6 have value 9,
•the element at index 5 has value 7 and is unpaired.

Write a function:

int solution(int A[], int N);


that, given an array A consisting of N integers fulfilling the above conditions, returns the value of the unpaired element.

For example, given array A such that:
  A[0] = 9  A[1] = 3  A[2] = 9
  A[3] = 3  A[4] = 9  A[5] = 7
  A[6] = 9 
the function should return 7, as explained in the example above.

Assume that:

•N is an odd integer within the range [1..1,000,000];
•each element of array A is an integer within the range [1..1,000,000,000];
•all but one of the values in A occur an even number of times.

Complexity:

•expected worst-case time complexity is O(N);
•expected worst-case space complexity is O(1), beyond input storage (not counting the storage required for input arguments).

 */
package codility;

import java.util.Arrays;

/**
 *
 * @author Jacek Byzdra , email: jacek.jaroslaw.byzdra@gmail.com
 * XOR  both arguments are treated as bit-fields, and the XOR operation above is performed bit-by-bit
 * For example:
byte a = 0b00110100;
byte b = 0b01011011;
byte result = a ^ b;
// 00110100 - 52
// 01011011 - 91
// 01101111 - 111, the value of "result"
 */
public class OddOccurrencesInArray {
    
    /*
Task Score  / Correctness / Performance 
100%            100%           100% 
    */
    public int solution(int A[], int N){
        int tmp=0;
      for(int i=0; i<N; i++){
          tmp=tmp^A[i]; //xor each value; 
        }
        return tmp;  // return not paired value in A[N]
    }
    
    
/*
Task Score  / Correctness / Performance 
100%            100%           100% 
*/
    public int solution2(int A[], int N){
        Arrays.sort(A);
        int tmp=A[N-1];
      for(int i=0; i<N-1; i=i+2){
          if(A[i]!=A[i+1]){       // compare values in each pair 
              return A[i];       // return not paired value
          }
   
        }
        return tmp;  
        
    }
   
    
}
