package com.sf.gubenko.chess;

public class Main {
    public static void main(String[] args) {
        ChessBoard board = new ChessBoard("w");
        Horse horse = new Horse("w");
        System.out.println(horse.canMoveToPosition(board, 2,3, 1,1));
        System.out.println(horse.canMoveToPosition(board, 2,3, 3,1));
        System.out.println(horse.canMoveToPosition(board, 2,3, 4,4));
        System.out.println(horse.canMoveToPosition(board, 2,3, 0,4));
        System.out.println(horse.canMoveToPosition(board, 2,3, 3,5));
        System.out.println(horse.canMoveToPosition(board, 2,3, 1,5));
        System.out.println(horse.canMoveToPosition(board, 2,3, 1,5));



    }
}
