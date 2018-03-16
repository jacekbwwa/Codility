/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codility;

/**
 *
 * @author XNOTE
 */
public class TestTapeEquilibrium {

    protected int N; // table length
    protected int X; // value of n..
    protected int[] A;
    Data data = new Data();
    TapeEquilibrium tapeEquilibrium = new TapeEquilibrium();

    TestTapeEquilibrium() {

    }

    TestTapeEquilibrium(int X, int N) {
        this.X = X;
        this.N = N;
    }

    protected void testTableExample() {

        data.fillExample();
        A = data.getData();
        data.printArr(A);

        tapeEquilibrium.solution(A);
        data.printArr(A);
    }
    
    protected  void testTablePositive(int X,int N){
    this.N=N;
    this.X=X;
    

        data.fillTablePositive(X,N);
          A=data.getData();
          //data.printArr(A);
        tapeEquilibrium.solution(A); 
}
}
