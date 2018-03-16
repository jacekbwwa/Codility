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
public class TestFrogRiverOne {
   protected int N; // table length
   protected int X; // value of n..
   protected  int[]A;
   Data data = new Data();
   FrogRiverOne frogRiverOne = new FrogRiverOne();
   
   TestFrogRiverOne(){
       
   }

TestFrogRiverOne(int X, int N){
    this.X=X;
    this.N=N;
}



protected void testTableSingleRandom(int X,int N){
    this.X=X;
    this.N=N;

    for(int i=0; i<N; i++){
          data.fillTableSingleRandom(X,N);
          A=data.getData();
          data.printArr(A);
 
          frogRiverOne.solution(X, A);
    }
}

  protected  void testTablePositive(int X,int N){
    this.N=N;
    this.X=X;
    

    for(int i=0; i<N; i++){
        data.fillTablePositive(X,N);
          A=data.getData();
          data.printArr(A);
        frogRiverOne.solution(X,A); 
    }
}
   
 protected  void testTableTwoRandom(int X,int N){
    this.N=N;
    this.X=X;
    

    for(int i=0; i<N; i++){
        data.fillTableTwoRandom(X,N);
          A=data.getData();
          data.printArr(A);
        frogRiverOne.solution(X,A); 
    }
}
    
 protected  void testTableSmallRandom(int X,int N){
    this.N=N;
    this.X=X;
    

    for(int i=0; i<N; i++){
        data.fillTableSmallRandom(X,N);
          A=data.getData();
          data.printArr(A);
        frogRiverOne.solution(X,A); 
    }
}
 
  protected  void testTableTheSamePlace(int X,int N){
    this.N=N;
    this.X=X;
    

    for(int i=0; i<N; i++){
        data.fillTableTheSamePlace(X,N);
          A=data.getData();
          data.printArr(A);
        frogRiverOne.solution(X,A); 
    }
}
  
   protected  void testTablePermutation(int X,int N){
    this.N=N;
    this.X=X;
    

    for(int i=0; i<N; i++){
        data.fillTablePermutation(X,N);
          A=data.getData();
          data.printArr(A);
        frogRiverOne.solution(X,A); 
    }
}
   
   protected  void testTableArithmSequence(int X,int N){
    this.N=N;
    this.X=X;
    

    for(int i=0; i<N; i++){
        data.fillTableArithmSequence(X,N);
          A=data.getData();
          data.printArr(A);
        frogRiverOne.solution(X,A); 
    }
}
   
}



          