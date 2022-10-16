public class Main {
    public static void main(String[] args) {
        // 6 mükemmel sayıdır ->1,2,3 bölünür ve toplamları 6 eder
        // 28 -> 1,2,4,7,14

        int number =28;
        int total =0;
        for (int i =1; i < number ; i++){
            if (number % i == 0 ){ // number i ye bolundugunde kalanı sıfır ise
                total= total+i;
            }
        }
        if(total == number){
            System.out.println("mükemmel sayidir.");
        }
        else
        {
            System.out.println("Mükemmel sayi degildir.");
        }
    }
}