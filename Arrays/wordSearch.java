class Solution {
    public boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;
        boolean[][] visited = new boolean[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == word.charAt(0) && findWord(board, word, visited, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    boolean findWord(char[][] board, String word, boolean[][] visited, int i, int j, int k) {
        int rows = board.length;
        int cols = board[0].length;

        if (k == word.length()) {
            return true;
        }

        if (i < 0 || i >= rows || j < 0 || j >= cols || visited[i][j] || board[i][j] != word.charAt(k)) {
            return false;
        }

        visited[i][j] = true;

        if(findWord(board, word, visited, i + 1, j, k + 1)){
            return true;
        }
        else if(findWord(board, word, visited, i - 1, j, k + 1)){
            return true;
        }
        else if(findWord(board, word, visited, i, j + 1, k + 1)){
            return true;
        }
        else if(findWord(board, word, visited, i, j - 1, k + 1)){
            return true;
        }

        visited[i][j] = false; 

        return false;
    }
}
