package com.sf.gubenko.chess;

public abstract class ChessPiece {
    private final String color;
    private String symbol;
    boolean check = true;

    public ChessPiece(String color) {
        this.color = color;
    }

    String gColor() {
        return color;
    }

    String  gSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    abstract String getColor();
    abstract boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn);
    abstract String getSymbol();
}
