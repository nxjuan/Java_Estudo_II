import java.util.List;

public class SchoolSystem{

    public static <T extends Comparable<T>> void OrderStudents(List<String> names, List<T> notas){
        int n = notas.size();
        boolean troca;

        do {
            troca = false;
              
            for (int i = 0; i < n - 1; i++) {
                if (notas.get(i).compareTo(notas.get(i + 1)) < 0) {
                    // Trocar os elementos se as notas estiverem fora de ordem
                    T tempGrade = notas.get(i);
                    notas.set(i, notas.get(i + 1));
                    notas.set(i + 1, tempGrade);

                    String tempName = names.get(i);
                    names.set(i, names.get(i + 1));
                    names.set(i + 1, tempName);

                    troca = true;
                }
            }

        } while (troca);   
    }
}
