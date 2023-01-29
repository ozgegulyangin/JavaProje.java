package gun39._05_OOP_Soru;

public class AdanaKebap extends TechnoKitchen implements IFood{
    @Override
    public void Taste() {
        System.out.println("Adana'nın en iyisi bizde.Afiyet olsun.");

    }

    @Override
    public double ucret() {
        return 55;
    }

     public void marinade() {
        System.out.println("Hazırlanıyor");
    }
    void grill(){
        System.out.println("Izgarada,kızarıyor");
    }
}
