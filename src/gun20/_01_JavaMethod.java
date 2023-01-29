package gun20;

public class _01_JavaMethod {
    public static void main(String[] args) {

        System.out.println("merhaba dünya");
        System.out.println("merhaba dünya");
        merhabaYaz();// giden yok, dönen yok
        toplamYaz(4,5); // giden var, dönen yok
        int enb=Math.max(4,5); // giden var dönen var
        // fonksiyonu bir şeye eşitleyebiliyorsam dönen veri var demektir
        double sayi= Math.random(); //giden veri yok, dönen veri var
       // döneni var fonksiyonlar
      // eşitlik kurabiliyosa, dönen varsa return vardır ve ne atandıysa o dönüyodur

       enbYaz(4,5);
       enb=enbBul(4,5); // eşitleme olayı ancak return varsa yapılabiliyor
       System.out.println("enb = " + enb);
       // fonksiyonda return olduğu için main de yazdırabiliyoruz
        //yani fonksiyonun sonucunu alabiliyoruz
       // VOID  -> tipsiz demek, int,str ne belli değil tipi yok demek bu yuzden geri ne döndüreceği belirisz‼️

    }
    public static int enbBul(int a , int b){ // Voıd yerine dönecek verinin tipini yazdık "int"‼️
        int donecek=0; // programın durumuna göre etkisiz olacak durumu yakamak için
        if (a>b)
            donecek=a;
        else
            donecek=b;
        return donecek;  // dönen veri haline getirdik

    }
    public static void enbYaz(int a, int b){
        if (a>b)
            System.out.println(a);
        else
            System.out.println(b);
    }
    public static void toplamYaz(int a, int b){
        System.out.println(a+b);

    }

    public static void merhabaYaz(){
        System.out.println("merhaba dünya");

    }

}
