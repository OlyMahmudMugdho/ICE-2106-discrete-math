import java.util.Scanner;

public class Problem3A {
    public static void main(String[] args) {
        int[][] matrix1 = new int[3][3];
        int[][] matrix2 = new int[3][3];
        int[][] matrix3 = new int[3][3];
        Scanner matrixScanner = new Scanner(System.in);
        System.out.println("Enter MR1 (Matrix 1) : ");
        for (int i=0; i < 3; i++){
            for(int j=0; j < 3; j++){
                System.out.print("Enter [" + (i+1) + "][" + (j+1) + "] : ");
                matrix1[i][j] = matrixScanner.nextInt();
            }
        }

        System.out.println("Enter MR2 (Matrix 2) : ");
        for (int i=0; i < 3; i++){
            for(int j=0; j < 3; j++){
                System.out.print("Enter [" + (i+1) + "][" + (j+1) + "] : ");
                matrix2[i][j] = matrixScanner.nextInt();
            }
        }


        // MR1 U MR2
        for (int i=0; i < 3; i++){
            for (int j=0; j < 3; j++){
                matrix3[i][j] = matrix1[i][j] | matrix2[i][j];
            }
        }


        System.out.println("Matrix MR2 (Matrix 1)");
        for (int i=0; i < 3; i++) {
            System.out.print("[ ");
            for (int j=0; j < 3; j++){
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.print("]\n");
        }


        System.out.println("Matrix MR2 (Matrix 2) : ");

        for (int i=0; i < 3; i++) {
            System.out.print("[ ");
            for (int j=0; j < 3; j++){
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.print("]\n");
        }


        System.out.println("MR1 U MR2 : ");
        System.out.println("Matrix MR3 : ");

        for (int i=0; i < 3; i++) {
            System.out.print("[ ");
            for (int j=0; j < 3; j++){
                System.out.print(matrix3[i][j] + " ");
            }
            System.out.print("]\n");
        }

        matrixScanner.close();
    }
}
