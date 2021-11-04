package com.sf.gubenko.chess;

public class Rook extends ChessPiece{

    public Rook(String color) {
        super(color);
        setSymbol("R");
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

        if(((line == toLine) && (column != toColumn)) &&
                (chessBoard.isEnemyPiece(getColor(), toLine, toColumn))) {

            for (int i = Math.min(toColumn, column); i < Math.max(column, toColumn); i++) {
                if (chessBoard.board[line][i] != null) {
                    if (chessBoard.board[line][i] == this && i == Math.max(column, toColumn)) {
                        return false;
                    } else if (chessBoard.board[line][i].getColor().equals(getColor()) && i == toColumn) {
                        return false;
                    } else if (!chessBoard.board[line][i].getColor().equals(getColor()) && i == toColumn) {
                        //рокировка
                        check = false;
                        return true;
                    }
                    else if (i != toLine && i != column) {
                        return false;
                    }
                }
            }

            if (chessBoard.board[toLine][toColumn] != null) {
                if (chessBoard.board[toLine][toColumn].getColor().equals(getColor()) && chessBoard.board[toLine][toColumn] != this) {
                    return false;
                } else {
                    return !chessBoard.board[toLine][toColumn].getColor().equals(getColor()) &&
                            chessBoard.board[toLine][toColumn] != this;
                }
            } else {
                //рокировка
                check = false;
                return true;
            }

        }

        if(((line != toLine) && (column == toColumn)) &&
                (chessBoard.isEnemyPiece(getColor(), toLine, toColumn))) {
            for (int i = Math.min(line, toLine); i < Math.max(line, toLine); i++) {
                if (chessBoard.board[i][column] != null) {
                    if (chessBoard.board[i][column] == this && i == Math.max(line, toLine)) {
                        return false;
                    } else if (chessBoard.board[i][column].getColor().equals(getColor()) && i == toLine) {
                        return false;
                    } else if (!chessBoard.board[i][column].getColor().equals(getColor()) && i == toLine) {
                        //рокировка
                        check = false;
                        return true;
                    }
                    else if (i != toLine && i != line) {
                        return false;
                    }
                }
            }

            if (chessBoard.board[toLine][column] != null) {
                if (chessBoard.board[toLine][column].getColor().equals(getColor()) && chessBoard.board[toLine][column] != this) {
                    return false;
                } else {
                    return !chessBoard.board[toLine][column].getColor().equals(getColor()) &&
                            chessBoard.board[toLine][column] != this;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    @Override
    String getSymbol() {
        return gSymbol();
    }
}
