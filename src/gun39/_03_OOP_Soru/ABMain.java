package gun39._03_OOP_Soru;

public class ABMain {
    public static void main(String[] args) {


        // STATİC durumu olmadığı için üretilen NESNE'ye göre
        // mesaj oluşturuluyor

        A a =new A();
        System.out.println(a.mesaj); //A'dan merhaba

        B b=new B();
        System.out.println(b.mesaj);//B'dan merhaba

        A a2=new A();
        System.out.println(a2.mesaj);//A'dan merhaba
    }
}
