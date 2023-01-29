package gun32.Ornek;

import java.util.Scanner;

public class OkulMain {
    //  1- fieldları ad, soyad, yas olan bir Ogrenci sınıfı tanımlayınız.
    //  2- Ogrenci sınıfına ad, soyad  ve yas dan oluşan bir consructor tanımlayınız.
    //  3- Bütün fieldlar için encapsulation uygulayınız.
    //  4- okul isimli bir class tanımlayınız, fieldları okulAd, kontenjan,
    //     ArrayList cinsinden Öğrencileri olsun.
    //  5- main metodunun olduğu OkulMain isimli bir sınıf oluşturunuz.
    //  6- bir okul nesnesi oluşturup, bu okula max öğrenci miktarına ulaşana kadar kullanıcıdan alarak
    //     öğrenci ekleyiniz. Fakat oluşturacağınız öğrencilerin yaşı 15 i geçmemeli.
    //     bu yaşı geçen bir öğrenci eklenmek istenir ise yerine başka öğrenci isteyiniz.
    //  7- Öğrencilerin hepsine eşsiz bir ID ataması yapınız.

    public static void main(String[] args) {

        Scanner okuInt=new Scanner(System.in);
        Scanner okuStr=new Scanner(System.in);

        Okul yeniOkul=new Okul("Atatürk Okulu",3);  // kontenjana 3 dedik kolay kontrol etmek için


        do {

            System.out.print("Öğrencinin Adı:");String ad=okuStr.nextLine();
            System.out.print("Öğrencinin Soyadı:"); String soyad=okuStr.nextLine();
            System.out.print("Öğrencinin yaşı:"); int yas=okuInt.nextInt();
            if(yas<15){
                Ogrenci ogr=new Ogrenci(ad,soyad,yas);
                yeniOkul.getOgrenciler().add(ogr);


            }else {
                System.out.println("Öğrencinin yaşı okul için uygun değil.");
            }



        }while (yeniOkul.getOgrenciler().size()<yeniOkul.getKontenjan()); // kontenjanı kontrol ediyor

        System.out.println("Öğrenciler = " + yeniOkul.getOgrenciler());
    }

}
