import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        
        Students<String> nome = new Students<>();
        Students<Double> nota = new Students<>();

        nome.addElement("Pedro Loos");
        nota.addElement(9.4);        

        nome.addElement("Renato Albani");
        nota.addElement(4.1);

        nome.addElement("Boca de 09");
        nota.addElement(1.3);

        nome.addElement("Carlos Maia");
        nota.addElement(6.8);

        nome.addElement("Leticia Eccel");
        nota.addElement(9.6);

        nome.addElement("Juan Nogueira");
        nota.addElement(8.5);

        SchoolSystem.OrderStudents(nome.getStudenList(), nota.getStudenList());

         List<String> nomesOrdenados = nome.getStudenList();
        List<Double> notasOrdenadas = nota.getStudenList();

        for (int i = 0; i < nomesOrdenados.size(); i++) {
            System.out.println(nomesOrdenados.get(i) + " - Nota: " + notasOrdenadas.get(i));
        }

    }
}
