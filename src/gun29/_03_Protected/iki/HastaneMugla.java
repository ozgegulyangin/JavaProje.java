package gun29._03_Protected.iki;

import gun29._03_Protected.bir.Doctor;

public class HastaneMugla {
    public static void main(String[] args) {
      //  Doctor doc1=new Doctor();  --> bu şekilde kullanamıyoruz çünkü default

        Doctor doc1=new Doctor("Suay");  // ---> içine ismi vererek kullanabiliyoruz çünkü METODda o şekilde atadık
        doc1.hastaneAdi="Muğla Hastanesi";




    }
}
