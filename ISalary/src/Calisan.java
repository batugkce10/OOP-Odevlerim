
public abstract class Calisan implements Odeme {

    private String ad;
    private String soyad;
    private int sskNo;

    public Calisan(String ad, String soyad, int sskNo) {
        this.ad = ad;
        this.soyad = soyad;
        this.sskNo = sskNo;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getSskNo() {
        return sskNo;
    }

    public void setSskNo(int sskNo) {
        this.sskNo = sskNo;
    }

}
