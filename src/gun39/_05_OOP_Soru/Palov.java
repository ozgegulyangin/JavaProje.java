package gun39._05_OOP_Soru;

public class Palov implements IFood{
    @Override
    public void Taste() {
        System.out.println("Palov'unuz hazır, afiyet olsun.");

    }

    @Override
    public double ucret() {
        return 44;
    }
    void boil(){
        System.out.println("Haşlanıyor");
    }
    void eatTomorrow(){
        System.out.println("Yarın tüketmenizi tavsiye ederiz.");
    }

}
