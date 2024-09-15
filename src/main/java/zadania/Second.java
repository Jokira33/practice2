package zadania;

import java.util.Scanner;

public class Second {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        // Read n and m from input
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        // Create a 2D array to store the numbers
        int[][] grid = new int[m][n];

        // Fill the grid diagonally
        int number = 1;
        for (int d = 0; d < n + m - 1; d++) {
            int rowStart = Math.max(0,d - n + 1);
            int colStart = Math.max(0,n - 1 - d);

            for (int row = rowStart, col = colStart; row < m && col < n; row++, col++) {
                grid[row][col] = number++;
            }
        }

        // Print the grid
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println(); // New line after each row
        }

        scanner.close();





    }
}
