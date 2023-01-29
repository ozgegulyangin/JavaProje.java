package gun08;

public class _02_JavaArithmeticOperators {
    public static void main(String[] args) {
        int sayac=0;

        sayac= sayac+1; // sayacın değerini 1 tane arttırıyor  :1
        sayac++;       // bu da sayacı 1 arttırmanın kısa yolu :2
        ++sayac;       // bu da sayacı 1 arttırır              :3
        // 3ü aynı işi yapıyor.

        sayac= sayac-1;  // sayacın değerini 1 azaltır         :2
        sayac--;         // sayacın değerini 1 azaltır         :1
        --sayac;         // sayacın değerini 1 azaltır         :0

        System.out.println("sayac = " + sayac);

        /*******************************************/
        int toplam=5+sayac;  // sonuc=5
        System.out.println("toplam = " + toplam); //5
        System.out.println("sayac = " + sayac);  //0

        toplam= 5+ sayac++; //  toplam= 5+ sayac ve sayac= sayac+1 olur sonuc=5 olur
        // işlemden sonra sayac 1 artar
        System.out.println("toplam = " + toplam); //5
        System.out.println("sayac = " + sayac); //1
       
        toplam= 5+ ++sayac; // toplam= sayac+1+5 olur   -> sonuc=7
        // önce sayac 1 artar sonra işlem yapılır
        System.out.println("toplam = " + toplam); //7
        System.out.println("sayac = " + sayac); //2

        // ÖZET : ++ lar solda ise önce artış sonra işlem
        //        ++ lar sağda ise önce işlem sonra artış
        





    }
}
