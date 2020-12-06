
public class SaatliCalisan extends Calisan {

    int calismaSaati;
    double saatlikUcret;

    public SaatliCalisan(int calismaSaati, double saatlikUcret, String ad, String soyad, int sskNo) {
        super(ad, soyad, sskNo);
        this.calismaSaati = calismaSaati;
        this.saatlikUcret = saatlikUcret;

    }

    public int getCalismaSaati() {
        return calismaSaati;
    }

    public void setCalismaSaati(int calismaSaati) {
        this.calismaSaati = calismaSaati;
    }

    public double getSaatlikUcret() {
        return saatlikUcret;
    }

    public void setSaatlikUcret(double saatlikUcret) {
        this.saatlikUcret = saatlikUcret;
    }

    @Override
    public double maasHesapla() {
        if (this.calismaSaati <= 40) {
            return (double) (this.saatlikUcret * this.calismaSaati);
        } else {
            return (double) (this.saatlikUcret * this.calismaSaati * 1.5);
        }
    }

}
