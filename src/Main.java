/* Galina Krüger, qa36m
 Given an array arr[] of N elements, the challenge is to write
  function to find a given element x in arr[] .

Линейный поиск используется для поиска ключевого элемента
среди нескольких элементов.
Линейный поиск сегодня используется меньше, потому что он
медленнее, чем бинарный поиск и хеширование.

Алгоритм:

Шаг 1: Обход массива
Шаг 2: Сопоставьте ключевой элемент с элементом массива
Шаг 3: Если ключевой элемент найден, верните позицию индекса элемента массива.
Шаг 4: Если ключевой элемент не найден, верните -1
 */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] arr = new int[] {3,5,9,23,65,6,-7};

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        boolean flag = false;

        for (int i = 0; i < arr.length; i++) {
            if ( arr[i] == x){
                System.out.println(i);
                flag = true;
            }
        }
        if (!flag){
            System.out.println(-1);
        }
    }
}