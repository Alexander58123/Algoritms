package com.javarush.task.GrokaemAlgoritmu;


import java.util.Scanner;


public class Zadacha1_Sam {

    /*
    Алгоритм: бинарный поиск
    - Создание массива
    - Заполнение значениями
    - алгоритм поиска (бинарный)
     */

    static int left = 0; // левая граница
    static int right = 0; // правая граница
    static int mid = 0; // середина

    public static void main(String[] args) {

        System.out.println("Какой размерности будет массив");
        System.out.println("Введите число");
        Scanner vvod = new Scanner(System.in);
        int razmer = vvod.nextInt();

        // создали массив с заданной размерностью
        int[] Massive = new int[razmer];

        for (int i = 0; i < Massive.length; i++) {
            System.out.print("Элемент массива " + i + " = ");
            Massive[i] = vvod.nextInt();
        }


        // вывод текущего массива
        for (int i = 0; i < Massive.length; i++) {
            System.out.print(Massive[i] + " ");
            System.out.println();
        }

        // вызов метода и ввод параметров
        binarySearch(Massive, 77);

    }


    public static int binarySearch(int[] Massive, int iskomoeChislo) {

        right = Massive.length;
        boolean flag = false;

        while (left <= right ) {
            mid = (left + right) / 2;

            if (iskomoeChislo == Massive[mid]) { // когда нашли элемент

                flag = true;
                break;
            }

            if (Massive[mid] < iskomoeChislo) {
                left = mid + 1;
            } else { // когда на середине больше число
                right = mid - 1;
            }
        }

        if (flag) {
            System.out.println("Позиция массива найдена - " + mid + " под этой позицией " + Massive[mid]);
        } else
            System.out.println("Элемента " + iskomoeChislo + " нет в массиве");

        return mid;
    }

}
