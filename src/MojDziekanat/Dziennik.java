package MojDziekanat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.prefs.PreferencesFactory;

public class Dziennik extends Student {

    public static int[] oceny = new int[3];
    public Przedmiot przedmiot[] = new Przedmiot[3];


    public Dziennik() {
    }


    public Dziennik(String imie, String nazwisko, Kierunek kierunek, Przedmiot[] przedmiot, int[] oceny) {
        super(imie, nazwisko, kierunek);
        this.przedmiot = przedmiot;
        this.oceny = oceny;

    }



    public static ArrayList<Dziennik> ocenyStudentow = new ArrayList<>();


    public static void ocenyStudentowVoid () {

        Dziennik newDziennik = new Dziennik();

        for (Student stud : studenci) {

            newDziennik.setImie(stud.getImie());
            newDziennik.setNazwisko(stud.getNazwisko());
            newDziennik.setKierunek(stud.getKierunekEnum());

            if (stud.getKierunek().equals("Informatyka")) ;
            {
                newDziennik.przedmiot[0] = Przedmiot.Analiza;
                newDziennik.przedmiot[1] = Przedmiot.Informatyka;
                newDziennik.przedmiot[2] = Przedmiot.Podstawy_Programownia;
            }
            if (stud.getKierunek().equals("Zarzadzanie")) {
                newDziennik.przedmiot[0] = Przedmiot.Astronomia;
                newDziennik.przedmiot[1] = Przedmiot.Matematyka;
                newDziennik.przedmiot[2] = Przedmiot.Zarzadzanie;
            } else {
                newDziennik.przedmiot[0] = Przedmiot.Polski;
                newDziennik.przedmiot[1] = Przedmiot.Angielski;
                newDziennik.przedmiot[2] = Przedmiot.Matematyka;
            }
            for (int i = 0; i < oceny.length; i++) {
                int min = 2;
                int max = 5;
                Random random = new Random();


                int randomowa = random.nextInt(max - min) + min;


                newDziennik.oceny[i] = randomowa;
            }
            ocenyStudentow.add(newDziennik); // nowa lista stworzona czesciowo ze starej Arraylist i czesciowo z tego co wyzej czyli oceny, kierunek, imie, nazwisko
        }

            }

    @Override

    public String toString() {
        return "Student = { imie: "+ imie + " ,nazwisko: " + nazwisko +  " ,kierunek: " + kierunek + " ,przedmiot: " + Arrays.toString(przedmiot) + " ,oceny: " + Arrays.toString(oceny) + " }\n"; //new lin
    }

    public static void wyswietlOceny()
    { for (Dziennik dz: ocenyStudentow) {
        if(ocenyStudentow.size() !=0) {
            System.out.println(dz);
        }
        else { System.out.println("Lista jest pusta!"); }

        }
    }
}


