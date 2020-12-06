
public class MaasliCalisan extends Calisan {

    int haftalikMaas;

    public MaasliCalisan(int haftalikMaas, String ad, String soyad, int sskNo) {
        super(ad, soyad, sskNo);
        this.haftalikMaas = haftalikMaas;
    }

    public int getHaftalikMaas() {
        return haftalikMaas;
    }

    public void setHaftalikMaas(int haftalikMaas) {
        this.haftalikMaas = haftalikMaas;
    }

    @Override
    public double maasHesapla() {
        return this.haftalikMaas * 4;
    }

}
