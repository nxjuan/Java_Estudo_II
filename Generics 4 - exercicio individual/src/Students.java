public class Students implements Comparable<Students>{

    private String nome;
    private Double nota;
    
    public Students(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getNota() {
        return nota;
    }
    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public int compareTo(Students o) {
        return nota.compareTo(o.getNota());
    }
}
