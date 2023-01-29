package gun27._01_Ornek;

public class JavaStaticveNonStaticMetodlar {
    public static void main(String[] args) {
        int sayi=300;

        Utility ut=new Utility();

        // Utility class'tır❕
        // ut  ise bir nesnedir.❕
        // Araba AUDI= new Araba();
        //  Insan Özge= new Insan();

        String strSayi2=ut.getString2(sayi); //1️⃣


        String strSayi=Utility.getString(sayi); //2️⃣


    }
}
