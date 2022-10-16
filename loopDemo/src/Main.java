public class Main {
    public static void main(String[] args) {
        // for döngüsü 11. ders
        for (int i=2;i<10;i+=2 ){
            System.out.println(i);
        }
        System.out.println("For dongüsü bitti.");
        // while 12. ders
        int i=1;
        while (i<10){
            System.out.println(i);
            i+=2;
        }

        System.out.println("while dongusu bitti");
        // do while dongüsü 13. ders
        // while ile farkı ilk önce şart alırız
        // do while da ise şart uymasa bile bir kere calısacaktır

        int j=20;
        do{
            System.out.println(j);
            j+=2;
        }while (j<10);
        System.out.println("do while dongusu bitti");
    }
}