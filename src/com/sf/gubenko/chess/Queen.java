package com.sf.gubenko.chess;

public class Queen extends ChessPiece{

    public Queen(String color) {
        super(color);
        setSymbol("Q");
    }

    @Override
    String getColor() {
        return gColor();
    }

    @Override
    boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
       return ((chessBoard.isBasePos(line,column,toLine,toColumn)) &&
                (new Bishop(getColor()).canMoveToPosition(chessBoard,line,column,toLine,toColumn) ||
                 new Rook(getColor()).canMoveToPosition(chessBoard,line,column,toLine,toColumn)));
    }

    @Override
    String getSymbol() {
        return gSymbol();
    }
}
