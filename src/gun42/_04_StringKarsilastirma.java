package gun42;

public class _04_StringKarsilastirma {
    public static void main(String[] args) {
        // Stringlerde neden == yerine equal kullanılıyor?
        String c1="Bugün hava çok güzel";
        String c2="Bugün hava çok güzel";

        // İLKEL tipleri karşılaştırdığında 2sinde de değerleri karşılaştırır
        // Çünkü başka bir şey yok

        if (c1==c2)
            System.out.println("cümle 1 cümle 2'ye eşit");
        else
            System.out.println("cümle 1 cümle 2'ye eşit değil");

        if (c1.equals(c2))
            System.out.println("cümle 1 cümle 2'ye eşit");
        else
            System.out.println("cümle 1 cümle 2'ye eşit değil");

        /*************** Referans Tiplerde ise **************/

        // scanner ile ekrandan okuduğunda aşağıdaki gibi yapıyor.❕
        String c3=new String("Bugün hava çok güzel");
        String c4=new String("Bugün hava çok güzel");
        if (c3==c4)   // adresleri karşılaştırır ‼️
            System.out.println("cümle 3 cümle 4'e eşit");
        else
            System.out.println("cümle 3 cümle 4'e eşit değil");
        if (c3.equals(c4))   // değerleri karşılaştırır‼️
            System.out.println("cümle 3 cümle 4'e eşit");
        else
            System.out.println("cümle 3 cümle 4'e eşit değil");

    }
}
