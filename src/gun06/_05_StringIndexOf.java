package gun06;

public class _05_StringIndexOf {
    public static void main(String[] args) {

        String cumle="Merhaba Dünya";
        // D'nin indexi kaçtır
        //M nin indexi kaçtır
        // 0(530)1128851 -> ( parantezin in oda numarası kaç?
           // veriken karakter(ler)in indexini verir

        System.out.println("cumle.indexOf(M) = " + cumle.indexOf("M"));
        System.out.println("cumle.indexOf(a) = " + cumle.indexOf("a"));
        System.out.println("cumle.indexOf( ) = " + cumle.indexOf(" "));
        System.out.println("cumle.indexOf(ha) = " + cumle.indexOf("ha"));
        System.out.println("cumle.indexOf(A) = " + cumle.indexOf("A")); // -1 yok demek
        System.out.println("cumle.indexOf(a,5) = " + cumle.indexOf("a",5));
        System.out.println("cumle.indexOf(a,7) = " + cumle.indexOf("a", 7));
        System.out.println("cumle.indexOf(ü) = " + cumle.indexOf("ü"));
        // a yı aramaya 5(dahil) nolu indexten sonra başla!!!




    }
}
