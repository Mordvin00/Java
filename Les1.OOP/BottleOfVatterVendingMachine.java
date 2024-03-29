import java.util.List;

public class BottleOfVatterVendingMachine implements VendingMachine {
    private List<Product> productList;
    @Override
    public void initProduct(List<Product> productList) {
        this.productList = productList;
    }
    @Override
    public Product getProduct(String name) {
        for (Product product : productList) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }
    public Product getProduct(String name, int volume){
        for (Product product : productList) {
            if (product.getName().equals(name) &&
                    ((BottleOfVatter)product).getVolume() == volume) {
                return product;
            }
        }
        return null;
    }
}
