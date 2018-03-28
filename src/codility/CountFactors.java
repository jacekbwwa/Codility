/*
https://app.codility.com/programmers/lessons/10-prime_and_composite_numbers/count_factors/

A positive integer D is a factor of a positive integer N if there exists an integer M such that N = D * M.

For example, 6 is a factor of 24, because M = 4 satisfies the above condition (24 = 6 * 4).

Write a function:

class Solution { public int solution(int N); }

that, given a positive integer N, returns the number of its factors.

For example, given N = 24, the function should return 8, because 24 has 8 factors, namely 1, 2, 3, 4, 6, 8, 12, 24. There are no other factors of 24.

Assume that:

N is an integer within the range [1..2,147,483,647].
Complexity:

expected worst-case time complexity is O(sqrt(N));
expected worst-case space complexity is O(1).
 */
package codility;

import java.util.ArrayList;

/**
 *
  * @author Jacek Byzdra , email: jacek.jaroslaw.byzdra@gmail.com
 */
public  class CountFactors {
    
    void printArr(ArrayList A) {
        int n = A.size();
        System.out.print("Arr = :");

            for (int i = 0; i < n; i++) {
                System.out.print(A.get(i) + ", ");

            }

        System.out.println();
    }
    
   /*
Task Score  / Correctness / Performance 
100%            100%           100% 
*/
    public int solution(int N){
        int i=1;
        int count=0;
        ArrayList A = new ArrayList();
       // int t=N;
        
        for(i=1; i<=(int)Math.sqrt(N); i++){
            if(N%i==0){
                if(N/i==i){
                    A.add(i);
                    count++;
                }
                else{
                A.add(i);
                A.add(N/i);
                count=count+2;
              //  t=N/i;
                }
            }
            
            
        }
        
        System.out.println("counter = : " + count);
        printArr(A);
        return count;
        
        
    }
    
    
    //85%
    private static int CountFactor2(int n)
     {
         int licznik = 0;
         int limiter = n;
         if(n == 1) return 1;
         for(int i = 1; i <limiter; i++)
         {
             if(n % i == 0)
             {
                 licznik = n/i == i ? licznik+1 : licznik +2;
                 limiter = n / i;
             }
         }
         return licznik;
     }

    
}
