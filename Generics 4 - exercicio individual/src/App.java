import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        
        List<Students> list = new ArrayList<>();

        list.add(new Students("Pedro Loos", 8.6));
        list.add(new Students("Carlos Maia", 6.9));
        list.add(new Students("Daniel Riciardo", 9.4));

        Students best = SchoolSystem.OrderStudents(list);
        
        System.out.println("Best Student:");
        System.out.println(best.getNome() + " - " + best.getNota());

    }
}
