public class Main {
    public static void main(String[] args) {
        int sayi = 20;
        if (sayi < 20)
        {
            System.out.println("Sayi 20 den küçük.");
        }
        if (sayi<15)
        {
            System.out.println("Sayi 15 den küçük");
        }else{
            System.out.println("Sayi 15 den kücük degildir");
        }
        System.out.println("Sayım : "+ sayi);
        if (sayi < 20){
            System.out.println("Sayi 20 den kücüktur");
        }else if (sayi==20){
            System.out.println("Sayi 20 ile eşittir.");
        }else {
            System.out.println("Sayi 20 den büyüktür");
        }
    }
}