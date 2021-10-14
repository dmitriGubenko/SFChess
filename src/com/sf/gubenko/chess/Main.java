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

        Bishop bishop = new Bishop("b");
        System.out.println(bishop.getClass().getName());
        System.out.println(bishop.canMoveToPosition(board, 3,4, 2,5));
        System.out.println(bishop.canMoveToPosition(board, 3,4, 4,3));
        System.out.println(bishop.canMoveToPosition(board, 3,4, 7,0));
        System.out.println(bishop.canMoveToPosition(board, 3,4, 0,7));
        System.out.println(bishop.canMoveToPosition(board, 3,4, 2,3));
        System.out.println(bishop.canMoveToPosition(board, 3,4, 4,5));
        System.out.println(bishop.getClass().getName());
        System.out.println(bishop.canMoveToPosition(board, 3,3, 2,4));
        System.out.println(bishop.canMoveToPosition(board, 3,3, 4,2));
        System.out.println(bishop.canMoveToPosition(board, 3,3, 5,1));
        System.out.println(bishop.canMoveToPosition(board, 3,3, 1,5));
        System.out.println(bishop.canMoveToPosition(board, 3,3, 0,6));
        System.out.println(bishop.canMoveToPosition(board, 3,3, 4,4));
        System.out.println(bishop.canMoveToPosition(board, 3,3, 6,0));
        System.out.println(bishop.canMoveToPosition(board, 3,3, 6,1));
        //неверно!!
        System.out.println(bishop.canMoveToPosition(board, 3,3, 4,0));
        System.out.println(bishop.canMoveToPosition(board, 3,3, 0,4));
        System.out.println("====");
        System.out.println(bishop.canMoveToPosition(board, 1,5, 0,4));
        System.out.println(bishop.canMoveToPosition(board, 1,5, 0,6));
        System.out.println(bishop.canMoveToPosition(board, 1,5, 3,7));
        System.out.println(bishop.canMoveToPosition(board, 1,5, 3,3));
        //неверно
        System.out.println(bishop.canMoveToPosition(board, 1,5, 2,2));
        System.out.println("====");
        System.out.println(bishop.canMoveToPosition(board, 1,4, 0,3));
        System.out.println(bishop.canMoveToPosition(board, 1,4, 4,7));
        System.out.println(bishop.canMoveToPosition(board, 1,4, 0,5));
        System.out.println(bishop.canMoveToPosition(board, 1,4, 5,0));
        System.out.println(bishop.canMoveToPosition(board, 1,4, 2,3));
        System.out.println(bishop.canMoveToPosition(board, 1,4, 2,5));
        //неверно
        System.out.println(bishop.canMoveToPosition(board, 1,4, 7,0));
        System.out.println(bishop.canMoveToPosition(board, 1,4, 0,7));




    }
}
