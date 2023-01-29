package gun07;

public class _04_StringLastIndexOf {
    public static void main(String[] args) {
        // indexOf gibi çalışır farkı lastIndexOf sondan aramaya başlar

        //          0123456
        String s1= "Merhaba";

        System.out.println("s1.indexOf(a) = " + s1.indexOf("a")); // baştan başlar 4, baştaki a'yi bulur
        System.out.println("s1.lastIndexOf(a) = " + s1.lastIndexOf("a")); // sondan başlar 6 sondaki a'yı bulur

        System.out.println("s1.indexOf(r) = " + s1.indexOf("r")); // 2
        System.out.println("s1.lastIndexOf(r) = " + s1.lastIndexOf("r")); // 2


    }
}
