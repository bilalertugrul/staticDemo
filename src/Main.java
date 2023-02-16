public class Main {
    public static void main(String[] args) {


        Product product = new Product();
        product.name="Laptop";
        product.price=110.23;

        ProductManager productManager = new ProductManager();
        productManager.add(product);

    }
}