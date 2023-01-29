package gun39._02_OOP_Soru;

public class ABMain {
    public static void main(String[] args) {
        A a=new A();
        System.out.println(A.mesaj); // A'dan merhaba      A'dan alıp A'dan yazdırdık

        //STATİC değişken 1 tanedir!!!!!!!!!
        // Canlıdır, durağandır
        // değiştiğinde son aldığı değer neyse onla devam eder!!!!

        B b=new B(); // constructor çalıştı ve A'daki static değer değişti çünkü A'dan extend aldık
        System.out.println(A.mesaj);  // B'den merhaba

        A a2=new A();  // bu bir kandırmaca burada
        // A'dan mesaj zaten dönüştü B'den merhabaya . Static değişkenlere class üzerinden gittiğimiz için
        // A. mesaj yine B'den merhaba olur
        System.out.println(A.mesaj); // B'den merhaba
    }
}
