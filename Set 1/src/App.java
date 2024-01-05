import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {

        //Hashset: mais rapido, mas não mantem a ordem dos indices
        Set<String> set1 = new HashSet<>();
        set1.add("TV");
        set1.add("Notebook");
        set1.add("Tablet");
        System.out.println(set1.contains("Notebook"));
        for (String p : set1) {
            System.out.println(p);
        }

        //TreeSet: Mais lento, mas orgniza os elementos do maior para o menor
        Set<String> set2 = new TreeSet<>();
        set2.add("TV");
        set2.add("Notebook");
        set2.add("Tablet");
        System.out.println(set2.contains("Notebook"));
        for (String p : set2) {
            System.out.println(p);
        }
        
        // LinkedHashSet: velocidade intermediária, mas coloca os itens na ordem em que foram inseridos
        Set<String> set3 = new LinkedHashSet<>();
        set3.add("TV");
        set3.add("Notebook");
        set3.add("Tablet");
        System.out.println(set3.contains("Notebook"));
        for (String p : set3) {
            System.out.println(p);
        }
    }
}
