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
                chessBoard.isEnemyPiece(getColor(), toLine, toColumn)){
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

    public boolean isUnderAttack(ChessBoard chessBoard, int i, int i1) {
        //TODO Добавить логику по проверке под атакой ли король
        return false;
    }
}
