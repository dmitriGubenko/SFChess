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
        if (!chessBoard.isBasePos(line,column,toLine,toColumn)) {
            return false;
        }
        int dLine = toLine - line;
        if(getColor().toLowerCase(Locale.ROOT).equals("white")) {
            if(((toLine > line) && (column == toColumn)) &&
                    chessBoard.isEnemyPiece(getColor(), toLine, toColumn)) {
                if(line == 1) {
                    return dLine == 2 || dLine == 1;
                } else if(line > 1) {
                    return dLine == 1;
                }
            }
        }

        if(getColor().toLowerCase(Locale.ROOT).equals("black")) {
            if(((toLine < line) && (column == toColumn)) &&
                    chessBoard.isEnemyPiece(getColor(), toLine, toColumn)) {
                if(line == 6) {
                    return dLine == -2 || dLine == -1;
                } else if(line < 6) {
                    return dLine == -1;
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
