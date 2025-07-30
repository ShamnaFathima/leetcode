public class Solution {
    public boolean validTicTacToe(String[] board) {
        int xCount = 0, oCount = 0;
        
        for (String row : board) {
            for (char c : row.toCharArray()) {
                if (c == 'X') xCount++;
                if (c == 'O') oCount++;
            }
        }

        if (oCount > xCount || xCount - oCount > 1) return false;

        boolean xWin = win(board, 'X');
        boolean oWin = win(board, 'O');

        if (xWin && oWin) return false;
        if (xWin && xCount != oCount + 1) return false;
        if (oWin && xCount != oCount) return false;

        return true;
    }

    private boolean win(String[] board, char player) {
        for (int i = 0; i < 3; i++) {
            if (board[i].charAt(0) == player &&
                board[i].charAt(1) == player &&
                board[i].charAt(2) == player) return true;

            if (board[0].charAt(i) == player &&
                board[1].charAt(i) == player &&
                board[2].charAt(i) == player) return true;
        }

        if (board[0].charAt(0) == player &&
            board[1].charAt(1) == player &&
            board[2].charAt(2) == player) return true;

        if (board[0].charAt(2) == player &&
            board[1].charAt(1) == player &&
            board[2].charAt(0) == player) return true;

        return false;
    }
}
