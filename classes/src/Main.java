public class Main {
    public static void main(String[] args) {
     /*   CustomerManager customerManager = new CustomerManager();// class çagrımı
        customerManager.Add(); // classlar referns typedir*/
       // value
        int sayi1 =10;
        int sayi2 =20;
        sayi2 = sayi1;
        sayi1=30;

        // diziler referans type
        int[] sayilar1 = new int[] {1,2,3};
        int[] sayilar2 = new int[] {4,5,6};
        sayilar2 = sayilar1;
        sayilar1[0]=10;

        System.out.println(sayilar1[0]);
    }
}
