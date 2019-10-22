public class JavaTraider {

    public static void main(String[] args) {
        // instantieer twee Aandelen objecten
        Aandelen amazon = new Aandelen("ORCL", 300);
        Aandelen oracle = new Aandelen("AMZN");

        // wijs waardes toe aan de Aandelen via een methode
        amazon.koop(100);
        oracle.koop(200);
        oracle.koop(200);

        // druk de waarden af met toString()
        System.out.println(amazon.toString());
        System.out.println(oracle.toString());
    }
}
