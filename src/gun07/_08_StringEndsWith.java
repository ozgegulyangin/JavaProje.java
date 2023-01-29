package gun07;

public class _08_StringEndsWith {
    public static void main(String[] args) {
        // EndsWith: verilen karaktar(ler) ile bitiyor mu?
        // sonuc true veya false yani boolean döner

        String text= "merhaba dünya";
        System.out.println("text.endsWith(ya) = " + text.endsWith("ya")); // true
        System.out.println("text.endsWith(ha) = " + text.endsWith("ha")); // false
        System.out.println("text.endsWith(A) = " + text.endsWith("A")); //false
        System.out.println("text.endsWith( ) = " + text.endsWith(" ")); //false
        System.out.println("text.endsWith(Dünya) = " + text.endsWith("dünya")); //true



    }
}
