package gun32._02_Encapsulation;

public class Araba {
    private String Renk;
    private int Model;
    private double MotorHacmi;
    private int KapiSayisi;

    public Araba(){

    }

    public Araba(String renk, int model, double motorHacmi, int kapiSayisi) {
      setRenk(renk);
      setModel(model);
      setMotorHacmi(motorHacmi);
      setKapiSayisi(kapiSayisi);

      // AÇIK KAPIYI SET İLE KAPATTIK diretk atama yapmasını engelledik
        /*this.Renk = renk;
         this.Model = model;
         this.MotorHacmi = motorHacmi;
         this.KapiSayisi = kapiSayisi;*/
    }

    @Override
    public String toString() {
        return "Araba{" +
                "Renk='" + Renk + '\'' +
                ", Model='" + Model + '\'' +
                ", MotorHacmi=" + MotorHacmi +
                ", KapiSayisi=" + KapiSayisi +
                '}';
    }

    public String getRenk() {
        return Renk;
    }

    public void setRenk(String renk) {
        Renk = renk;
    }

    public int getModel() {
        return Model;
    }
    public void setModel(int model) {
        if (model<=2022)
            Model = model;
        else
            System.out.println("Bu modeli atayamazsınız");
    }

    public double getMotorHacmi() {
        return MotorHacmi;
    }

    public void setMotorHacmi(double motorHacmi) {
        MotorHacmi = motorHacmi;
    }

    public int getKapiSayisi() {
        return KapiSayisi;
    }

    public void setKapiSayisi(int kapiSayisi) {
        if (kapiSayisi > 3)
            KapiSayisi = kapiSayisi;
        else
            System.out.println("Geçersiz bir sayı girdiniz.");
    }
}
