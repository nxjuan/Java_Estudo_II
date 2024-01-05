public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        //instanciando 2 objetos com o mesmo valor
        Client cliente1 = new Client("Maria", "maria@gmail.com");
        Client cliente2 = new Client("Maria", "maria@gmail.com");

        //gerando o hashcode dos objetos para verificar se são iguais
        System.out.println(cliente1.hashCode());
        System.out.println(cliente2.hashCode());
        System.out.println(cliente1.hashCode() == cliente2.hashCode());

        // verifica se os valores são iguais usando equals
        System.out.println(cliente1.equals(cliente2));

        // Comparando os objetos usando operadores
        System.out.println(cliente1 == cliente2);

        // Comparando dois elementos instanciados literalmente
        String s1 = "teste";
        String s2 = "teste";

        System.out.println(s1 == s2);

        //comparando dois elementos instanciados como objetos
        String str1 = new String("teste");
        String str2 = new String("teste");

        System.out.println(str1 == str2);
    }
}
