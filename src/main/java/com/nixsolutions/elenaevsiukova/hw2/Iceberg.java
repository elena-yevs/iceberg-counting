package com.nixsolutions.elenaevsiukova.hw2;

/**
 * Айсберг состоит минимум из одного квадрата.
 *
 * <p>Айсберг растет, если другие квадраты - его соседи.
 */
final class Iceberg {

    private Square[] squares = new Square[10];
    private int count = 0;

    Iceberg(Square first) {
        add(first);
    }



}



