public class Main {
    public static void main(String[] args) {
        String[][] sehirler = new String[3][3];

        sehirler[0][0]="istanbul";
        sehirler[0][1]="bursa";
        sehirler[0][2]="bilecik";
        sehirler[1][0]="Ankara";
        sehirler[1][1]="Konya";
        sehirler[1][2]="Kayseri";
        sehirler[2][0]="Diyarbakır";
        sehirler[2][1]="Şanlıurfa";
        sehirler[2][2]="Gaziantep";

        for (int i=0; i<=2;i++){
            String bolge = "";
            if(i ==0)
            {
                bolge = "Marmara";
            }
            if (i == 1)
            {
                bolge = "İç anadolu";
            }
            if (i == 2)
            {
                bolge = "Dogu Anadolu";
            }
            System.out.println("-------------"+bolge+"--------------");
            for (int j =0;j<=2;j++){
                System.out.println(sehirler[i][j]);
            }
        }
    }
}