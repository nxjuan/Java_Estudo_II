public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("write");

        Venda<String> productName = new Venda<>();
        Venda<Double> productPrice = new Venda<>();

        productName.addElemen("Batata");
        productPrice.addElemen(4.99);

        productName.addElemen("Manga");
        productPrice.addElemen(7.49);

        productName.addElemen("Pessego");
        productPrice.addElemen(11.49);

        productName.print();
        System.out.println();
        productPrice.print();
    }
}
