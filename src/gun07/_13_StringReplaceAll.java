package gun07;

public class _13_StringReplaceAll {
    public static void main(String[] args) {
        // ReplaceAll: replace gibi çalışır. fakat kriter(regex) verilebiliyor
        //[] kullanılıyor
        // [^] yapınca da parantez içindekiler hariç gerisini siler

        String text= "Merhaba Dünya123";
        System.out.println("text = " + text); // orijinal hali
        System.out.println("text.replaceAll(abn->_) = " + text.replaceAll("[abn]","_"));
        // a veya b vey n ler yerine _ yap
        // şifre üstünü kapatmak için kullanılan komut 12*** gibi
        System.out.println("text.replaceAll(A-Z -> _ = " + text.replaceAll("[A-Z]","_"));
        // A dan Zye kadar büyük harfleri _ yap -> _erhaba _ünya123
        System.out.println("text.replaceAll(0-9) = " + text.replaceAll("[0-9]","*"));
        // Merhaba Dünya*** olur
        System.out.println("0-9 disindekiler -> _ = " + text.replaceAll("[^0-9]","_"));
        // _____________123




    }
}
