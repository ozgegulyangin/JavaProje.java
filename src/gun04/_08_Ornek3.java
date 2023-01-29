package gun04;

public class _08_Ornek3 {
    public static void main(String[] args) {
        // String olarak verilen 2 adet bağış parasının toplamını bulunuz
        String bagis1="16788769";
        String bagis2="578097065"; // aynı değişken 2 kere kullanılamadığı için intBagis1 -2 diye yazdık
        int intBagis1= Integer.parseInt(bagis1);
        int intBagis2= Integer.parseInt(bagis2);
        int toplam= intBagis1+intBagis2;
        System.out.println("toplam = " + toplam);
    }
}
