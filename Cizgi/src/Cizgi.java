
public class Cizgi {

    int apsis1,apsis2,ordinat1,ordinat2;
    
    
    public Cizgi(Nokta n1,Nokta n2) {
        apsis1=n1.getX();
        apsis2=n2.getX();
        ordinat1=n1.getY();
        ordinat2=n2.getY();
    }

    public double Hesapla(Nokta n1,Nokta n2){
        int yukseklik,en;
        double uzunluk;
        yukseklik=ordinat1-ordinat2;
        en=apsis1-apsis2;
        uzunluk=Math.sqrt(yukseklik*yukseklik+en*en);
        return uzunluk;
    }
}
