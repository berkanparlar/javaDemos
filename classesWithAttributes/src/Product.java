public class Product {
    //attribute // private özel alan // getter setter
    public  Product(int id, String name, String description, double price,int stockAmount){
        //constructor yapıcı demek
        System.out.println("Yapıcı blok calıstı");
        this.id=id;
        this.name=name;
        this.price=price;
        this.description=description;
        this.stockAmount=stockAmount;
    }
    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String kod;
    // getter
    public int getId(){ // sadece id yi okur
        return id;
    }
    // set yazzmak zorunlu degil
    // setter
    public void setId(int id){
        id= id; // hangi id hangi alan this.id daha dogru this bu anlamına gelir
        // al cizgi field
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }
}
