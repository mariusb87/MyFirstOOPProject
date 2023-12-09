public class Persoana {

    int varsta;
    String sex;
    String nume;
    String prenume;

    Persoana(){
        varsta = 20;
        sex = "M";
        nume = "Necunoscut";
        prenume = "Necunoscut";
    }

    public Persoana(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;
    }

    public Persoana(int varsta, String sex, String nume) {
        this.varsta = varsta;
        this.sex = sex;
        this.nume = nume;
    }
}
