package gun29.Soru;

public class Hesap {
    private int yatan = 0;
    private int cekilen = 0;
    private int bakiye = 0;


    void paraYatir(int yatanPara) {
        yatan += yatanPara;
        bakiye += yatanPara;
    }

    void paraCek(int cekilenPara) {
        cekilen -= cekilenPara;
        bakiye -= cekilenPara;


    }

    @Override
    public String toString() {
        return "Hesaba{" +
                "Yatırdığınız miktar=" + yatan +
                ", Çektiğiniz miktar=" + cekilen +
                ", Hesabınızda kalan bakiye=" + bakiye +
                '}';
    }


}
