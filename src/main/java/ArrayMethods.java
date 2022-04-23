/*
Dodatkowe zadania - dodatkowo napisz testy do tych metod
Zadanie
Utwórz metodę, która jako parametr przyjmuje tablicę i zwraca sumę wszystkich elementów
Zadanie
Utwórz metodę, która jako parametr przyjmuje tablicę i zwraca średnią wszystkich elementów
Zadanie
Utwórz metodę, która przyjmuje dwa parametry - tablicę oraz liczbę. Metoda ma zwrócić informację czy dana liczba znajduje się w tablicy.
 */

import static java.lang.Math.*;

public class ArrayMethods {


    static int sumOfArrayElements(int[] array) {
        int counter = 0;
        for (int element : array) {
            counter += element;
        }
        return counter;
    }

    static double avgOfArrayElements(int[] array) {
        int sum = sumOfArrayElements(array);
        double avg = round(((double)sum / array.length) * 1000.0) / 1000.0;
        return avg;
    }

    static boolean isElementInArray(int[] array, int number) {
        for (int element : array) {
            if(element == number) {
                return true;
            }
        }
        return false;
    }
}


