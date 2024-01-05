import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        Set<Integer> students = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        for(char let = 'a'; let <= 'c'; let+=1){

            System.out.print("How many students for course " + Character.toUpperCase(let) + "?: ");
            int n = sc.nextInt();
            for(int i = 0; i < n; i++){
                students.add(sc.nextInt());
            }
        }
        System.out.println("Total students: " + students.size());
        sc.close();
    }
}
