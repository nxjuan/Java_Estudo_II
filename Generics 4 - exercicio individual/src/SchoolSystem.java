import java.util.List;

public class SchoolSystem implements Comparable<SchoolSystem>{

    public static <T extends Comparable<T>> T OrderStudents(List<T> list){
        if(list.isEmpty()){
            throw new IllegalStateException("This list can't be empty");
        }

        T max = list.get(0);

        for(T item : list){
            if(item.compareTo(max) > 0){
                max = item;
            }
        }

        return max;        
    }

    @Override
    public int compareTo(SchoolSystem o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }
}
