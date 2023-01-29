package gun08;

public class _01_JavaAritmeticOperators {
    public static void main(String[] args) {
        int a=9;
        int b=5;
        System.out.println("Toplama işlemi");
        System.out.println("a+b=>" +(a+b)); //14

        System.out.println("Çıkartma işlemi");
        System.out.println("a-b=>" +(a-b)); //4

        System.out.println("Çarpma işlemi");
        System.out.println("a*b=>" +(a*b)); //45

        System.out.println("Bölme işlemi");
        System.out.println("a/b=>" +(a/b)); // normal sonuc=1.8
        // fakat Java'da tam sayının tam sayıya bölümünde küsürat atılır
        //ve sonuc 1 olur çünkü int/int
        //eğer tam sonuc istiorsan bir tanesini double'a çevirmen yeterli
        //sonuçta double olur
        System.out.println("a/b=>"+ (double)a/b); // sonuc 1.8 double çıkar!!

        System.out.println("Modül işlemi");
        // 11%3 bu işlem bize kalanı verir."%"
        // 1%4 sol taraf küçükse direkt sol taraf mod olur!!
        // sol büyükse kalanı, sol büyükse soldaki sayıyı al!!
        // sayılar eşitse mod=0'dır.
        System.out.println("a%b=>" +(a%b)); // 9%5=4
        System.out.println("b%a=>" + (b%a)); //5%9=5




    }
}
