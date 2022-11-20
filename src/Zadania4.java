import jdk.incubator.vector.VectorOperators;

import java.util.Scanner;

public class Zadania4 {


   // public static int generateInt(int a, int b);
    // result = (int)(a + Math.random() * (b - a));
        //System.out.println(result);
//return result


    public static void main(String[] args) {
       // zadanie1();
        zadanie4();
    }

    private static void zadanie1() {
        boolean czyPada;
        boolean czySwieciSlonce;
        czyPada=true;
        czySwieciSlonce=false;
        if (czyPada == true && czySwieciSlonce == false) {
            System.out.println("plucha");
        }
        if (czyPada == true && czySwieciSlonce == true) {
            System.out.println("tęcza");
        }
        if (czyPada == false && czySwieciSlonce == true) {
            System.out.println("słonecznie");
        }
        if (czyPada == false && czySwieciSlonce == false) {
            System.out.println("pochmurno");
        }
    }

    private static void zadanie4() {
        String a = odczytajWierszzKonsoli("Podaj pierwszą liczbę: ");
        String b = odczytajWierszzKonsoli("Podaj druga liczbe: ");
        int pierwszaLiczba = Integer.parseInt(a);
        int drugaLiczba = Integer.parseInt(b);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj operacje jaka chcesz wykonac: ");







    }

    private static String odczytajWierszzKonsoli(String wiadomosc) {
        System.out.println(wiadomosc);
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        System.out.println("Pierwsza liczba to: " + a);
        return a;
    }
}
