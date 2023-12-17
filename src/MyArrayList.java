import java.util.ArrayList;

public class MyArrayList {

    public static void main(String[] args) {

        ArrayList<String> listaNoastra = new ArrayList<>();
        listaNoastra.add("First");
        listaNoastra.add("Second");
        listaNoastra.add("Third");
        listaNoastra.set(0,"First-replaced");

        listaNoastra.remove(2);

        for (String element:listaNoastra) {
            System.out.println(element);
        }

        System.out.println(listaNoastra.size());

        System.out.println(listaNoastra.contains("Second"));
        System.out.println(listaNoastra.indexOf("Second"));

        // Exercitii - Structuri de date
        //Adaugati o lista de cursuri cu elementele: Testare manuala, Testara automata, Front-end, Java.
        //Afisati elementul de pe a doua pozitie si lungimea listei.
        //Scrieti o metoda care afiseaza toate elementele.

        ArrayList<String> cursuri = new ArrayList<>();
        cursuri.add("Testare manuala");
        cursuri.add("Testare automata");
        cursuri.add("Front-end");
        cursuri.add("Java");

        System.out.println(cursuri.get(1));
        System.out.println(cursuri.size());

        afisareLista(cursuri);

    }

    public static void afisareLista(ArrayList<String> lista){
        for (String element:lista){
            System.out.println(element);
        }
    }

}
