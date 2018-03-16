/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codility;

/**
 *
* @author Jacek Byzdra , email: jacek.jaroslaw.byzdra@gmail.com
 */
public class TestOddOccurrencesInArray {
       protected int N; // table length
   protected int X; // value of n..
    protected  int[]A;
   Data data = new Data();
   OddOccurrencesInArray oddOccurrencesInArray = new OddOccurrencesInArray();
    TestOddOccurrencesInArray(){
    
    }
    
        TestOddOccurrencesInArray(int X, int N){
    this.X=X;
    this.N=N;
    }
        
   protected void testTableExample(int X,int N){
    this.X=X;
    this.N=N;

          data.fillExample(X,N);
          A=data.getData();
          data.printArr(A);
 
          oddOccurrencesInArray.solution(A, N);
                  data.printArr(A);
}
   
   protected void testTableSingleRandom(int X,int N){
    this.X=X;
    this.N=N;

          data.fillTableSingleRandom(X,N);
          A=data.getData();
          data.printArr(A);
 
          oddOccurrencesInArray.solution(A, N);
                  data.printArr(A);

}
    
}
