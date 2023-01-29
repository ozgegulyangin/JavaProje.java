package gun11;

public class _08_JavaRandom {
    public static void main(String[] args) {
        // Math.Random():  double sayı üretir. 0- 0,999999999 arası üretir.

        double randSayi=Math.random();
        System.out.println("randSayi=" +randSayi);

        // 0-6 arası üretin
        // 6 ile çarpın
        // 0-5,999999
        // int çevirirsem 0-5;

        int rndTamSayi= (int)(Math.random() *6);
        System.out.println("rndTamsayi=" +rndTamSayi);

    }
}
