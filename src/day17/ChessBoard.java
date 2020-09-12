package day17;

import java.util.Arrays;

public class ChessBoard {

    ChessPiece[][] chess;

    public ChessBoard(ChessPiece[][] chess) {
        this.chess = chess;
    }

    public void print() {
        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {
                System.out.print(chess[i][j].getName());
            }
            System.out.println();
        }
    }
}
