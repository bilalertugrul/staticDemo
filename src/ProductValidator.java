public class ProductValidator {
    Product product;
    //Static yapılan sınıf hafızada sabit kalır. İsteyen bunu kullanır.
    public static boolean isValid(Product product){

        if(product.price>0 && !product.name.isEmpty()){
            return true;
        }
        else{
            return false;
        }

    }
}
