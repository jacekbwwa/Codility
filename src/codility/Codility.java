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
public class Codility {
    public static void main(String[] args) {
        int N=500; // table length
        int X=3;  // value position
        int K=3; // value of K (times)
        TestFrogRiverOne testFrogRiverOne = new TestFrogRiverOne(X,N);
        

        //testFrogRiverOne.testTablePositive(X, N);
       // testFrogRiverOne.testTableTwoRandom(X,N);
        //testFrogRiverOne.testTableSmallRandom(X,N);
        //testFrogRiverOne.testTableTheSamePlace(X, N);
        //testFrogRiverOne.testTablePermutation(X, N);
        //testFrogRiverOne.testTableArithmSequence(X, N);

        TestCyclicRotation testCyclicRotation = new TestCyclicRotation(X,N,K);
      // testCyclicRotation.testTableExample(X,N,K);
       // testCyclicRotation.testTableSingleRandom(X, N, K);
        //testCyclicRotation.testTablePositive(X,N,K);
       // testCyclicRotation.testTableNegative(X,N,K);
       // testCyclicRotation.testTableTwoRandom(X,N,K);
        //testCyclicRotation.testTableSmallRandom(X,N,K);
        //testCyclicRotation.testTableTheSamePlace(X,N,K);
        //testCyclicRotation.testTablePermutation(X,N,K);
        //testCyclicRotation.testTableArithmSequence(X,N,K);
        
        TestOddOccurrencesInArray testOddOccurrencesInArray = new TestOddOccurrencesInArray();
      // testOddOccurrencesInArray.testTableExample(X, N);
        //testOddOccurrencesInArray.testTableSingleRandom(X, N);
        
        TestBinaryGap testBinaryGap = new TestBinaryGap();
        testBinaryGap.testRandom(N);
        
    }
    
}
