
public class Dortgen {

    Dortgen() {
        Point p1 = new Point(0, 0, 0, 0, 0, 0, 0, 0);

    }

    public int alanHesapla(Point p1) {
        double kenar1, kenar2;
        kenar1 = Math.sqrt((p1.getY2() - p1.getY1()) * (p1.getY2() - p1.getY1()) + (p1.getX2() - p1.getX1()) * (p1.getX2() - p1.getX1()));
        kenar2 = Math.sqrt((p1.getY3() - p1.getY2()) * (p1.getY3() - p1.getY2()) + (p1.getX3() - p1.getX2()) * (p1.getX3() - p1.getX2()));
        return (int) (kenar1 * kenar2);
    }
}
