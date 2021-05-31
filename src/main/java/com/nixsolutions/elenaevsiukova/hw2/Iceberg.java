package com.nixsolutions.elenaevsiukova.hw2;

import java.util.Arrays;

/**
 * Айсберг состоит минимум из одного квадрата.
 *
 * <p>Айсберг растет, если другие квадраты - его соседи.
 */
final class Iceberg {

    /**
     * Первоначальный размер массива квадратов и дельта приращения массива, при его наполнении.
     */
    private static final int GROWTH = 10;

    private Square[] squares = new Square[GROWTH];
    private int count = 0;

    Iceberg(Square first) {
        add(first);
    }

    private void add(Square square) {
        if (count == squares.length) {
            grow();
        }
        squares[count] = square;
        count++;
    }

    private void grow() {
        int newLength = squares.length + GROWTH;
        Square[] newSquares = Arrays.copyOf(squares, newLength);
        squares = newSquares;
    }
}



