package program;

import java.util.ArrayList;
import java.util.List;

import service.Circle;
import service.Rectangle;
import service.Shape;

public class Program {
    public static void main(String[] args) {
        List<Shape> list = new ArrayList<>();

        list.add(new Rectangle(3.0, 2.0));
        list.add(new Circle(2.0));
        System.out.println("total area: " + totalArea(list));
    }

    public static double totalArea(List<? extends Shape> lista){
        double sum = 0.0;

        for (Shape v : lista){
            sum += v.area();
        }
        return sum;
    }
}
