package gun35._01_Final.classFinal;

public class ArabaMain {
    public static void main(String[] args) {

        Tasit t1=new Tasit(); // nesne oluşturulabiliyor
        // sınır yok
        t1.model="golf";

        Tasit t2=new Tasit();
        t2.model="civic";

        // Final CLASSLARDAN miras alınamıyor
        // extend diyip başka bir classta kullanılamıyor!!!
        // main gibi yerlerde direkt çağırılarak nesne olarak
        // kullanılabiliyor


    }
}
