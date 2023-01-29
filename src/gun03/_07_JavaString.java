package gun03;

public class _07_JavaString {
    public static void main(String[] args) {
        String ad = "Özge"; // Kelime veya kelimeleri saklamak için kullanılır
        // sınırlarını "" karakteri ile belirlenir
        String soyad = "Gül Yangın";
        System.out.println("ad ="+ad);
        System.out.println("soyad ="+soyad);
        // veya
        System.out.println("ad ve soyad =" +ad+"\t"+soyad);
        // +'lar burada stringler arasında olduğu için birleştirir sayı olsa toplardı.
        // veya
        System.out.println("ad ve soyad=" + ad + " " + soyad);

        String tamAd="Özge"+" "+"Yangın";
        System.out.println("tamAd = " + tamAd);

    }
}
