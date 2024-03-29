import java.util.List;

public interface VendingMachine {
    void initProduct(List<Product> productList);
    Product getProduct(String name);
}
