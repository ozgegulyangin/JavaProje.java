package gun43;

public class _01_JavaException {
    public static void main(String[] args) {
        System.out.println("program çalışmaya başladı");
        //   String kelime=""   // çalışmaz, derleme hatası verir
        String kelime="";

        char harf=kelime.charAt(3);  //String index out of range: 3 'index sınırının dışında hatası verdi'

        System.out.println("program bitti");

    }
}
// daha çalışmasan önce oluşmuş eksikliklerden kaynaklı hatalara
// Derleme zamanı yani COMPILE ERROR, Expection diyoruz.

//program çalıştıktan sonra çalışma zamanı içerisindeki hatalara
//çalışma zamanı yani RUNTIME ERROR , Exception diyoruz.