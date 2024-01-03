import java.util.ArrayList;
import java.util.List;

public class Venda<T> {
    
    List<T> list = new ArrayList<>();

    public void addElemen(T valor){
        list.add(valor);
    }

    public void print(){
        if(!list.isEmpty()){
            for(T i : list){
                System.out.print(i + " | ");
            }
        }
    }

}
