package MojDziekanat;

public class MojDziekanat {

    public static void main(String[] args) {
        // TODO code application logic here

       // Student.zarejestrjStudenta();

       // int [] xyz  = new int [16];

       // Dziennik.setOceny(xyz);

        Dziennik.ocenyStudentowVoid();

        System.out.println(Dziennik.ocenyStudentow.size());
        Student.wyswietlStudentow();
        Dziennik.wyswietlOceny();
    }
}
