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
public class TestFrogJmp {
   protected  int X;
   protected int Y;
   protected int D;
   Data data = new Data();
   FrogJmp frogJmp = new FrogJmp();
   
   
    TestFrogJmp(){
        
    }
    TestFrogJmp(int X, int Y, int D){
        this.X=X;
        this.Y=Y;
        this.D=D;
        
    }
    
     protected void testRandom(int X, int Y, int D){
        this.X=X;
        this.Y=Y;
        this.D=D;
        frogJmp.solution(X,Y,D);
        
    }
    
}
