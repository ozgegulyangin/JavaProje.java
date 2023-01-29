package gun26._02_Ornek;

public class Fabrika {
    public static void main(String[] args) {
// 1- Adım : Person isimli bir class tanımlayınız : name, surname, age
        // 2- Adım : main de 2 tane bu sınıftan nesne oluşturup deger atayınız.
        // 3- Adım : Bu degerlerı yazıdırınız.
        // 4.adım: getBirthYear isminde PErsona ait bir metod yazınız
        // çalıştığında kişinin dpgum yılını versin.
        // 5- Adım : getInitials isminde kişinin adının ilk harfi.soyadının ilk harfi
        //           şeklinde (Büyük harf) veren metodu yazınız. örnek ahmet demir : A.D.





        Person calisan1 = new Person();
        calisan1.name = "Özge";
        calisan1.surName = "Gül Yangın";
        calisan1.age = 29;


        Person calisan2 = new Person();
        calisan2.name = "Celal";
        calisan2.surName = "Yangın";
        calisan2.age = 32;


        //1.yöntem‼️
        System.out.println("calisan1.name = " + calisan1.name);
        System.out.println("calisan1.surName = " + calisan1.surName);
        System.out.println("calisan1 = " + calisan1.age);

        System.out.println("calisan1.name = " + calisan2.name);
        System.out.println("calisan1.surName = " + calisan2.surName);
        System.out.println("calisan1 = " + calisan2.age);
        System.out.println("-------------------");


        //2.yöntem ‼️ Aşağıda method tanımladık
        BilgiYazdir(calisan1);
        BilgiYazdir(calisan2);



        System.out.println("-------------------");
        // 3. yöntem
        calisan1.BilgiYazdir();
        calisan2.BilgiYazdir();

        calisan1.getBirthDay();
        calisan2.getBirthDay();

        System.out.println("-------------------");

        calisan1.getInitials(); // ------> 5. soru
        calisan2.getInitials();//  5.soru
        // 4. yöntem

        System.out.println("calisan1 = " + calisan1);
        System.out.println("calisan2 = " + calisan2);
        // return'lu yöntem
        System.out.println("calisan1.getBirthDay2() = " + calisan1.getBirthDay2());
        System.out.println("calisan2.getBirthDay2() = " + calisan2.getBirthDay2());
    }
    public static void BilgiYazdir(Person calisan){

        System.out.println("calisan.name = " + calisan.name);
        System.out.println("calisan.surName = " + calisan.surName);
        System.out.println("calisan.age = " + calisan.age);
    }

}