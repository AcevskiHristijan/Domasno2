package domasno2;

public class Main {

    public static void main(String[] args) {

            Student a = new Student();
            a.setIme("Hristijan");
            a.setGodini(20);
            a.setPrezime("Acevski");
            a.setIndex("INKI644");

            Ocenka prva = new Ocenka();
            prva.setImeNaPredmet("Gimnastika");
            prva.setOcenka(7);
            prva.setDatumNaIspit("12.12.2012");
            a.setOcenka(prva);

            Ocenka vtora = new Ocenka();
            vtora.setImeNaPredmet("Rotokumbilacija");
            vtora.setOcenka(9);
            vtora.setDatumNaIspit("16.02.2012");
            a.setOcenka(vtora);

            Ocenka treta = new Ocenka();
            treta.setImeNaPredmet("Fizika");
            treta.setOcenka(7);
            treta.setDatumNaIspit("19.02.2012");
            a.setOcenka(treta);

            Ocenka cetvrta = new Ocenka();
            cetvrta.setImeNaPredmet("Matematika");
            cetvrta.setOcenka(6);
            cetvrta.setDatumNaIspit("26.02.2012");
            a.setOcenka(cetvrta);

            Ocenka posledna = new Ocenka();
            posledna.setImeNaPredmet("Geografija");
            posledna.setOcenka(10);
            posledna.setDatumNaIspit("23.02.2012");
            a.setOcenka(posledna);



            System.out.println(a);
            System.out.println("Prosek na studentot " + a.getIndex() +" = " + a.getProsek());


    }
}
