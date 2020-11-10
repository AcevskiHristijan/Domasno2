package domasno2;

import java.util.Arrays;

public class Student extends  Covek {
    private String index;
    private float prosek;
    private static int i = 0;
    private static final int brNaPredmeti = 5;
    Ocenka[] nizaOcenki = new Ocenka[brNaPredmeti];

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public void setOcenka(Ocenka o) {
        nizaOcenki[i] = o;
        Student.i++;

    }

    public Float getProsek() {
        int j = 0;
        while (j < i) {
            prosek += nizaOcenki[j].getOcenka();
            j++;
        }
        prosek /= i;
        return prosek;
    }

    @Override
    public String toString() {
        return "Student{ " +
                "ime='" + getIme() + '\'' +
                ", prezime='" + getPrezime() + '\'' +
                ", godini=" + getGodini() +
                ", index=" + getIndex() +
                '}' + '\'' +
                "\t" + Arrays.toString(nizaOcenki) +
                '}';
    }
}
