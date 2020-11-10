package domasno2;

import java.util.Date;

public class Ocenka {
    private String imeNaPredmet;
    private String datumNaIspit;
    private int ocenka;

    public String getImeNaPredmet() {
        return imeNaPredmet;
    }

    public void setImeNaPredmet(String imeNaPredmet) {
        this.imeNaPredmet = imeNaPredmet;
    }

    public String getDatumNaIspit() {
        return datumNaIspit;
    }

    public void setDatumNaIspit(String datumNaIspit) {
        this.datumNaIspit = datumNaIspit;
    }

    public int getOcenka() {
        return ocenka;
    }

    public void setOcenka(int ocenka) {
        this.ocenka = ocenka;
    }


    @Override
    public String toString() {
        return "Ocenka{" +
                "imeNaPredmet='" + imeNaPredmet + '\'' +
                ", datumNaIspit='" + datumNaIspit + '\'' +
                ", ocenka=" + ocenka +
                '}';
    }
}
