
import java.util.Scanner;

public class CalisanGir {

    public static void main(String[] args) {
        Calisan calisanlar[] = new Calisan[3];
        Scanner data1 = new Scanner(System.in);

        int secim;
        for (int i = 0; i < 3; i++) {
            System.out.println("Lütfen çalışanın çalışma tipini belirtiniz.\n"
                    + "1-Saatli Çalışan\n"
                    + "2-Primli Çalışan\n"
                    + "3-Maaşlı Çalışan");
            secim = data1.nextInt();
            switch (secim) {
                case 1:
                    System.out.println("Lütfen saatli çalışan çalışanın çalışma süresini ve saatlik ücretini giriniz.");
                    SaatliCalisan Scalisan = new SaatliCalisan(data1.nextInt(), data1.nextDouble(), null, null, 0);
                    
                    System.out.println("Lütfen sırasıyla çalışanın ssk no'su, ismini ve soyismini giriniz");
                    Scalisan.setSskNo(data1.nextInt());
                    data1.nextLine();// Bu kod satırı, nextLine() metodu entera basmayı algıladığı için kullanıldı
                    Scalisan.setAd(data1.nextLine());
                    Scalisan.setSoyad(data1.nextLine());
                    Scalisan.maasHesapla();
                    calisanlar[i] = Scalisan;
                    break;

                case 2:
                    System.out.println("Lütfen primli çalışan çalışanın yaptığı satış miktarı ve satış ücretini giriniz.");
                    PrimliCalisan Pcalisan = new PrimliCalisan(data1.nextInt(), data1.nextInt(), null, null, 0);
                    
                    System.out.println("Lütfen sırasıyla çalışanın ssk no'su, ismini ve soyismini giriniz");
                    Pcalisan.setSskNo(data1.nextInt());
                    data1.nextLine();// Bu kod satırı, nextLine() metodu entera basmayı algıladığı için kullanıldı
                    Pcalisan.setAd(data1.nextLine());
                    Pcalisan.setSoyad(data1.nextLine());
                    Pcalisan.maasHesapla();
                    calisanlar[i] = Pcalisan;
                    break;

                case 3:
                    System.out.println("Lütfen maaşlı çalışan çalışanın haftalık ücretini giriniz.");
                    MaasliCalisan Mcalisan = new MaasliCalisan(data1.nextInt(), null, null, 0);
                    
                    System.out.println("Lütfen sırasıyla çalışanın ssk no'su, ismini ve soyismini giriniz");
                    Mcalisan.setSskNo(data1.nextInt());
                    data1.nextLine();// Bu kod satırı, nextLine() metodu entera basmayı algıladığı için kullanıldı
                    Mcalisan.setAd(data1.nextLine());
                    Mcalisan.setSoyad(data1.nextLine());
                    Mcalisan.maasHesapla();
                    calisanlar[i] = Mcalisan;

            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(i + 1 + ".çalışanın bilgileri\n" + calisanlar[i].getAd() + " " + calisanlar[i].getSoyad() + "\n" + "Ssk no: " + calisanlar[i].getSskNo() + "\n" + "Çalışanın maaşı: " + calisanlar[i].maasHesapla());
        }
    }
}
