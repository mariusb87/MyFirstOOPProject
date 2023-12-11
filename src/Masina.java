// clasele sunt niste matrite pentru obiecte
public class Masina {

// atribute sau campuri
    String marca;
    int anFabricatie;

// Constructori - conventie constructorii se pun intre campuri si metode
// -cum o sa fie definite obiectele
    public Masina() {
        marca = "BMW";
        anFabricatie = 2000;
    }

    public Masina(String marca, int anFabricatie) {
        this.marca = marca;
        this.anFabricatie = anFabricatie;
    }
// --- metode ---
    public int getAnFabricatie(){
        return  anFabricatie;
    }

}
