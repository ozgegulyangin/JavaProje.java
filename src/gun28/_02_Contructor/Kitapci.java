package gun28._02_Contructor;

public class Kitapci {
    // Book class yazınız.fields: name,publishYear,author.
    // 4 adet Consructor ekleyiniz.
    // Kitapların özelliklerini tek bir satırda yazdıran bir metod ekleyiniz.
    // 4 adet kitabı farklı constructor la oluşturup, mainde yazdırınız.


    public static void main(String[] args) {

        Book kitap1=new Book();
        kitap1.name="Harry Potter";
        kitap1.publishYear=1997;
        kitap1.author="J.K.Rowling";

        Book kitap2=new Book("Serenad",2014,"Zülfü Livaneli");

        Book kitap3=new Book("Nutuk","Atatürk");

        Book kitap4=new Book("ÖzgeG",1993);

        System.out.println("kitap1 = " + kitap1);
        System.out.println("kitap2 = " + kitap2);
        System.out.println("kitap3 = " + kitap3);
        System.out.println("kitap4 = " + kitap4);

    }
}
