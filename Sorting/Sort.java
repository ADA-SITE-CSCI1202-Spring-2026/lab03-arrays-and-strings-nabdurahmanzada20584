package Sorting;

import java.util.Arrays;

public class Sort {

    public static String[] Sort(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].compareTo(arr[j]) > 0) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        String[] arr = {"Baku", "Ganja", "Sumqayit", "Lankaran", "Barda"};

        System.out.println(Arrays.toString(Sort(arr)));
    }
}
