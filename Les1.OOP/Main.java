import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // BottleOfVatter b = new BottleOfVatter(123, "123", 1);
        // System.out.println(b);

        List<Product> productList = new ArrayList<>();

        // productList.add(new BottleOfVatter(123, "qwe", 100));
        // productList.add(new BottleOfVatter(200, "qwe", 150));
        // productList.add(new BottleOfVatter(500, "zxcg", 1000));
        // productList.add(new BottleOfVatter(123, "qaffwe", 10));

        productList.add(new HotDrink(250, "Coffee", 150, 95));
        productList.add(new HotDrink(200, "Coffee", 100, 95));
        productList.add(new HotDrink(150, "BkackTea", 150, 90));
        productList.add(new HotDrink(100, "BkackTea", 100, 90));
        productList.add(new HotDrink(200, "GreenTea", 200, 85));
        productList.add(new HotDrink(150, "GreenTea", 150, 85));

        // BottleOfVatterVendingMachine vendingMachine = new BottleOfVatterVendingMachine();

        HotDrinkVendingMachine vendingMachine = new HotDrinkVendingMachine();
        vendingMachine.initProduct(productList);

        // System.out.println(vendingMachine.getProduct("qwe", 150));
        // System.out.println(vendingMachine.getProduct("qwe"));

        System.out.println("-----------------------------------------------------------------");
        System.out.println(vendingMachine.getProduct("Coffee"));
        System.out.println("-----------------------------------------------------------------");
        System.out.println(vendingMachine.getProduct("BkackTea"));
        System.out.println("-----------------------------------------------------------------");
        System.out.println(vendingMachine.getProduct("GreenTea"));
        System.out.println("-----------------------------------------------------------------");
        System.out.println(vendingMachine.getProduct("GreenTea", 150, 85));
        System.out.println("-----------------------------------------------------------------");
    }
}
