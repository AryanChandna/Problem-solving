public class pe15 {
    
    public static void main(String[] args){

        int size = 20;
        long[][] mat = new long[size+1][size+1];

        for(int i = 0; i <=size; i++){

            for(int j = 0; j <= size; j++){

                mat[i][j] = -1;
            }
        }

        long ans = countRoutes(mat, 0, 0, size, size);
        System.out.println(ans);
    }

    public static long countRoutes(long[][] mat, int row, int col, int rsize, int colsize){

        if(row > rsize || col > colsize){
            return 0;
        }

        if(row == rsize && col == colsize){
            return 1;
        }

        if(mat[row][col] != -1)
            return mat[row][col];

        
        mat[row][col] = countRoutes(mat, row + 1, col, rsize, colsize) + countRoutes(mat, row, col + 1, rsize, colsize);

        return mat[row][col];
       
    }
}
