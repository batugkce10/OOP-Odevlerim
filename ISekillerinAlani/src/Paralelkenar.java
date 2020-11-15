
import java.util.Scanner;

public class Paralelkenar implements Dortgen {

    public Paralelkenar(Point p1) {
        
        System.out.println("Lütfen geometrik şeklin 4 köşe noktasının koordinatlarını (x,y) şeklinde giriniz");
        System.out.println("(Şeklin sol üst köşesi 1.nokta, sağ üst köşesi 2.nokta, sağ alt köşesi 3.nokta ve sol alt köşesi 4.nokta olmalı.)");
        Scanner data = new Scanner(System.in);
        p1.setX1(data.nextInt());
        p1.setY1(data.nextInt());
        p1.setX2(data.nextInt());
        p1.setY2(data.nextInt());
        p1.setX3(data.nextInt());
        p1.setY3(data.nextInt());
        p1.setX4(data.nextInt());
        p1.setY4(data.nextInt());
    }

    @Override
    public int alanHesapla(Point p1) {

        int alan = (((p1.getX1() * p1.getY2()) + (p1.getX2() * p1.getY3()) + (p1.getX3() * p1.getY4()) + (p1.getX4() * p1.getY1()))
                - ((p1.getY1() * p1.getX2()) + (p1.getY2() * p1.getX3()) + (p1.getY3() * p1.getX4()) + (p1.getY4() * p1.getX1()))) / 2;
        if (alan < 0) {
            return -1 * alan;
        } else {
            return alan;
        }
    }
}
