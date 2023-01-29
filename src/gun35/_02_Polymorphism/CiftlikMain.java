package gun35._02_Polymorphism;

public class CiftlikMain {
    public static void main(String[] args) {
        Kopek kopek1=new Kopek("Karabaş");
        kopek1.ses();
        kopek1.kokladi();

        Kedi kedi1=new Kedi("Selami");
        kedi1.ses();
        kedi1.tirlamadi();

        System.out.println("-----------------------");
        hayvanSesi(kopek1);// fonksiyona gönderip orada yazdırdık
        hayvanSesi(kedi1); // fonksiyona gönderip orada yazdırdık
        System.out.println("-----------------------");
        System.out.println("**********************");
        hayvanSesi(kopek1); // havladı yazdırdı
        hayvanSesi(kedi1); // miyavladı yazdı
        System.out.println("******************");

        //POLİMORPHİZM - ÇOK BİÇİMLİ ‼️‼️
        // Mirasa bağlı olarak kullanılıyor
        // EXTEND edildiği superclasstan alınıyor
        // bu yüzden kopek1 ile kullanınca hav
        // kedi1 ile kullanıldığında miyav yazıyor


        /*************************************************/
        // Referans tipi   //Nesne tipi
        Hayvan hayvan1=new Hayvan("Ördek"); // hayvanlardan 1 hayvan oluşturdum
        Hayvan hayvan2=new Kopek("Kangal"); // hayvanlardan 1 kopek
        Hayvan hayvan3=new Kedi("Tekir"); // hayvanlardan 1 kedi
        System.out.println("-----------------------");
     /*   hayvan1.ses(); // ses çıkardı yazar çünkü genel hayvan
        hayvan2.ses(); // havladı çıkar çünkü KÖPEK'i aldık classtan
        hayvan3.ses();// miyavladı çıkacak çünkü Kedi'yi aldık
        System.out.println("-----------------------");*/
        // hayvan2.kokladi   yazamıyoruz Köpek'in özel fonksiyonunu
        // kullanamıyoruz çünkü hayvan Referanından dolayı metodlar kısıtlı

        //((Kopek)hayvan2).kokladi(); // -->>>> TİP DÖNÜŞÜMÜ YAPTIK‼️

        //((Kedi)hayvan3).tirlamadi(); // ---> TİP DÖNÜŞÜMÜ ‼️✅


        // Setlerden Hashset
        //Listlerden ArrayList
        //((int)Math.random()) gibi...

    }
  /*  public static void kopekSesi(Kopek kopek){
        kopek.ses();
    }
    public static void kediSesi(Kedi kedi){
        kedi.ses();
    }
*/


    public static void hayvanSesi(Hayvan hayvan){
        // buraya hem kedi hem köpek geliyor
           hayvan.ses();
         // havladı ve miyavladı yazıyor

        // Bir class'in nerden geldiğini bulma yöntemi!!!!
        if (hayvan instanceof Kopek)  // instanceof --> Hayvan aslında köpek mi??
            ((Kopek)hayvan).kokladi();
        if (hayvan instanceof Kedi)   // instanceof --> Hayvan aslında kedi mi??
            ((Kedi)hayvan).tirlamadi();


    }
}
