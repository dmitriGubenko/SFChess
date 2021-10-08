package com.sf.gubenko.chess;

import java.util.Locale;

public class Pawn extends ChessPiece{

    public Pawn(String color) {
        super(color);
        setSymbol("P");
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
        if((getColor().toLowerCase(Locale.ROOT).equals("white")) &&
                (line == 1)) {
            //можно идти на 2 клетки вперед за белых

        }else if ((getColor().toLowerCase(Locale.ROOT).equals("black")) &&
                (line == 7)) {
            //можно идти на 2 клетки вперед за чёрных
        } else {
            //можно идти только вперед не больше чем на одну клетку

        }

        //TODO Добавить логику по возможному передвижению пешки
        return true;
    }

    @Override
    String getSymbol() {
        return gSymbol();
    }
}
