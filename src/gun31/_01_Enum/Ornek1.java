package gun31._01_Enum;

public class Ornek1 {

    enum Aylar {
        tanimsiz, OCAK, SUBAT, MART, NISAN, MAYIS, HAZIRAN, TEMMUZ, AGUSTOS, EYLUL, EKIM, KASIM, ARALIK
        // tanimsiz ocak 1'den başlasın diye yazdık.
    }
    // Yazılım dillerinde enum, enumaration ve enum sabitleri
// olarak adladırılmaktadır. Tanımlanan değişkenlerin
// sabit değer alması için kullanılır. Tanımlanan
// bu sabit değerler bir grup oluşturur. Erişilmesi,
// yönetilmesi ve anlaşılması kolay hale gelir.

//girilmesi gereken birden fazla datayı  tek seferde parti halinde giriyoruz,
// daha sonra kullanması da kolay yazması da kolay oluyor

    public static void main(String[] args) {
        Aylar ay = Aylar.MART;

        switch (ay) {

            case SUBAT:
                System.out.println(28);
                break;
            case OCAK:
            case MART:
            case MAYIS:
            case TEMMUZ:
            case AGUSTOS:
            case EKIM:
            case ARALIK:
                System.out.println(31);
                break;
            case NISAN:
            case HAZIRAN:
            case EYLUL:
            case KASIM:
                System.out.println(30);
                break;

        }
        if (ay == Aylar.MAYIS) {
            System.out.println("21'i Ablamın doğum günü");
        }

        System.out.println("ay = " + ay); //toString
        System.out.println("ay.name() = " + ay.name()); // Simge olarak kullanılan kelimeyi verir
        System.out.println("ay.ordinal() = " + ay.ordinal()); // Simge'nin indexini verir

        for (Aylar a : Aylar.values()) {
            System.out.println(a.ordinal() + ".Ay :" + a.name());

        }
    }
}
