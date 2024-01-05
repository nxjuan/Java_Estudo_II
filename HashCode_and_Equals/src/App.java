public class App {

    public static void main(String[] args) throws Exception {

        //EQUALS()
        String a = "Maria";
        String b = "Alex";
        String c = "Alex";
        System.out.println(a.equals(b));
        System.out.println(b.equals(c));
        System.out.println(a.equals(a));

        //HASHCODE()
        String d = "Maria";
        String e = "Alex";
        System.out.println(d.hashCode());
        System.out.println(e.hashCode());
    }
}
