package calkowitaLiczbaWszystkichZnakow;

import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        String zdanie =  "Zeby kozka nie skakala to by nozki nie zlamala";

        System.out.println("W nastepujacym zdaniue: " + zdanie);

        String[] zdanie1 = zdanie.split(" ");

        int ilosc = Arrays.stream(zdanie1)
                .mapToInt(String::length)
                .sum();

        System.out.println("calkowita liczba wszystkich znakow wynosi: " + ilosc + ".");
    }
}
