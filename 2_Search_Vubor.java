package com.javarush.task.GrokaemAlgoritmu;

/*
Задача №2 Сортировка выбором
 */

import java.util.Arrays;

public class ZadachaVroraya {

    public static int[] Massive = {66, 32, 9, 29, 7, 21, 95, 33, 29, 8, 98, 23, 85, 88, 582, -9, 42, 4, 96, 54};
    // основная
    public static void main(String[] args) {
    String vuvod = Arrays.toString(sortVubor(Massive));
    System.out.println(vuvod);

    }

    // метод сортировки выбором
    public static int[] sortVubor(int[] array) {


        int minIndex = 0;

        // внешний цикл сужает область поиска в массиве
        for (int i = 0; i < array.length - 1; i++) {
            int minElement = array[i];
            // внутренний проверяет элементы и находит минимальный
            for (int j = 1 + i; j < array.length; j++) {
                if (array[j] < minElement) {
                    minElement = array[j];
                    minIndex = j;
                }
            }
            // здесь меняем местами
            array[minIndex] = array[i]; // на индекс минимального значения кидаем текущий элемент внешнего цикла i
            array[i] = minElement; // в элемент внешнего массива кидаем минимальный элемент

        }
        return array;
    }


}
