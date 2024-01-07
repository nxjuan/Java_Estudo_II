import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {

        String path = "C:\\temp\\JavaEstudo2\\Map 3 - Exercicio proposto\\in.txt";
        Map<String, Integer> peoples = new HashMap<>();

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            while(line!=null){
                String[] fields = line.split(",");
                System.out.println(line);
                if(peoples.containsKey(fields[0])){
                    peoples.put(
                        fields[0], 
                        Integer.parseInt(fields[1]) + peoples.get(fields[0])
                    );
                }else{
                    peoples.put(
                        fields[0], 
                        Integer.parseInt(fields[1])
                    );
                }                
                System.out.println(line);
                line = br.readLine();
            }
            System.out.println();
            for (String key : peoples.keySet()){
                System.out.println(key + " " + peoples.get(key));
            }
        }catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
    }
}
