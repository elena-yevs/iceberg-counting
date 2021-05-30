package com.nixsolutions.elenaevsiukova.hw2;

import java.util.Arrays;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.stream.IntStream;

public class Main {
    // private static final Logger LOG = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        /**
         * A part of the sea where the number of icebergs will be counted.
         */
        int[][] sea = {{1, 0, 0, 0, 0, 0},
                {1, 1, 0, 0, 1, 0},
                {0, 0, 0, 0, 0, 1},
                {1, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 1, 1}};
        Arrays.deepToString(sea); //массив выводится в строку
        //field.countIcebergs(sea);

        Square square=new Square(0,0);



    }


}
