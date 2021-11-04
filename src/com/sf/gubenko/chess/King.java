package com.sf.gubenko.chess;

public class King extends ChessPiece{

    public King(String color) {
        super(color);
        setSymbol("K");
    }

    @Override
    String getColor() {
        return gColor();
    }

    @Override
    boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if(!chessBoard.isBasePos(line,column,toLine,toColumn)) {
            return false;
        }
        if(((line - toLine <= 1 && line - toLine >= -1) &&
                (column - toColumn <= 1 && column - toColumn >= -1)) &&
                chessBoard.isEnemyPiece(getColor(), toLine, toColumn) &&
                isUnderAttack(chessBoard, toLine, toColumn)){
            //Рокировка
            check = false;
            return true;
        }

        return false;
    }

    @Override
    String getSymbol() {
        return gSymbol();
    }

    public boolean isUnderAttack(ChessBoard chessBoard, int line, int column) {
        if(!chessBoard.checkPos(line) || !chessBoard.checkPos(column)) {
            return false;
        }

        for (int i = 0; i < chessBoard.board[0].length; i++) {
            for (int j = 0; j < chessBoard.board.length; j++) {
                if (chessBoard.board[i][j] != null) {
                    if (!chessBoard.board[i][j].getColor().equals(getColor()) &&
                            chessBoard.board[i][j].canMoveToPosition(chessBoard, i, j, line, column)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
