public class Inotator extends Sportiv{

    public Inotator(String tara, String sport) {
        super(tara, sport);
    }

    @Override
    void seAntreneaza() {
        System.out.println("Inotatorul din "+ tara + " se antreneaza la "+ sport);
    }


    @Override
    public void seOdihneste() {
        System.out.println("Inotatorul se odihneste");
    }
}
