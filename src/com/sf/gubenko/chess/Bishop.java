package com.sf.gubenko.chess;

public class Bishop extends ChessPiece{

    public Bishop(String color) {
        super(color);
        setSymbol("B");
    }

    @Override
    String getColor() {
        return gColor();
    }

    @Override
    boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if((chessBoard.isBasePos(line,column,toLine,toColumn)) &&
                (Math.abs(line - toLine) == Math.abs(column - toColumn)) &&
                chessBoard.isEnemyPiece(getColor(), toLine, toColumn)) {

            // from up-left to down-right
            if ((column == Math.min(column, toColumn) && line == Math.max(line, toLine)) ||
                (toColumn == Math.min(column, toColumn) && toLine == Math.max(line, toLine))) {
                int fromL = Math.max(line, toLine);
                int fromC = Math.min(column, toColumn);
                int toL = Math.min(line, toLine);
                int toC = Math.max(column, toColumn);
                int[][] positions = new int[toC - fromC][1];
                for (int i = 1; i < toC - fromC; i++) {
                    if (chessBoard.board[fromL - i][fromC + i] == null) {
                        positions[i - 1] = new int[]{fromL - i, fromC + i};
                    } else if (!chessBoard.board[fromL - i][fromC + i].getColor().equals(getColor()) &&
                            fromL - i == toLine) {
                        positions[i - 1] = new int[]{fromL - i, fromC + i};
                    } else {
                        return false;
                    }
                }
                return true;
            } else {
                // from down-left to up-right
                int fromL = Math.min(line, toLine);
                int fromC = Math.min(column, toColumn);
                int toL = Math.max(line, toLine);
                int toC = Math.max(column, toColumn);
                int[][] positions = new int[toC - fromC][1];
                for (int i = 1; i < toC - fromC; i++) {
                    if (chessBoard.board[fromL + i][fromC + i] == null) {
                        positions[i - 1] = new int[]{fromL + i, fromC + i};
                    } else if (!chessBoard.board[fromL + i][fromC + i].getColor().equals(getColor()) &&
                            fromL + i == toLine) {
                        positions[i - 1] = new int[]{fromL + i, fromC + i};
                    } else {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override
    String getSymbol() {
        return gSymbol();
    }
}
