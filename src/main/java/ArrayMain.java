/*
Dodatkowe zadania - dodatkowo napisz testy do tych metod
Zadanie
Utwórz metodę, która jako parametr przyjmuje tablicę i zwraca sumę wszystkich elementów
Zadanie
Utwórz metodę, która jako parametr przyjmuje tablicę i zwraca średnią wszystkich elementów
Zadanie
Utwórz metodę, która przyjmuje dwa parametry - tablicę oraz liczbę. Metoda ma zwrócić informację czy dana liczba znajduje się w tablicy.
 */


public class ArrayMain {
    public static void main(String[] args) {
        int[] array = {1,5,4,2,9,1,3};
        System.out.println(ArrayMethods.sumOfArrayElements(array));
        System.out.println(ArrayMethods.avgOfArrayElements(array));
        System.out.println(ArrayMethods.isElementInArray(array,2));

    }
}
