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
        if(getColor().toLowerCase(Locale.ROOT).equals("w")) {
            if((toLine > line) && (column == toColumn)) {
                if(line == 1) {
                    return toLine - line == 2 || toLine - line == 1;
                } else if(line > 1) {
                    return toLine - line == 1;
                }
            }
        }

        if(getColor().toLowerCase(Locale.ROOT).equals("b")) {
            if((toLine < line) && (column == toColumn)) {
                if(line == 6) {
                    return toLine - line == -2 || toLine - line == -1;
                } else if(line < 6) {
                    return toLine - line == -1;
                }
            }
        }

        return false;
    }

    @Override
    String getSymbol() {
        return gSymbol();
    }
}
