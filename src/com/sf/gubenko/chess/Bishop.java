package com.sf.gubenko.chess;

import java.util.Locale;

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
        if( !chessBoard.checkPos(line) ||
                !chessBoard.checkPos(column) ||
                !chessBoard.checkPos(toLine) ||
                !chessBoard.checkPos(toColumn)) {
            return false;
        }

        //TODO Добавить логику по возможному передвижению слона
        return true;
    }

    @Override
    String getSymbol() {
        return gSymbol();
    }
}
