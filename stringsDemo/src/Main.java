public class Main {
    public static void main(String[] args) {
        String mesaj ="Bugün Hava Çok Güzel.";

        System.out.println(mesaj);

        /*System.out.println("Eleman Sayısı: "+ mesaj.length());
        System.out.println("5.eleman :"+mesaj.charAt(4));
        System.out.println(mesaj.concat(" Yaşasın!"));
        System.out.println(mesaj.startsWith("A")); // stringe tanımlı olan cümle veya kelime başlangıcında ki char parantesin icindekiyse dogru veya yanlısı vermektedir
        System.out.println(mesaj.endsWith("."));  // stringin tanımlı olan cümle veya kelime sonunda ki char parantez icindekiyse dogru veya yanlısı vermektedir
        char[] karakter = new char[5];
        mesaj.getChars(0,5, karakter,0);
        System.out.println(karakter);
        System.out.println(mesaj.indexOf("ava"));
        System.out.println(mesaj.lastIndexOf("a")); */// soldan sayar ama sagdan baslatır kacıncı harf oldugunu oyle verir

        String yeniMesaj = mesaj.replace(" ","_");
        System.out.println(mesaj.replace(" " ,"_")); // replace degistirme
        System.out.println(yeniMesaj);

        System.out.println(mesaj.substring(2,4)); // 4 dahil degildir
        for (String kelime : mesaj.split(" ")){ // kelimeleri alt alta yazmak.
            System.out.println(kelime);
        }
        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());

        String bosluklu = "      bugun hava cok güzel.  ";
        System.out.println(bosluklu);
        System.out.println(bosluklu.trim());
    }
}