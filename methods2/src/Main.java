public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugun hava cok güzel";
        String yenimesaj = mesaj.substring(0,2); // btişi dahil degil
        int sayi = topla(1,2);
        String sehir = sehirVer();
        System.out.println(yenimesaj);
        System.out.println(sehir);
        System.out.println(sayi);
        int toplam = topla2(2  ,45,6,7,8);
        System.out.println(toplam);
    }

    public static void ekle(){
        // void bir nevi emirdir //  Voidi stringe atayamayız.
        System.out.println("Eklendi");
    }
    public static void sil(){
        System.out.println("Silindi");
    }
    public static void guncelle(){
        System.out.println("Güncellendi");
    }
    public static  int topla(int sayi1,int sayi2){
        return sayi1 + sayi2;
    }
    public static String sehirVer(){
        return "Ankara";
    }
    public static int topla2(int... sayilar){ // üc nokta variable arguments integer aray gibi calısıyor
        int toplam =0;
        for (int sayi:sayilar){
            toplam+=sayi;
        }
        return toplam;
    }
}