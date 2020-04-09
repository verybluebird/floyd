package com.company;


import java.util.Arrays;

class algotithm {
    public int[][] array;
    public int h = 7;

    algotithm() {
        array = new int[h][h];
        array[0][0] = 0;
        array[0][1] = 10000;
        array[0][2] = 23;
        array[0][3] = 10000;
        array[0][4] = 10000;
        array[0][5] = 66;
        array[0][6] = 10000;

        array[1][0] = 56;
        array[1][1] = 0;
        array[1][2] = 10000;
        array[1][3] = 54;
        array[1][4] = 10000;
        array[1][5] = 10000;
        array[1][6] = 34;

        array[2][0] = 10000;
        array[2][1] = 56;
        array[2][2] = 0;
        array[2][3] = 10000;
        array[2][4] = 10000;
        array[2][5] = 10000;
        array[2][6] = 10000;

        array[3][0] = 10000;
        array[3][1] = 10000;
        array[3][2] = 5;
        array[3][3] = 0;
        array[3][4] = 39;
        array[3][5] = 30;
        array[3][6] = 10000;

        array[4][0] = 34;
        array[4][1] = 10000;
        array[4][2] = 10000;
        array[4][3] = 10000;
        array[4][4] = 0;
        array[4][5] = 10000;
        array[4][6] = 46;

        array[5][0] = 10000;
        array[5][1] = 10000;
        array[5][2] = 73;
        array[5][3] = 31;
        array[5][4] = 19;
        array[5][5] = 0;
        array[5][6] = 4;

        array[6][0] = 10000;
        array[6][1] = 10000;
        array[6][2] = 10000;
        array[6][3] = 3;
        array[6][4] = 10000;
        array[6][5] = 43;
        array[6][6] = 0;
    }

    void print() {
        for (int[] ints : array) {
            System.out.println(Arrays.toString(ints));
        }
    }

    void floyd() {
        for (int j = 0; j < 6; j++) {
            for (int i = 0; i < 6; i++) {
                for (int k = 0; k < 6; k++) {
                    if (i != j && k != j) {
                        if (array[i][k] > array[i][j] + array[j][k]) {
                            array[i][k] = array[i][j] + array[j][k];
                        }
                    }

                }

            }

        }

    }
}

public class Main {

    public static void main(String[] args) {
        algotithm A = new algotithm();
        A.print();
        A.floyd();
        System.out.println(' ');
        A.print();

    }
}
