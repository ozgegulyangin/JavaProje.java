package gun26._02_Ornek;

public class Person {
    String name;
    String surName;
    int age;


    public void BilgiYazdir() { // static kısmını sildik

        System.out.println("calisan.name = " + name);
        System.out.println("calisan.surName = " + surName);
        System.out.println("calisan.age = " + age);
    }

// 4. yöntem -> toString yazdığımızda yazma yöntemi çıkıyor

    @Override
    public String toString() {
        return name + "\t" + surName + "\t" + age ;


    }
    public void getBirthDay(){
        System.out.println("Doğum Yılı:" + (2022-age));
    }

    public String getBirthDay2(){
       return "Doğum Yılı:" + (2022-age);
    }

    public void getInitials(){
        System.out.println(name.toUpperCase().charAt(0)+"."+
                surName.toUpperCase().charAt(0)+".");




    }
}