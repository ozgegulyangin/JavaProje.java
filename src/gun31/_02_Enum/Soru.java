package gun31._02_Enum;

public class Soru {
    // Bir User yetkilendirme modülü yapılması isteniyor.
    // USER ROLÜ : ADMIN, MUDUR, SATIS, PERSONEL
    // USER STATUSU : AKTIF, PASIF
    // Yukarıdaki şekilde bir USER(username,role,statu) class ı tanımlayınız
    // Farklı yetki ve statüde 2 kullanıcı ve bir de ADMIN
    // kullanıcısı tanımlayınız.
    // UserSilme isimli fonksiyona bu userları gönderiniz.
    // ADMIN kullanıcısı için bu user silinemez uyarısı verdirelim



   enum Role {ADMIN, MUDUR, SATIS, PERSONAL}
    enum Statu {AKTIF, PASIF}


    public static void main(String[] args) {

        User k1 = new User("Özge",Role.ADMIN, Statu.AKTIF);
        User k2 = new User("Celal", Role.MUDUR, Statu.AKTIF);
        User k3 = new User("Atakan", Role.PERSONAL, Statu.PASIF);

        k1.userSil();
        System.out.println("k1 = " + k1);
        System.out.println("k2 = " + k2);
        System.out.println("k3 = " + k3);


        UserSil(k1);
        System.out.println("k1 = " + k1);
        UserSil(k2);
        System.out.println("k2 = " + k2);
    }

    public static void UserSil(User user) {
        if (user.role == Role.ADMIN) {
            System.out.println(user.username + " Admin Silinemez!");
        }
    else{
            System.out.println(user.username+ " silindi.");}
}
}
