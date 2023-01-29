package gun08;

public class _04_JavaAssignmentOperators {
    public static void main(String[] args) {
        int a=10;
        // a=a+5;   a=15
        a+=5; // yine a 5 artar (kısa yazılış) ( a'nın artış miktarı 5tir)  sonuc a=15
        System.out.println("a = " + a);
        int b= 10;
        //  b=b-5; b=5
        b-=5; // aynısı (b'nin azalış miktarı 5 demiş oluyor) sonuc b=5
        System.out.println("b = " + b);

        int c=10;
        // c=c/5
        c/=5; // c nin  bölen değeri 5, bölüm değeri ikisinde de 2dir
        System.out.println("c = " + c);

        int d=10;
        // d=d*5  d=50
        d*=5;  // d=50
        System.out.println("d = " + d);

        int e=10;
        e%=5;
        System.out.println("e = " + e);





    }
}
