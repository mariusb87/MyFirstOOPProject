
public class Main {
    public static void main(String[] args) {
        Carte carte1 = new Carte();
        carte1.autor = "Mihai Eminescu";
        carte1.titlu = "Poezii";
        carte1.pret = 35;


        Carte carte2 = new Carte();
        carte2.autor = "Ion Creanga";
        carte2.titlu = "Amintiri din copilarie";



        System.out.println(carte1.getPret());
        System.out.println(carte1.afiseaza());

        System.out.println(carte2.getPret());
        System.out.println(carte2.afiseaza());

        carte1.titlu = "Basme"; // suprascriere
        System.out.println(carte1.afiseaza());

        Masina masina1 = new Masina();
        Masina masina2 = new Masina();
        System.out.println(masina1.marca);

        masina2.marca = "Dacia";
        System.out.println(masina2.marca);

// ------Exercitiu -------------------------

        Masina masina3 = new Masina();
        masina3.anFabricatie = 2010;

        Masina masina4 = new Masina();
        masina4.anFabricatie = 2020;

        System.out.println(masina3.getAnFabricatie());
        System.out.println(masina4.getAnFabricatie());

// ------- cu constructor -----------
        Persoana persoana1 = new Persoana();

        System.out.println(persoana1.nume);
        System.out.println(persoana1.prenume);

        Persoana persoana2 = new Persoana("Ion", "Popescu");
        System.out.println(persoana2.nume + persoana2.varsta + persoana2.sex);

        Persoana persoana3 = new Persoana(24,"M","Ionescu");
        System.out.println("Nume: "+ persoana3.nume);
        System.out.println("Varsta: "+ persoana3.varsta);
        System.out.println("Sex: "+ persoana3.sex);

        // Exercitii OOP

        Animal animal1 = new Animal();
        Animal animal2 = new Animal("Azorel");
        Animal animal3 = new Animal("Pisi", "gri");
        Animal animal4 = new Animal("Nemo", "rosu", true);

        animal1.mananca();
        animal1.doarme();

        animal2.mananca();
        animal2.doarme();

        animal3.mananca();
        animal3.doarme();

        animal4.mananca();
        animal4.doarme();
        System.out.println(animal4.afiseaza());


        // tema
        Animal caine= new Animal("Rex","neagra",false);
        Animal pisica = new Animal("Tom", "albastra",false);

        caine.mananca();
        caine.doarme();
        System.out.println(caine.afiseaza());

        pisica.mananca();
        pisica.doarme();
        System.out.println(pisica.afiseaza());


        // obiecte masina
        Masina masina5 = new Masina();
        System.out.println(masina5.marca);

        Masina masina6 = new Masina("Tesla",2022);
        System.out.println(masina6.marca+" "+ masina6.getAnFabricatie());

        // elev

        Elev elev1 = new Elev("Popescu");
        Elev elev2 = new Elev("Ionescu");

        System.out.println(elev1.nume);
        System.out.println(elev2.nume);
        elev1.diriginte = "Isoscel2";

        System.out.println(elev2.diriginte);
        // Static keyword - atribut comun tuturor obiectelor din aceasta clasa
        elev1.metodaNonStatica();
        Elev.metodaStatica();

        // incapsulare

        Film film1 = new Film();
        //film1.nume = "Titanic"; - nu se poate accesa direct doar prin setters and getters

        film1.setTitlu("Titanic");
        System.out.println(film1.getTitlu());

        //Abstraction and Inheritance and Polymorphism

        Inotator inotator1 = new Inotator();
        inotator1.seAntreneaza();
        inotator1.seOdihneste();

        Maratonist maratonist1 = new Maratonist();
        maratonist1.seAntreneaza();
        maratonist1.seOdihneste();

        // exercitii OOP - Mostenire

        Pisica pisica1 = new Pisica();
        Caine caine1 = new Caine();

        pisica1.scoateSunete();
        caine1.scoateSunete();


    }
}