import java.util.HashMap;
import java.util.Map;

public class MyHashMap {
    public static void main(String[] args) {

        HashMap <Integer, String> dictionarulNostru = new HashMap<>();
        dictionarulNostru.put(1,"First");
        dictionarulNostru.put(2,"Second");
        dictionarulNostru.put(3,"Third");
        dictionarulNostru.put(4,"Forth");
        //dictionarulNostru.replace(3,"Third-replace");
        System.out.println(dictionarulNostru.replace(3, "Third", "Third-Replace"));


        System.out.println(dictionarulNostru.get(3));
        System.out.println(dictionarulNostru.get(4));

        System.out.println(dictionarulNostru.keySet());
        System.out.println(dictionarulNostru.values());
        System.out.println(dictionarulNostru.size());
        dictionarulNostru.remove(3);
        System.out.println(dictionarulNostru.size());
        System.out.println(dictionarulNostru.entrySet());

        System.out.println(dictionarulNostru.containsKey(1));
        System.out.println(dictionarulNostru.containsValue("First"));

        for (int key:dictionarulNostru.keySet()){
            System.out.println(key);
        }

        for (String value:dictionarulNostru.values()){
            System.out.println(value);
        }

        // Exercitii Structyuri de date
        //Adaugati un dictionar nou cu numele studenti cu elemente key-value: numeStudent(String)-treceExamenul(Boolean).
        //Adaugati 5 elemente cu valori diferite.
        //Adaugati o metoda care sa afiseze doar studentii care trec examenul.

        HashMap<String, Boolean> studenti = new HashMap<>();
        studenti.put("Alin", true);
        studenti.put("George", false);
        studenti.put("Mihai", true);
        studenti.put("Raul", false);
        studenti.put("Bogdan", true);

        afisarePromovati(studenti);

    }

    public static void afisarePromovati(HashMap<String, Boolean> studenti) {
        for (Map.Entry<String, Boolean> student : studenti.entrySet()) {
            if (student.getValue()) {
                System.out.println(student.getKey() + " a trecut examenul.");
            }
        }
    }
}
