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
        if( !chessBoard.checkPos(line) ||
                !chessBoard.checkPos(column) ||
                !chessBoard.checkPos(toLine) ||
                !chessBoard.checkPos(toColumn)) {
            return false;
        }

        //TODO Добавить логику по возможному передвижению слона

        //Рокировка

        check = false;
        return true;
    }

    @Override
    String getSymbol() {
        return gSymbol();
    }

    public boolean isUnderAttack(ChessBoard chessBoard, int i, int i1) {
        //TODO Добавить логику по проверке под атакой ли король
        return false;
    }
}
