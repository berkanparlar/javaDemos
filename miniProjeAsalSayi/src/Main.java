public class Main {
    public static void main(String[] args) {
        int number = 1; // 25 sayısı asal mı degil mi diye kontrol ediyorum.
        int remainder = number % 2;
        System.out.println(remainder);
        boolean isPrime = true; // asal sayı mı diye sormak icin degiskene tanımlıyorum.
        if (number == 1) {
            System.out.println("sayı asal degildir");
            // return; diye secenklede tamamıyla maini bitiriyor
        } else if (number < 1) {
            System.out.println("gecersiz sayı");
        } else {
            for (int i = 2; i < number; i++) {

                if (number % i == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                System.out.println("Sayı Asaldır.");
            } else {
                System.out.println("Sayi asal degildir.");
            }
        }
    }
}