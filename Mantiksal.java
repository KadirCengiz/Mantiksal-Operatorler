public class Mantiksal {
    public static void main(String[] args) {

        //Değişkenlerin tanımlanması.

        int a=10, b=20, c=5, d;

        // !-Değil, &&-VE, ||-VEYA, ?-Karşılaştırma Operatörleri İşlemleri.

        boolean kosul1 =(a<b);
        boolean kosul2 =(a==c);
        boolean kosul3 =(c<b);
        boolean sonuc1 =(kosul1 && kosul2);
        boolean sonuc2 =(kosul1 || kosul2);
        d=(a==b) ? 10 : 20;

        //Sonuçların ekrana yazılması.

        System.out.println(kosul1);
        System.out.println(kosul2);
        System.out.println(kosul3);
        System.out.println(!kosul3);
        System.out.println(sonuc1);
        System.out.println(sonuc2);
        System.out.println(d);
    }
}