public class Problem2 {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] b = {1,2};
        int[][] matrix = new int[3][2];

        for (int i=0; i < a.length; i++) {
            for (int j=0; j < b.length; j++) {
                if(a[i] > b[j]) {
                    matrix[i][j] = 1;
                    System.out.print("(" + a[i] + "," + b[j] + ") ");
                }
            }

        }
        /*
            [0,0]
            [1,0]
            [1,1]
         */

        System.out.println();

        for (int i=0; i<a.length; i++){
            System.out.print("[");
            for (int j=0; j<b.length; j++) {
                System.out.print(matrix[i][j]);
                String f = ",";
                if ((b.length - 1) == j) {
                    f = "]";
                }
                System.out.print(f);
            }
            System.out.println();
        }

    }
}
