package gun04;

public class _06_Ornek2 {
    public static void main(String[] args) {
        // Kişinin ağırlığını double, boyunu int olarak değerler veriniz
        // ve bir satırda boyunuz.... ve kilonuz.. şeklinde yazdırınuz.
        // vücut kitle indeksini bularak yazınız. (kg/(boy*boy))
        double kilo= 58.4;
        int boy=178;
        System.out.println("boyunuz= " + boy +" "+"kilonuz=" +kilo);
        double vki= kilo/(boy*boy);
        System.out.println("vki = " + vki);
        ///////
        double boy2=1.78;
        double vki2= kilo/(boy2*boy2);
        System.out.println("vki2 = " + vki2);

    }
}
