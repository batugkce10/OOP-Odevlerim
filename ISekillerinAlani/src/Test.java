
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        System.out.println("Lütfen alanını hesaplamak istediğini şeklin ismini yazınız.");
        Scanner data = new Scanner(System.in);
        String sekil = data.nextLine();
        switch (sekil) {
            case ("kare"):
                Point p1 = new Point(0, 0, 0, 0, 0, 0, 0, 0);
                Kare kare = new Kare(p1);
                System.out.println("Karenin alanı: " + kare.alanHesapla(p1));
                break;
            case ("dikdörtgen"):
                Point p2 = new Point(0, 0, 0, 0, 0, 0, 0, 0);
                Dikdortgen dikdortgen = new Dikdortgen(p2);
                System.out.println("Dikdörtgenin alanı: " + dikdortgen.alanHesapla(p2));
                break;
            case ("yamuk"):
                Point p3 = new Point(0, 0, 0, 0, 0, 0, 0, 0);
                Yamuk yamuk = new Yamuk(p3);
                System.out.println("Yamuğun alanı: " + yamuk.alanHesapla(p3));
                break;
            case ("paralelkenar"):
                Point p4 = new Point(0, 0, 0, 0, 0, 0, 0, 0);
                Paralelkenar paralelkenar = new Paralelkenar(p4);
                System.out.println("Paralelkenarın alanı: " + paralelkenar.alanHesapla(p4));
                break;
        }
    }
}
