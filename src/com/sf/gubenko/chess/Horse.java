package com.sf.gubenko.chess;

public class Horse extends ChessPiece {
    public Horse(String color) {
        super(color);
        setSymbol("H");
    }

    @Override
    String getColor() {
        return gColor();
    }

    @Override
    boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        return (chessBoard.isBasePos(line,column,toLine,toColumn)) &&
                ((Math.abs(toLine - line) == 2 && Math.abs(toColumn - column) == 1) ||
                        (Math.abs(toLine - line) == 1 && Math.abs(toColumn - column) == 2));
    }

    @Override
    String getSymbol() {
        return gSymbol();
    }
}
