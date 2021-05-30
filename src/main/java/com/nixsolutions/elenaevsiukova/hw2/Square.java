package com.nixsolutions.elenaevsiukova.hw2;

final class Square {
    private final int x;
    private final int y;

    /**
     * Создает квадрат по координатам.
     */
    Square(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Проверяет являются ли квадраты соседями.
     *
     * <p>Квадраты являются соседями, если одна из координат отличается на единицу,
     * а другие координаты равны.
     */
    boolean isNeighbour(Square square) {
        int distanceX = Math.abs(x - square.x);
        int distanceY = Math.abs(y - square.y);
        return distanceX == 1 || distanceY == 1;
    }
}


