
import java.util.Scanner;

public class Kare extends Dortgen {

    public Kare(Point p1) {
        super();
        System.out.println("Lütfen geometrik şeklin 4 köşe noktasının koordinatlarını (x,y) şeklinde giriniz");
        Scanner data=new Scanner(System.in);
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
        
        return super.alanHesapla(p1);
    }
    
}
