package com.nixsolutions.elenaevsiukova.hw2;

public class Test {

    public static void main(String[] args) {
        Test test = new Test();
        //test.neighbours();
        test.isIceberg(4, 6, 0);
    }

    void neighbours() {
        twoNeighbours(0, 0, 1, 0);
        twoNeighbours(1, 1, 1, 0);
        twoNeighbours(0, 0, 0, 2);
        twoNeighbours(0, 0, 1, 1);
        twoNeighbours(0, 0, 0, -1);
        twoNeighbours(3, 5, 4, 5);
        twoNeighbours(100, 100, 200, -100);
    }

    void twoNeighbours(int x1, int y1, int x2, int y2) {
        Square square2 = new Square(x1, y1);
        Square square1 = new Square(x2, y2);
        boolean result = square1.isNeighbour(square2);

        System.out.printf("(%d, %d) and (%d, %d) neighbors? = %b.%n", x1, y1, x2, y2, result);
    }

    boolean isIceberg(int x, int y, int value) {
        Iceberg iceberg = new Iceberg(2, 5, 1);
        if (iceberg.value == 1) {
            System.out.println("iceberg");
            return true;
        }
        System.out.println("not iceberg");
        return false;
    }

}
