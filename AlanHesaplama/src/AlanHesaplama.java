
import java.util.Scanner;

public class Main {

    public static int AlanHesabi(int kenar) {
        return kenar * kenar;
    }

    public static double AlanHesabi(int kenar1, int kenar2, int kenar3) {
        int u=(kenar1+kenar2+kenar3)/2;
       
        return Math.sqrt(u*(u-kenar1)*(u-kenar2)*(u-kenar3));
    }

    public static double AlanHesabi(double yaricap) {
        return (double) (Math.PI * yaricap);
    }

    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("Lütfen alan hesabı yapacağınız geometrik şekli giriniz.\n1-Kare\n2-Üçgen\n3-Daire\n");
        int secim = data.nextInt();
        switch (secim) {
            case 1:
                System.out.println("Lütfen karenin kenar uzunluğunu giriniz:\n");
                int kenar = data.nextInt();
                System.out.println("Karenin alanı: " + AlanHesabi(kenar));
                break;
            case 2:
                System.out.println("Lütfen üçgenin kenar uzunluğunu ve sonrasında yüksekliğini giriniz\n");
                int kenar1 = data.nextInt();
                int kenar2 = data.nextInt();
                int kenar3 = data.nextInt();
                System.out.println("Üçgenin alanı: " + AlanHesabi(kenar1,kenar2,kenar3));
                break;
            case 3:
                System.out.println("Lütfen dairenin yarıçapını giriniz\n");
                double yaricap = data.nextDouble();
                System.out.println("Dairenin alanı:" +AlanHesabi(yaricap));
                break;
        }
    }
}
