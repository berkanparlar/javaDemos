public class ProductManager {
    public void add(Product product){

        if(ProductValidator.isValid(product)){
            System.out.println("veritabanına eklendi");
        }else {
            System.out.println("ürün eklenmedi");
        }

    }
}
