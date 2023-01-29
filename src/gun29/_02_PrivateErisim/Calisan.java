package gun29._02_PrivateErisim;

public class Calisan {

    //başlarında public vs yazmıyor yani DEFAULT'lar
    int id;
    String name;
    String surname;
    private String password;  // mainde erişilemiyor!!
    // sadece bu classdan erişim izni var.

    public  void sifreAta(String sifre){
        // sifreyi burada kontrol ederek atayacağım.
        // ancak bu class'tan erişim izni var.
        if (sifre.length()<8) {
            System.out.println("Uygun olmayan bir şifre denediniz");
        } else {
            password=sifre;
            System.out.println("Şifre başarıyla atandı");
        }

        }
        public void sifreGoster(){
            System.out.println("****"+password.substring(5));

        }

}
