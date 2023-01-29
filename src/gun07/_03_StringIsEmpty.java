package gun07;

public class _03_StringIsEmpty {
    public static void main(String[] args) {
        // isEmpty : bir Stringin içinde bir şey var mı yok mu boolean olarak verir
        
        String s1="Merhaba";
        System.out.println("s1.isEmpty() = " + s1.isEmpty()); // False

        String s2=" ";
        System.out.println("s2.isEmpty() = " + s2.isEmpty()); // False
        // " " boşluk karaktari de A gibi bir karakterdir.

        String s3= "";
        System.out.println("s3.isEmpty() = " + s3.isEmpty()); // True

    }
}
