package gun30._02_FinalDegiskenler;

public class GununSorusu {
    int a;
    static int b=0;
    void arttir(){
        a++;
        b++;
    }
    public static void main(String[] args) {
        GununSorusu gs1 = new GununSorusu();
        gs1.a = 5;
        GununSorusu gs2 = new GununSorusu();
        gs2.a = 7;

        // a'nın değeri gs1 için farklı gs2 için farklı.
        System.out.println("gs1 = " + gs1.a); // a=5
        System.out.println("gs2 = " + gs2.a);  // a=7

        // b'nin değeri kaçtır?  --> Static olduğu için BİRTANE dir ve baştan tanımladığımız için 0'dır.
        System.out.println("GununSorusu.b = " + GununSorusu.b);  // b=0


        gs1.arttir(); // gs1.a--> 6 , b=1 oldu   ARTTIRI çalıştırana kadar b=0'di.
        System.out.println("gs1 = " + gs1.a);
        System.out.println("gs2.a = " + gs2.a);
        System.out.println("GununSorusu.b = " + GununSorusu.b);
        gs2.arttir(); // gs2.a--> 8 , b=2 oldu

        // soru a'nın ve b'nin en son değerieri kaçtır
        System.out.println("gs1 = " + gs1.a);
        System.out.println("gs2.a = " + gs2.a);
        System.out.println("GununSorusu.b = " + GununSorusu.b);
        
    }

}
