package com.keresmi;

public class TicTacToeLogic {

    private final int SIZE = 3;
    private final String x = "x";
    private final String o = "o";
    private final String empty = "-";

    private String [][] board;

    public TicTacToeLogic() {
        init();
    }

    private void init() {
        board = new String[SIZE][SIZE];

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = empty;
            }
        }
    }

    public void printBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(board[i][j]);
                System.out.print("  ");
            }
            System.out.println();
        }
    }

    public boolean move(String symbol, int rowIndex, int columnIndex) {
        if ((symbol.equals(x) || symbol.equals(o)) && board[rowIndex][columnIndex].equals(empty)) {
            board[rowIndex][columnIndex] = symbol;
            return true;
        } else {
            return false;
        }
    }

    public boolean isFinished() {
        for (int i = 0; i < SIZE; i++) {


        }
        return false;
    }
    private boolean checkRows() {
        boolean win = false;
        for (int i = 0; i < SIZE; i++) {
            String[] row = board[i];
            win = validate(row);
        }
        return win;
    }

    private boolean checkColumns() {
        return false;
    }

    private boolean validate(String[] tab) {
//        boolean isIdentical = true;
        String a = tab[0];
        String b = tab[1];
        String c = tab[2];

        return a.equals(b) && b.equals(c);


////        for (int i = 1; i < tab.length; i++) {
////            isIdentical = !tab[i - 1].equals(empty) && !tab[i].equals(empty) && tab[i - 1].equals(tab[i]);
////            if (!isIdentical) {
////                break;
////            }
////        }
//        return isIdentical;
    }
}
