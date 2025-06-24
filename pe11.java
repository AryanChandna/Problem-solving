import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class pe11 {
    
    public static void main(String[] args){

        int[][] grid = new int[20][20];

        try {
            Scanner scn = new Scanner(new File("grid.text"));

            for(int i = 0; i < grid.length; i++){

                for(int j = 0; j < grid.length; j++){

                    grid[i][j] = scn.nextInt();
                }
            }
             int maxProduct = 0;

        // Directions: right, down, diagonal down-right, diagonal down-left
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                // Right →
                if (j + 3 < 20) {
                    int product = grid[i][j] * grid[i][j+1] * grid[i][j+2] * grid[i][j+3];
                    maxProduct = Math.max(maxProduct, product);
                }

                // Down ↓
                if (i + 3 < 20) {
                    int product = grid[i][j] * grid[i+1][j] * grid[i+2][j] * grid[i+3][j];
                    maxProduct = Math.max(maxProduct, product);
                }

                // Diagonal right ↘
                if (i + 3 < 20 && j + 3 < 20) {
                    int product = grid[i][j] * grid[i+1][j+1] * grid[i+2][j+2] * grid[i+3][j+3];
                    maxProduct = Math.max(maxProduct, product);
                }

                // Diagonal left ↙
                if (i + 3 < 20 && j - 3 >= 0) {
                    int product = grid[i][j] * grid[i+1][j-1] * grid[i+2][j-2] * grid[i+3][j-3];
                    maxProduct = Math.max(maxProduct, product);
                }
            }
        }

        System.out.println("Maximum product of 4 adjacent numbers: " + maxProduct);
    
            scn.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        }
    }
}
