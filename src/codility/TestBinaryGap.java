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
public class TestBinaryGap {
     protected int N;
     Data data = new Data();
     BinaryGap binaryGap = new BinaryGap();
     
    TestBinaryGap(){
        
    }
    
    TestBinaryGap(int N){
        this.N=N;
    }
    
    protected void testRandom(int N){
        this.N=N;
        data.fillRandom(N);
        N = data.getRandomValue();
        binaryGap.solution(N);
        
    }
    
}
