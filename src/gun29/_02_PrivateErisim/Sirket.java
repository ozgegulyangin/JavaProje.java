package gun29._02_PrivateErisim;

public class Sirket {
    public static void main(String[] args) {

        Calisan cal1=new Calisan();

        cal1.id=1;
        cal1.name="Celal";
        cal1.surname="Yangın";
        // cal1.password="...";
        // private olduğu için kendi paketinden maine bile çağırılamıyor
        cal1.sifreAta("1234");//Uygun olmayan bir şifre denediniz
        cal1.sifreAta("C_2345678*Y");//Şifre başarıyla atandı
        cal1.sifreGoster();


    }
}
