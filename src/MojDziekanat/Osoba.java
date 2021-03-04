package MojDziekanat;

public class Osoba {

    String imie;
    String nazwisko;
    Enum plec;
    Integer wiek;
    Long pesel;
    String adres;

    public Osoba(String imie, String nazwisko, Plec Plec, Integer wiek, Long pesel, String adres) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.plec = plec;
        this.wiek = wiek;
        this.pesel = pesel;
        this.adres = adres;
    }

    public Osoba() {

    }

    public Osoba(String imie, String nazwisko) {

    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getPlec() {
        return plec.toString();
    }

    public Integer getWiek() {
        return wiek;
    }

    public Long getPesel() {
        return pesel;
    }

    public String getAdres() {
        return adres;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setPlec(Plec plec) {
        this.plec = plec;
    }

    public void setWiek(Integer wiek) {
        this.wiek = wiek;
    }

    public void setPesel(Long pesel) {
        this.pesel = pesel;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    @Override

    public String toString() {
        return "Student = { " + "imie: " + imie + ", nazwisko: " + nazwisko + ", pesel: " + pesel + ", płeć: " + plec + "wiek: " + wiek + ", adres: " + adres +
                " }\n"; //new lin
    }
}

