public class Main {
    public static void main(String[] args) {
        // class özellik olarka kullanılır
        Product product = new Product(1,"Laptop1","1000gb asus",2000,2); // new den sonraki product() constructor
        /*product.setName("Laptop");
        product.setId(1);
        product.setDescription("Aus");
        product.setPrice(500);
        product.setStockAmount(3);*/

        ProductManager productManager = new ProductManager();
        productManager.Add(product);

    }
}