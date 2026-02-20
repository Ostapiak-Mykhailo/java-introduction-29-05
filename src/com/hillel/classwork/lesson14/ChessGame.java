package com.hillel.classwork.lesson14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ChessGame {
    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        List<ChessItem> chessItems = new ArrayList<>();
        String input;
        while (!(input = READER.readLine()).equals("stop")) {
            chessItems.add(createChessItem(input));
        }
        drawChessItem(chessItems);

        ChessBoard chessBoard = new ChessBoard(); // при імплементації інтерфейсу ми можем використовувати
                                                // цей інтерфейс як тип даних
        draw(chessBoard);

    }

    public static ChessItem createChessItem(String chessItemName) throws IOException {
        System.out.println("input chess item name");
        switch (chessItemName){
            case "pawn":
            return new Pawn();
            case "queen":
            return new Queen();
            case "king":
            return new King();
            default:
                throw new IllegalArgumentException("unknown chess item " + chessItemName);
        }
    }

    private static void draw(Drawable drawable){ // Якщо ми написали метод в якому визначили параметр в
        drawable.draw(); // вигляді ІНТЕРФЕЙСА (тип даних - інтерфейс) то сюди ми можемо передавати все що імплементує
        // цей інтерфейс. Метод стає універсальним для ВСІХ типів даних які імплементують цей інтерфейс!!!
    }

    private static void drawChessItem(List<ChessItem> chessItems) {
        for (ChessItem chessItem : chessItems) {

            /*if (chessItem instanceof Drawable){
                Drawable drawableItem = chessItem;
                drawableItem.draw();
            }*/
            draw(chessItem);
        }
    }
}
