package gun19;

public class _06_JavaMethod {
    public static void main(String[] args) {

        merhabaYaz();// Math.random gibi veri girişi yok çağırınca veri veriyor
        merhabaYazIsme("Özge"); // Math.Abs(-10)
        cokMerhabaYaz(5);
    }

    public static void merhabaYaz() {
        System.out.println("Merhaba Dünya");
        System.out.println("Merhaba Dünya");

    }

    public static void merhabaYazIsme(String isim) {  //( bu parantezin içine bir parametre ekliyoruz int,str vs)
        System.out.println(isim+" merhaba");

    }
    public static void cokMerhabaYaz(int miktar) {
        for (int i = 0; i < miktar; i++) {
            System.out.println("merhaba");
        }

    }




}