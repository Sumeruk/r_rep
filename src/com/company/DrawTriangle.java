package com.company;

public class DrawTriangle {
    public static String[][] drawTriangle(String[][] array, int depthOfRecursion) {
        String[][] newArray = makeNewArray(array);

        depthOfRecursion--;

        if (depthOfRecursion == 1) {
            return newArray;
        } else {
            return drawTriangle(newArray, depthOfRecursion);
        }
    }

    private static String[][] makeNewArray(String[][] array) {
        String[][] newArray = new String[array.length * 2][array[0].length * 2];

        int r = 0;
        int c = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length / 2; j++) {
                newArray[i][j] = " ";
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = array[0].length / 2; j < array[0].length + array[0].length / 2; j++) {
                if (newArray[i][j] == null) {
                    newArray[i][j] = array[r][c];
                    c++;
                    if (c == array[0].length) {
                        c = 0;
                        r++;
                        if (r == array.length) {
                            r = 0;
                            break;
                        }
                    }
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = array[0].length + array[0].length / 2; j < array[0].length * 2; j++) {
                newArray[i][j] = " ";
            }
        }

        for (int i = array.length; i < array.length * 2; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (newArray[i][j] == null) {
                    newArray[i][j] = array[r][c];
                    c++;
                    if (c == array[0].length) {
                        c = 0;
                        r++;
                        if (r == array.length) {
                            r = 0;
                            break;
                        }
                    }
                }
            }

        }

        for (int i = array.length; i < array.length * 2; i++) {
            for (int j = array[0].length; j < array[0].length * 2; j++) {
                if (newArray[i][j] == null) {
                    newArray[i][j] = array[r][c];
                    c++;
                    if (c == array[0].length) {
                        c = 0;
                        r++;
                        if (r == array.length) {
                            r = 0;
                            break;
                        }
                    }
                }
            }
        }

        return newArray;
    }

    public static String[][] drawFirstTriangle() {
        String[][] array = new String[2][4];

        array[0][0] = " ";
        array[0][1] = "/";
        array[0][2] = "\\";
        array[0][3] = " ";
        array[1][0] = "/";
        array[1][1] = "_";
        array[1][2] = "_";
        array[1][3] = "\\";

        return array;
    }
}
