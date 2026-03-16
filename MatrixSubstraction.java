// WAP to perform matrix Subtraction

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int rows, cols;

        System.out.print("Enter number of rows: ");
        rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        cols = sc.nextInt();

        int A[][] = new int[rows][cols];
        int B[][] = new int[rows][cols];
        int C[][] = new int[rows][cols];

        System.out.println("Enter elements of Matrix A:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of Matrix B:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                B[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                C[i][j] = A[i][j] - B[i][j];
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

        System.out.println("Resultant Matrix (A - B):");

        for(int[] row : C){
            for(int ele : row){
                System.out.print(ele + " ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}
