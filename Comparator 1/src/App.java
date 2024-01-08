import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));

		Comparator<Product> compare = new Comparator<Product>(){

			@Override
			public int compare(Product o1, Product o2) {
				return o1.getName().toUpperCase().compareTo(o2.getName().toUpperCase());
			}
			
		};

	list.sort(compare);

		for (Product p : list) {
			System.out.println(p);
		}
	}
}
