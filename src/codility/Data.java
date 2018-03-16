/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codility;

import java.util.Random;

/**
 *
 * @author Jacek Byzdra , email: jacek.jaroslaw.byzdra@gmail.com
 */
public class Data {

    protected int[] A;
    protected int N;
    protected int X;
    protected int D;
    protected int Y;
    protected int randomNum;

    Data() {
    }
    
    
  
    
    protected int fillRandom(int N){
        this.N=N;
        Random rand = new Random();
        int randomNum = 1000 + rand.nextInt((N - 1) + 1);
        this.randomNum=randomNum;
        return randomNum;
    }
    
    
    protected int[] fillExample(){
        //A = new int[]{9, 3, 9, 3, 9, 7, 9};
         // A= new int[]{7,6,8,9,5,7,1};
        //A=new int[]{3,1,2,4,3};
       // A=new int[]{-5,-3,-4,-6,-5,3,1,2,4,3};
        //A=new int[]{-1000,1000};
      // A=new int[]{-3,-2,2,3};
       //A=new int[]{-10, -5, -3, -4, -5};
        return A;
    }

    protected int[] fillTablePositive(int X, int N) {
        this.N = N;
        this.X = X;
        int j = 1;
         A = new int[N];
        try {
            for (int i = 0; i < N; i++) {

                A[i] = j ;
                j++;
            }
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Do not cross size of array sir " + exception);
        }
        return A;
    }

    protected int[] fillTableNegative(int X, int N) {
        this.N = N;
        this.X = X;
        int j = -1;
         A = new int[N];
        try {
            for (int i = 0; i < N; i++) {

                A[i] = j ;
                j--;
            }
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Do not cross size of array sir " + exception);
        }
        return A;
    }

   

    protected int[] fillTableSingleRandom(int X, int N) {
        this.N = N;
        this.X = X;
        A = new int[N];
        try {
            Random rand = new Random();
            int randomNum = rand.nextInt(X);
            A[N - 1] = randomNum;
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Do not cross size of array sir " + exception);
        }

        return A;
    }

    protected int[] fillTableTwoRandom(int X, int N) {
        this.N = N;
        this.X = X;
        A = new int[N];
        try {
            Random rand = new Random();
            int randomNum = 1 + rand.nextInt((X - 1) + 1);
            A[0] = randomNum;
            A[1] = randomNum;
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Do not cross size of array sir " + exception);
        }
        return A;
    }
    
     protected int[] fillTableSmallRandom(int X, int N) {
        this.N = N;
        this.X = X;
        A = new int[N];
        try {
            for(int i=0; i<N; i++){
            Random rand = new Random();
            int randomNum = 1 + rand.nextInt((X - 1) + 1);
            A[i] = randomNum;
            }
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Do not cross size of array sir " + exception);
        }
        return A;
    }
     
     protected int[] fillTableTheSamePlace(int X, int N) {
        this.N = N;
        this.X = X;
        A = new int[N];
        Random rand = new Random();
        int randomNum = 1 + rand.nextInt((X - 1) + 1);
        try {
            for(int i=0; i<N; i++){
            A[i] = randomNum;
            }
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Do not cross size of array sir " + exception);
        }
        return A;
    }
     
     protected int factorial(int Z){
         if(Z==0){
             return 1;
         }
         else{
             return(Z*(factorial(Z-1)));
         }
     }
     
      protected int[] fillTablePermutation(int X, int N) {
        this.N = N;
        this.X = X;
        A = new int[N];
        try {
            for(int i=0; i<N; i++){
            int K = factorial(X)/factorial(N-X);
            A[i] = K ;
            }
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Do not cross size of array sir " + exception);
        }
        return A;
    }
      
      protected int[] fillTableArithmSequence(int X, int N) {
        this.N = N;
        this.X = X;
        A = new int[N];
        try {
            for(int i=0; i<N; i++){
            int K = X+(N-X)*(N-1-i);
            A[i] = K ;
            }
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Do not cross size of array sir " + exception);
        }
        return A;
    }

    protected int[] getData() {
        return A;
    }
    
       protected int getRandomValue() {
        return randomNum;
    }

    public void printArr(int[]A) {
        int n = A.length;
        System.out.print("Arr = :");

            for (int i = 0; i < n; i++) {
                System.out.print(A[i] + ", ");

            }

        System.out.println();
    }
}
