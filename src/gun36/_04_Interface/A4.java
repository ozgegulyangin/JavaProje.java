package gun36._04_Interface;

public class A4 implements IYazdirir,IGosterir{

    @Override
    public void Goster() {
        System.out.println("Gösterdi");
    }

    @Override
    public void Yazdir() {
        System.out.println("Yazdır");

    }
}
