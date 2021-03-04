package MojDziekanat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Student extends Osoba {

    Kierunek kierunek;
    Integer rok;


    public Student(String imie, String nazwisko, Plec plec, Integer wiek, Long pesel,
                   String adres, Kierunek kierunek, Integer rok) {
        super(imie, nazwisko, plec, wiek, pesel, adres);

        this.kierunek = kierunek;
        this.rok = rok;
    }

    Student() {

    }

    public Student(String imie, String nazwisko, Kierunek kierunek) {

        super(imie, nazwisko);
        this.kierunek = kierunek;
    }


    public String getKierunek() {
        return kierunek.toString();
    }

    public Kierunek getKierunekEnum() {
        return kierunek;
    }

    public String getPlec() {
        return plec.toString();
    }


    public Integer getRok() {
        return rok;
    }

    public void setKierunek(Kierunek kierunek) {
        this.kierunek = kierunek;
    }

    public void setPlec(Plec plec) {
        this.plec = plec;
    }

    public void setRok(Integer rok) {
        this.rok = rok;
    }

    public static ArrayList<Student> studenci = new ArrayList<>(Arrays.asList(

            new Student("Kuba", "Jarek", Plec.Mezczyzna, 18, 71616126626L, "nielany", Kierunek.Informatyka, 2),
            new Student("su", "per", Plec.Kobieta, 18, 89548464L, "wwa", Kierunek.Filologia, 2),
            new Student("wa", "krzy", Plec.Mezczyzna, 18, 715418164L, "opole", Kierunek.Filologia, 2)
    ));

    //  public static String jakaPlec() {
    // System.out.println("xyz");
    // return "BLA";
    //}
    //  public static String = jakaPlec() {

    // }

    static Plec plec;

    {

        plec = plec.Kobieta;
    }


    public static void zarejestrjStudenta() {

        Student nowyStudent = new Student(); // konstruktor studenta

        Scanner scan = new Scanner(System.in); //scaner dla metody

        System.out.println("Wprowadź nowego studenta:");
        System.out.println("Imię: ");
        nowyStudent.setImie(scan.nextLine());
        System.out.println("Nazwisko: ");
        nowyStudent.setNazwisko(scan.nextLine());
        System.out.println("Plec: ");
        String plecForEnum = scan.nextLine();
        Plec plecToEnum = Plec.valueOf(plecForEnum);
        nowyStudent.setPlec(plecToEnum);
        System.out.println("Wiek: ");
        nowyStudent.setWiek(scan.nextInt());
        scan.nextLine(); // zabiera enter
        System.out.println("Pesel: ");
        nowyStudent.setPesel(scan.nextLong());
        scan.nextLine();
        System.out.println("Adres: ");
        nowyStudent.setAdres(scan.nextLine());
        System.out.println("Kierunek: (Informatyka, Zarzadzanie, Filologia) ");
        String kierunekForEnum = scan.nextLine();
        Kierunek kierunekToEnum = Kierunek.valueOf(kierunekForEnum);
        System.out.println("Rok studiów: ");
        nowyStudent.setRok(scan.nextInt());
        scan.nextLine();

        studenci.add(nowyStudent); //wszystkie wpisane wartości będą dodane do listy studentow

    }


    public static void wyswietlStudentow() {
        int a = 0; // counter, liczy studentow
        if (!studenci.isEmpty()) { //if lista rozna 0
            System.out.println("Lista studentów na uczelni: ");
            for (Student studenci : studenci) {
                System.out.println(studenci.toString());
                a++;
            }
            System.out.println("Ilość studentów na uczekni: " + a); // wykorzystuje counter
        } else {
            System.out.println("W sytemie nie ma wprowadzonch studentów!"); //w przypadku kiedy liste jest pusta
        }
    }


    public static void studenciNaKierunku() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Z jakiego kierunu studentów chcesz wyświetlić: ");
        String kierunekFiltr = scan.nextLine();
        int b = 0;

        if (!studenci.isEmpty()) { //if lista rozna 0
            System.out.println("Lista studentów na uczelni, na kierunku " + kierunekFiltr + ": ");
            for (Student studenci : studenci) {
                if (studenci.getKierunek().equals(kierunekFiltr)) {//porownanie kierunek filtr do kierunku studenta
                    System.out.println(studenci.toString());
                    b++;
                } else {
                    System.out.println("Nie ma obecnie studentów na tym kierunku");
                }
            }


        }
    }

    public static void studenciNaRoku() {
        //Scanner scan = new Scanner(System.in);

    }

    public String toString() {
        return "Student = { " + "imie: " + imie + ", nazwisko: " + nazwisko + ", pesel: " + pesel + ", płeć: " + plec + "wiek: " + wiek + ", adres: " + adres +
                ", rok studiów: " + rok + ", kierunek:" + kierunek + " }\n"; //new lin
    }
}
