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

        System.out.println(bishop.canMoveToPosition(board, 3,3, 3,3));
        System.out.println(bishop.canMoveToPosition(board, 3,3, 4,4));
        System.out.println(bishop.canMoveToPosition(board, 3,3, 7,7));
        System.out.println(bishop.canMoveToPosition(board, 3,3, 2,2));
        System.out.println(bishop.canMoveToPosition(board, 3,3, 0,0));

        System.out.println(bishop.canMoveToPosition(board, 4,3, 3,4));
        System.out.println(bishop.canMoveToPosition(board, 4,3, 0,7));
        System.out.println(bishop.canMoveToPosition(board, 4,3, 5,2));
        System.out.println(bishop.canMoveToPosition(board, 4,3, 7,0));
        System.out.println(bishop.canMoveToPosition(board, 6,0, 7,1));
        System.out.println(bishop.canMoveToPosition(board, 6,0, 1,7));
    }
}
