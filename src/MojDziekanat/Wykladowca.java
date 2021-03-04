package MojDziekanat;

public class Wykladowca extends Osoba{
    Przedmiot przedmiot;

    Wykladowca (String imie, String nazwisko, Plec Plec, Integer wiek, Long pesel, String adres, Przedmiot przedmiot){
        super(imie, nazwisko, Plec, wiek, pesel, adres);

        this.przedmiot = przedmiot;
    }

    public String getPrzedmiot(){
        return przedmiot.toString();
    }

}

