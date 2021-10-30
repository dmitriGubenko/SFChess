package com.sf.gubenko.chess;

public class Main {
    public static void main(String[] args) {
        ChessBoard board = new ChessBoard("w");
        Horse horse = new Horse("w");
//        System.out.println(horse.canMoveToPosition(board, 2,3, 1,1));
//        System.out.println(horse.canMoveToPosition(board, 2,3, 3,1));
//        System.out.println(horse.canMoveToPosition(board, 2,3, 4,4));
//        System.out.println(horse.canMoveToPosition(board, 2,3, 0,4));
//        System.out.println(horse.canMoveToPosition(board, 2,3, 3,5));
//        System.out.println(horse.canMoveToPosition(board, 2,3, 1,5));
//        System.out.println(horse.canMoveToPosition(board, 2,3, 1,5));

        Bishop bishop = new Bishop("w");
        System.out.println(bishop.getClass().getName());
        Pawn pawnW = new Pawn("w");

        System.out.println(bishop.canMoveToPosition(board, 3,3, 3,3));
        System.out.println(bishop.canMoveToPosition(board, 3,3, 4,4));
        System.out.println(bishop.canMoveToPosition(board, 3,3, 7,7));
        System.out.println(bishop.canMoveToPosition(board, 3,3, 2,2));
        System.out.println(bishop.canMoveToPosition(board, 3,3, 0,0));
//        System.out.println(pawnW.canMoveToPosition(board,-1,0,0,0));
//        System.out.println(pawnW.canMoveToPosition(board,7,0,8,0));
//        System.out.println(pawnW.canMoveToPosition(board,0,0,0,1));
//        System.out.println(pawnW.canMoveToPosition(board,0,0,0,2));
//        System.out.println(pawnW.canMoveToPosition(board,0,0,1,0));
//        System.out.println(pawnW.canMoveToPosition(board,1,0,1,0));
//        System.out.println(pawnW.canMoveToPosition(board,1,0,2,0));
//        System.out.println(pawnW.canMoveToPosition(board,1,0,3,0));
//        System.out.println(pawnW.canMoveToPosition(board,1,0,4,0));
//        System.out.println(pawnW.canMoveToPosition(board,1,7,2,7));
//        System.out.println(pawnW.canMoveToPosition(board,1,7,3,7));
//        System.out.println(pawnW.canMoveToPosition(board,2,7,3,7));
//        System.out.println(pawnW.canMoveToPosition(board,2,7,4,7));
//        System.out.println(pawnW.canMoveToPosition(board,6,7,7,7));
//        System.out.println(pawnW.canMoveToPosition(board,6,7,8,7));
        Pawn pawnB = new Pawn("b");
//        System.out.println(pawnB.canMoveToPosition(board,7,7,8,7));
//        System.out.println(pawnB.canMoveToPosition(board,7,7,6,7));
//        System.out.println(pawnB.canMoveToPosition(board,7,7,6,8));
//        System.out.println(pawnB.canMoveToPosition(board,6,7,5,7));
//        System.out.println(pawnB.canMoveToPosition(board,6,7,4,7));
//        System.out.println(pawnB.canMoveToPosition(board,6,7,3,7));

        System.out.println(bishop.canMoveToPosition(board, 4,3, 3,4));
        System.out.println(bishop.canMoveToPosition(board, 4,3, 0,7));
        System.out.println(bishop.canMoveToPosition(board, 4,3, 5,2));
        System.out.println(bishop.canMoveToPosition(board, 4,3, 7,0));
        System.out.println(bishop.canMoveToPosition(board, 6,0, 7,1));
        System.out.println(bishop.canMoveToPosition(board, 6,0, 1,7));

        Rook rook = new Rook("w");
//        System.out.println(rook.canMoveToPosition(board,0,0,0,0));
//        System.out.println(rook.canMoveToPosition(board,0,0,1,0));
//        System.out.println(rook.canMoveToPosition(board,0,0,-1,0));
//        System.out.println(rook.canMoveToPosition(board,0,0,7,0));
//        System.out.println(rook.canMoveToPosition(board,7,0,5,0));
//        System.out.println(rook.canMoveToPosition(board,1,0,1,7));
//        System.out.println(rook.canMoveToPosition(board,1,7,1,3));
//        System.out.println(rook.canMoveToPosition(board,1,7,2,3));

        King king = new King("w");
//        System.out.println(king.canMoveToPosition(board,0,3,0,4));
//        System.out.println(king.canMoveToPosition(board,0,3,0,2));
        System.out.println(king.canMoveToPosition(board,0,3,0,3));
        System.out.println(king.canMoveToPosition(board,0,3,0,1));
        System.out.println(king.canMoveToPosition(board,0,3,0,5));
        System.out.println(king.canMoveToPosition(board,0,3,0,5));

        System.out.println(king.canMoveToPosition(board,3,3,4,2));
        System.out.println(king.canMoveToPosition(board,3,3,4,3));
        System.out.println(king.canMoveToPosition(board,3,3,4,4));
        System.out.println(king.canMoveToPosition(board,3,3,3,2));
        System.out.println(king.canMoveToPosition(board,3,3,3,4));
        System.out.println(king.canMoveToPosition(board,3,3,2,2));
        System.out.println(king.canMoveToPosition(board,3,3,2,3));
        System.out.println(king.canMoveToPosition(board,3,3,2,4));
        System.out.println(king.canMoveToPosition(board,3,3,5,3));
        System.out.println(king.canMoveToPosition(board,3,3,5,5));


    }
}
