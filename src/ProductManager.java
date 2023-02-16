public class ProductManager {

    public void add(Product product){
        if (ProductValidator.isValid(product)){
            System.out.println("Urun Eklendi");
        }
        else{
            System.out.println("Gecersiz Urun");
        }
    }
}
