package gun35._02_Polymorphism;

public class Kedi extends Hayvan{
    public Kedi(String name) {
        super(name);

    }

    @Override
    public void ses() {
        System.out.println("Miyavladı");
    }

    public void tirlamadi(){
        System.out.println("Tırmaladı");
    }
}
