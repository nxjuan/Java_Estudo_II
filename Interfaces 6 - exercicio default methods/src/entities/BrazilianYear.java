package entities;

public class BrazilianYear implements YearOfDrive{
    private int idade;

    public BrazilianYear(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return yearOfDrive(idade)? "true" : "false";
    }

    
}
