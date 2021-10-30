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
        return (chessBoard.isBasePos(line,column,toLine,toColumn)) &&
                (Math.abs(line - toLine) == Math.abs(column - toColumn));
    }

    @Override
    String getSymbol() {
        return gSymbol();
    }
}
