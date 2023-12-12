public class Elev {
    String nume = "Isoscel";
    static String diriginte; // atribut comun tuturor obiectelor din aceasta clasa

    public Elev(String nume) {
        this.nume = nume;
    }

    public void metodaNonStatica(){
        System.out.println("metoda non statica");
    }

    public static void metodaStatica(){
        System.out.println("metoda statica");
    }
}
