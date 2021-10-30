package com.sf.gubenko.chess;

public class Rook extends ChessPiece{

    public Rook(String color) {
        super(color);
        setSymbol("R");
    }

    @Override
    String getColor() {
        return gColor();
    }

    @Override
    boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if( !chessBoard.checkPos(line) ||
                !chessBoard.checkPos(column) ||
                !chessBoard.checkPos(toLine) ||
                !chessBoard.checkPos(toColumn)) {
            return false;
        }

        if(((line != toLine) && (column == toColumn)) ||
                ((line == toLine) && (column != toColumn))) {
            //рокировка
            check = false;
            return true;
        }

        return false;
    }

    @Override
    String getSymbol() {
        return gSymbol();
    }
}
