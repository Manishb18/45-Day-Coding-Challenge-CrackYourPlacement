import java.util.*;
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> spiral = new ArrayList<>();

        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return spiral;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;
        int topRow = 0;
        int bottomRow = rows - 1;
        int leftCol = 0;
        int rightCol = cols - 1;

        while (topRow <= bottomRow && leftCol <= rightCol) {
            // Traverse top row from left to right
            for (int j = leftCol; j <= rightCol; j++) {
                spiral.add(matrix[topRow][j]);
            }
            topRow++;

            // Traverse right column from top to bottom
            for (int i = topRow; i <= bottomRow; i++) {
                spiral.add(matrix[i][rightCol]);
            }
            rightCol--;

            // Traverse bottom row from right to left
            if (topRow <= bottomRow) {
                for (int j = rightCol; j >= leftCol; j--) {
                    spiral.add(matrix[bottomRow][j]);
                }
                bottomRow--;
            }

            // Traverse left column from bottom to top
            if (leftCol <= rightCol) {
                for (int i = bottomRow; i >= topRow; i--) {
                    spiral.add(matrix[i][leftCol]);
                }
                leftCol++;
            }
        }
        return spiral;
    }
}
