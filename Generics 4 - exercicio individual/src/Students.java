import java.util.ArrayList;
import java.util.List;

public class Students<T> {

    List<T> student = new ArrayList<>();

    public void addElement(T aluno){
        student.add(aluno);
    }

    public List<T> getStudenList(){
        return student;
    }

}
