package gun25;

// (class)yeni tiplerin tanımlandığı yer
public class _01_JavaClassAndObject {
    
    // methodların yazıldığı yer
    public static void main(String[] args) { //başla
        // ana programın başladığı ve çalıştığı yer
        int sayi=5;
        
        Araba benimArabam=new Araba(); // araba tip adı --> int gibi, benimArabam nesne(object)
        benimArabam.marka= "VolksWagen";
        benimArabam.model="Golf";
        benimArabam.renk="Kırmızı";
        benimArabam.motorHacmi=1600;
        benimArabam.yili=2022;
        System.out.println("benimArabam.marka = " + benimArabam.marka);
        System.out.println("benimArabam.model = " + benimArabam.model);
        System.out.println("benimArabam.renk = " + benimArabam.renk);
        System.out.println("benimArabam.motorHacmi = " + benimArabam.motorHacmi);
        System.out.println("benimArabam.yili = " + benimArabam.yili);
        
    }
    
    // metodların yazıldığı yer

}  // dur

// (class)yeni tiplerin tanımlandığı yer

class Araba{
    String renk;
    String model;
    int yili;
    String marka;
    int motorHacmi;
    
    
}