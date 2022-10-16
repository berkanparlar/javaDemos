public class Main {
    public static void main(String[] args) {
        // ogrencinin aldıgı nota gore sonuc verme.

        char grade = 'B'; // büyük kucuk harf
        switch (grade) { // şart oznesi grade
            case 'A':
                System.out.println("Mükemmel: gectiniz");
                break;
            case 'B': // senaryo b olursa
                System.out.println("Güzel gectiniz");
                break;
            case 'C':
                System.out.println("İyi : gectiniz");
                break;
            case 'D':
                System.out.println("Orta : gectniz");
                break;
            case 'F':
                System.out.println("Kaldın");
                break;
            default:
                System.out.println("gecersiz not!");
        }
    }
}