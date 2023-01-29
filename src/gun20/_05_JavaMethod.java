package gun20;

import com.oracle.xmlns.internal.webservices.jaxws_databinding.JavaMethod;

public class _05_JavaMethod {
    public static void main(String[] args) {

        // farklı methodlarda aynı ismi kullanıyoruz, parametrelerde ayırt edici bir özellik olması yeterli
        // toplamBul 'u farklı int ve string de kullanabiliyoruz ama  int,string ve return tanımlamak lazım

        int s1=4;
        int s2=8;
        int s3=54;

        int sonuc1=toplamBul(s1,s2);
        System.out.println("sonuc1 = " + sonuc1);
        int sonuc2=toplamBul(s1,s2,s3);
        System.out.println("sonuc2 = " + sonuc2);
        String ad="Özge";
        String soyad="Gül Yangın";
        String sonuc3= toplamBul(ad,soyad);
        System.out.println("ad ve soyad = "+sonuc3);


    }

    public static int toplamBul(int a, int b){
        return a+b;
    }

    public static int toplamBul(int a, int b, int c){
        return a+b+c;
    }
    public static String toplamBul(String a, String b){
        return a+" "+b;
    }
}
