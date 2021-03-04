package MojDziekanat;

import java.util.Scanner;

public class Menu implements Comparable <Osoba> {


    public static void menu() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Wybierz sekcję, do której checesz przejść: ");
        System.out.println("1 - Studenci");
        System.out.println("2 - Wykładowcy");
        System.out.println("3 - eIndeks");
        System.out.println("Podaj liczbę");
        int x = scan.nextInt();

        if (x == 1) {
            System.out.println("1 - Podaj ilość studentów na uczelni");
            System.out.println("2 - Podaj ilość studentów na danym kierunku");
            System.out.println("3 - Podaj ilość studentów na danym roku");
            System.out.println("4 - Podaj ilość studentów na danym kierunku i roku");
            System.out.println("5 - Wyszukaj studenta po nazwisku");
            System.out.println("6 - Wyszukaj studenta po adresie");
        }


    }

    @Override
    public int compareTo(Osoba o) {

        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


