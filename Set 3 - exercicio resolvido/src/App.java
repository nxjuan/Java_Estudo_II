import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        
        String paths = "C:\\temp\\JavaEstudo2\\Set 3 - exercicio resolvido\\src";
        File path = new File(paths);

        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            Set<User> set = new HashSet<>();

            String line = br.readLine();

            System.out.println(line);
            
            while (line != null) {
                String[] fields = line.split(" ");
                set.add(new User(fields[0], Instant.parse(fields[1])));   

                line = br.readLine();
            }

            System.out.println("Total users:" + set.size());
            
        }catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
        }
    }
}
