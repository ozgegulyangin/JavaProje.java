package gun29._03_Protected.bir;

import javax.print.Doc;

public class HastaneIstanbul {
    public static void main(String[] args) {
        Doctor doc1=new Doctor();
        doc1.adi="Özge";
        doc1.bolumu="Kalp ve Damar Cerrahisi";
        doc1.hastaneAdi="İstanbıl Hastanesi";

        // doc1. SicilNo çıkmıyor çünkü PRİVATE tanımladık

        Doctor doc2=new Doctor("Celal");





    }
}
