
import java.util.ArrayList;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        ArrayList<Nokta> noktalar = new ArrayList<>();
        System.out.println("Lütfen çizgilerin x ve y koordinatlarını (x,y) sıralı ikili olacak şekilde giriniz: ");
        Scanner data = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            int nx = data.nextInt();
            int ny = data.nextInt();
            Nokta n = new Nokta(nx, ny);
            noktalar.add(n);
        }
        ArrayList<Cizgi> cizgiler=new ArrayList<>();
        for(int i =0;i<3;i++){
            Cizgi c=new Cizgi(noktalar.get(2*i), noktalar.get(2*i+1));
            cizgiler.add(c);
        }
        for(int i=0;i<3;i++){
            System.out.println(i+".çizginin boyu:"+cizgiler.get(i).Hesapla(noktalar.get(2*i), noktalar.get(2*i+1)));
        }
    }
}
