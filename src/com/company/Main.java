package com.company;

public class Main {

    public static void main(String[] args) {

        String[] array = new String[]{"Без", "труда", "не", "вытащить", "рыбку", "из", "пруда"};
        String str = adding(array);
        String st = recursiv(array, 0, "");
        System.out.println(str);
    }

    static String adding(String[] array) {
        String str = "";
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                str = str.concat(array[i] + ".");
            } else {
                str = str.concat(array[i] + " ");
            }
        }
        return str;
    }
    static String recursiv(String[] array, int count, String str) {
        if (count < array.length) {
            if (count == array.length - 1) {
                str = str.concat(array[count] + ".");
            } else {
                str = str.concat(array[count] + " ");
            }
            count++;
            return recursiv(array, count, str);
        }
        return str;
    }
}

