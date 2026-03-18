// WAP to perform matrix Multiplication 3x3

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int r1,c1,r2,c2;

        System.out.print("Enter number of rows and cols of matrix A: ");
        r1 = sc.nextInt();
        c1 = sc.nextInt();

        System.out.print("Enter number of rows and cols of matrix B: ");
        r2 = sc.nextInt();
        c2 = sc.nextInt();
        
        if(c1 != r2){
            System.out.println("For matrix Multiplication columns of matrix A must equal to the rows of matrix B");
            return;
        }

        int A[][] = new int[r1][c1];
        int B[][] = new int[r2][c2];
        int C[][] = new int[r1][c2];

        System.out.println("Enter elements of Matrix A:");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of Matrix B:");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                B[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                C[i][j] = 0;
                for(int k = 0; k < c1; k++){
                C[i][j] += A[i][k] * B[k][j];
            }
            }
        }
        
        System.out.println("Matrix A: ");
        for(int[] row : A){
            for(int ele : row){
                System.out.print(ele + " ");
            }
            System.out.println();
        }
        
        System.out.println("Matrix B: ");
        for(int[] row : B){
            for(int ele : row){
                System.out.print(ele + " ");
            }
            System.out.println();
        }

        System.out.println("Resultant Matrix (A X B):");

        for(int[] row : C){
            for(int ele : row){
                System.out.print(ele + " ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}
