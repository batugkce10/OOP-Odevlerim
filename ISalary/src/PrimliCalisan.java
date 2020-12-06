
public class PrimliCalisan extends Calisan {

    int satisMiktari;
    double primUcreti;

    public PrimliCalisan(int satisMiktari, double primUcreti, String ad, String soyad, int sskNo) {
        super(ad, soyad, sskNo);
        this.satisMiktari = satisMiktari;
        this.primUcreti = primUcreti;
    }

    public int getSatisMiktari() {
        return satisMiktari;
    }

    public void setSatisMiktari(int satisMiktari) {
        this.satisMiktari = satisMiktari;
    }

    public double getSatisUcreti() {
        return primUcreti;
    }

    public void setSatisUcreti(double satisUcreti) {
        this.primUcreti = satisUcreti;
    }

    @Override
    public double maasHesapla() {
        return this.satisMiktari * this.primUcreti;
    }

}
